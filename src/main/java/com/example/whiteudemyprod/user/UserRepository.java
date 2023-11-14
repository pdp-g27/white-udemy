package com.example.whiteudemyprod.user;

import com.example.whiteudemyprod.common.repository.GenericSpecificationRepository;
import com.example.whiteudemyprod.user.entity.User;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends GenericSpecificationRepository<User, UUID> {
}
