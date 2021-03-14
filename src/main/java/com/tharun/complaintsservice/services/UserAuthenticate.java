package com.tharun.complaintsservice.services;

import com.tharun.complaintsservice.models.repositorymodels.User;
import com.tharun.complaintsservice.models.requestmodels.UserValidationRequest;
import com.tharun.complaintsservice.models.resopnsemodels.UserValidationResponse;
import com.tharun.complaintsservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAuthenticate {
    @Autowired
    private UserRepository userRepository;

    public UserValidationResponse getUserIdAfterValidation(UserValidationRequest userValidationRequest) {
        User user = this.userRepository.findByName(userValidationRequest.Username);
        UserValidationResponse userValidationResponse = new UserValidationResponse();
        if(userValidationRequest.Password == user.getPassword()) {
            userValidationResponse.userId = user.userId;
            userValidationResponse.userName=user.getName();
            userValidationResponse.userRole = user.userRole;
            return userValidationResponse;
        }
        return userValidationResponse;
    }
}
