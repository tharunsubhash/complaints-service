package com.tharun.complaintsservice.repositories;

import com.tharun.complaintsservice.models.repositorymodels.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByName(String username);
}
