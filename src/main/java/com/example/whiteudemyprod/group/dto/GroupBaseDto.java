package com.example.whiteudemyprod.group.dto;

import com.example.whiteudemyprod.group.entity.GroupType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupBaseDto {
    private String name;
    private GroupType groupType;
}
