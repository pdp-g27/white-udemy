package com.example.whiteudemyprod.user;

import com.example.whiteudemyprod.common.service.GenericCrudService;
import com.example.whiteudemyprod.user.dto.UserCreateDto;
import com.example.whiteudemyprod.user.dto.UserResponseDto;
import com.example.whiteudemyprod.user.dto.UserUpdateDto;
import com.example.whiteudemyprod.user.entity.User;
import jakarta.transaction.Transactional;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
@Getter
public class UserService extends GenericCrudService<User, UUID, UserCreateDto, UserUpdateDto, UserResponseDto> {
    private final UserDtoMapper mapper;
    private final UserRepository repository;
}
