package com.example.whiteudemyprod.group;

import com.example.whiteudemyprod.common.mapper.GenericDtoMapper;
import com.example.whiteudemyprod.group.dto.GroupCreateDto;
import com.example.whiteudemyprod.group.dto.GroupResponseDto;
import com.example.whiteudemyprod.group.dto.GroupUpdateDto;
import com.example.whiteudemyprod.group.entity.Group;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GroupDtoMapper extends GenericDtoMapper<Group, GroupCreateDto, GroupUpdateDto, GroupResponseDto> {

    private final ModelMapper mapper ;

    @Override
    public Group toEntity(GroupCreateDto groupCreateDto) {
        return mapper.map(groupCreateDto, Group.class);
    }

    @Override
    public void update(GroupUpdateDto updateDto, Group group) {
        mapper.map(updateDto, group);
    }

    @Override
    public GroupResponseDto toResponseDto(Group group) {
        return mapper.map(group, GroupResponseDto.class);
    }
}
