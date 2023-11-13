package com.example.whiteudemyprod.group.dto;

import com.example.whiteudemyprod.group.typs.Group_Status;
import com.example.whiteudemyprod.group.typs.Group_Type;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GroupResponseDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;


    private String name;

    private UUID mentor_id;

    private LocalDate start_date;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private Group_Type type;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Group_Status status;

}
