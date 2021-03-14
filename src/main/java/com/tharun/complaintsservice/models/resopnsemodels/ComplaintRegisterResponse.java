package com.tharun.complaintsservice.models.resopnsemodels;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ComplaintRegisterResponse {
    public int complaintId;
    public int dateCreated;
}
