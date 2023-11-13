package com.example.whiteudemyprod.user.dto;

import com.example.whiteudemyprod.user.entity.UserType;
import lombok.Data;

@Data
public class UserUpdateDto {
    private String firstName;
    private String lastName;
    private String middleName;
    private UserType userType;
    private String phoneNumber;
    private String email;
    private String password;
}
