package com.example.whiteudemyprod.group;

import com.example.whiteudemyprod.common.service.GenericCrudService;
import com.example.whiteudemyprod.group.dto.GroupCreateDto;
import com.example.whiteudemyprod.group.dto.GroupResponseDto;
import com.example.whiteudemyprod.group.dto.GroupUpdateDto;
import com.example.whiteudemyprod.group.entity.Group;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
@RequiredArgsConstructor
@Getter
public class GroupService extends GenericCrudService<Group, UUID, GroupCreateDto, GroupResponseDto, GroupUpdateDto> {

    private final GroupDtoMapper mapper;

    private final GroupRepository repository;


}
