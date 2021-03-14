package com.tharun.complaintsservice.models.resopnsemodels;

import com.tharun.complaintsservice.models.repositorymodels.Complaint;
import lombok.Data;

import java.util.List;

@Data
public class AllComplaints {
    public List<Complaint> allComplaints;
}
