package com.tharun.complaintsservice.repositories;

import com.tharun.complaintsservice.models.repositorymodels.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepository extends CrudRepository<User, String> {
}
