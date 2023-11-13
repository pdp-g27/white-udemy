package com.example.whiteudemyprod.group.entity;

import com.example.whiteudemyprod.group.typs.Group_Status;
import com.example.whiteudemyprod.group.typs.Group_Type;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "`group`")
public class Group {

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
