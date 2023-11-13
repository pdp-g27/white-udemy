package com.example.whiteudemyprod.group;

import com.example.whiteudemyprod.group.dto.GroupResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/group")
@RestController
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;


   /* @PostMapping("/save")
    public ResponseEntity<GroupResponseDto> save(@RequestBody GroupRequestDto groupRequestDto) {
        // try {
        GroupResponseDto groupResponseDto = groupService.create(groupRequestDto);
        return ResponseEntity.ok(groupResponseDto);
        //  } catch (Exception e) {
        //    return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        //   }
    }*/

    @GetMapping("/getAll")
    public List<GroupResponseDto> getAll() {
        return groupService.getAll();
    }

    @GetMapping("/findById/{groupId}")
    public GroupResponseDto findById(@PathVariable UUID groupId) {
        return groupService.findById(groupId);
    }

    @DeleteMapping("/delete/{groupId}")
    public GroupResponseDto delete(@PathVariable UUID groupId) {
        return groupService.deleteById(groupId);
    }

  /*  @PutMapping("/update/{groupId}")
    public GroupResponseDto update(@RequestBody GroupRequestDto requestDto,
                                   @PathVariable UUID groupId) {
        return groupService.update(requestDto, groupId);
    }
*/


}



