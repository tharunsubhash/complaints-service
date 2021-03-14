package com.tharun.complaintsservice.models.requestmodels;

import lombok.Data;

@Data
public class UserValidationRequest {
    public String Username;
    public String Password;
}
