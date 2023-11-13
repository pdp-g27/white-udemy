package com.example.whiteudemyprod.user.dto;

import com.example.whiteudemyprod.user.entity.UserType;
import lombok.Data;

import java.util.UUID;

@Data
public class UserCreateDto {
    private UUID id;
    private String firstName;
    private String lastName;
    private String middleName;
    private UserType userType;
    private String phoneNumber;
    private String email;
    private String password;
}
