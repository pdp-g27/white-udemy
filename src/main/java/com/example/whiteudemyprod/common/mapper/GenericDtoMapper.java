package com.example.whiteudemyprod.common.mapper;


public abstract class GenericDtoMapper<ENTITY,CREATE_DTO,UPDATE_DTO,RESPONSE_DTO>{

    public abstract ENTITY toEntity (CREATE_DTO createDto);
    public abstract void update (UPDATE_DTO updateDto,ENTITY entity);
    public abstract RESPONSE_DTO toResponseDto (ENTITY entity);


}
