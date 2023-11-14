package com.example.whiteudemyprod.group;

import com.example.whiteudemyprod.common.repository.GenericSpeficationReposiztory;
import com.example.whiteudemyprod.group.entity.Group;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GroupRepository extends GenericSpeficationReposiztory<Group,UUID> {

}
