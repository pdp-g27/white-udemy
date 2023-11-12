package com.example.whiteudemyprod.group;

import com.example.whiteudemyprod.group.dto.GroupResponseDto;
import com.example.whiteudemyprod.group.entity.Group;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class GroupService {

    private final GroupRepository groupRepository;

    private final ModelMapper mapper = new ModelMapper();


/*    public GroupResponseDto create(GroupRequestDto groupRequestDto) {
        Group group = mapper.map(groupRequestDto, Group.class);
        group = groupRepository.save(group);

        return mapper.map(group, GroupResponseDto.class);
    }*/

    public List<GroupResponseDto> getAll() {
        List<Group> all = groupRepository.findAll();
        return all.stream().map(group -> mapper.map(group, GroupResponseDto.class)).toList();
    }


    public GroupResponseDto findById(UUID id) {
        Optional<Group> byId = groupRepository.findById(id);
        return mapper.map(byId, GroupResponseDto.class);
    }

    public GroupResponseDto deleteById(UUID id) {
        groupRepository.deleteById(id);
        return null;
    }



  /*  public GroupResponseDto update(GroupRequestDto requestDto, UUID id) {
        Group group = groupRepository.findById(id).get();
        mapper.map(requestDto, group);
        group = groupRepository.save(group);
        return mapper.map(group, GroupResponseDto.class);
    }
*/
}
