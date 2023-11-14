package com.example.whiteudemyprod.group.dto;

import com.example.whiteudemyprod.group.typs.Group_Status;
import com.example.whiteudemyprod.group.typs.Group_Type;
import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BaseDto {

    private String name;
    private UUID mentor_id;
    private Group_Type type;
    private Group_Status status;
}
