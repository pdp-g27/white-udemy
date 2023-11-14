package com.example.whiteudemyprod.user;

import com.example.whiteudemyprod.common.service.GenericDtoMapper;
import com.example.whiteudemyprod.user.dto.UserCreateDto;
import com.example.whiteudemyprod.user.dto.UserResponseDto;
import com.example.whiteudemyprod.user.dto.UserUpdateDto;
import com.example.whiteudemyprod.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserDtoMapper extends GenericDtoMapper<User, UserCreateDto, UserUpdateDto, UserResponseDto> {
    private final ModelMapper mapper;

    @Override
    public User toEntity(UserCreateDto userCreateDto) {
        return mapper.map(userCreateDto, User.class);
    }

    @Override
    public UserResponseDto toResponseDto(User user) {
        return mapper.map(user, UserResponseDto.class);
    }

    @Override
    public void update(UserUpdateDto updateDto, User user) {
        mapper.map(updateDto, user);
    }
}
