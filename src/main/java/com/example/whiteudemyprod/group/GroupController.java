package com.example.whiteudemyprod.group;

import com.example.whiteudemyprod.group.dto.GroupCreateDto;
import com.example.whiteudemyprod.group.dto.GroupResponseDto;
import com.example.whiteudemyprod.group.dto.GroupUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/group")
@RestController
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;


    @PostMapping("/save")
    public ResponseEntity<GroupResponseDto> save(@RequestBody GroupCreateDto groupCreateDto) {
        GroupResponseDto groupResponseDto = groupService.create(groupCreateDto);
        return ResponseEntity.ok(groupResponseDto);
    }

    @GetMapping("/getAll")
    public ResponseEntity<Page<GroupResponseDto>> getAll(Pageable pageable,
                                                         @RequestParam(required = false) String predicate) {
        Page<GroupResponseDto> all = groupService.getAll(pageable, predicate);
        return ResponseEntity.ok(all);
    }

    @GetMapping("/findById/{groupId}")
    public ResponseEntity<GroupResponseDto> findById(@PathVariable UUID groupId) {
        GroupResponseDto responseDto = groupService.findById(groupId);
        return ResponseEntity.ok(responseDto);
    }

    @DeleteMapping("/delete/{groupId}")
    public ResponseEntity<?> delete(@PathVariable UUID groupId) {
        groupService.deleteById(groupId);
        return ResponseEntity.ok("DELETE SUCCESS");
    }

    @PutMapping("/update/{groupId}")
    public GroupResponseDto update(@RequestBody GroupUpdateDto updateDto,
                                   @PathVariable UUID groupId) {
        return groupService.update(updateDto, groupId);
    }


}



