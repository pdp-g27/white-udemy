package com.example.whiteudemyprod.common.service;

import com.example.whiteudemyprod.common.mapper.GenericDtoMapper;
import com.example.whiteudemyprod.common.repository.GenericSpeficationReposiztory;
import com.example.whiteudemyprod.common.rsql.SpecificationBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;


public abstract class GenericCrudService<ENTITY, ID, CREATE_DTO, RESPONSE_DTO, UPDATE_DTO> {

    protected abstract GenericSpeficationReposiztory<ENTITY, ID> getRepository();

    protected abstract GenericDtoMapper<ENTITY, CREATE_DTO, UPDATE_DTO, RESPONSE_DTO> getMapper();

    public RESPONSE_DTO create(CREATE_DTO createDto) {
        ENTITY entity = getMapper().toEntity(createDto);
        entity = getRepository().save(entity);
        return getMapper().toResponseDto(entity);
    }

    public Page<RESPONSE_DTO> getAll(Pageable pageable, String predicate) {

        Specification<ENTITY> build = SpecificationBuilder.build(predicate);
        if (build == null) {
            return getRepository()
                    .findAll(pageable)
                    .map(entity -> getMapper().toResponseDto(entity));
        }
        return getRepository()
                .findAll(build, pageable)
                .map(entity -> getMapper().toResponseDto(entity));
    }

    public RESPONSE_DTO findById(ID id) {
        ENTITY entity = getRepository().findById(id).orElseThrow();
        return getMapper().toResponseDto(entity);
    }


    public void deleteById(ID id) {
        getRepository().deleteById(id);
    }

    public RESPONSE_DTO update(UPDATE_DTO updateDto, ID id) {
        ENTITY entity = getRepository().findById(id).orElseThrow();
        getMapper().update(updateDto, entity);
        entity = getRepository().save(entity);
        return getMapper().toResponseDto(entity);
    }

}
