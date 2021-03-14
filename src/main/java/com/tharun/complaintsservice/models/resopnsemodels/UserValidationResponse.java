package com.tharun.complaintsservice.models.resopnsemodels;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class UserValidationResponse {
    public int userId;
    public String userName;
    public String userRole;
}
