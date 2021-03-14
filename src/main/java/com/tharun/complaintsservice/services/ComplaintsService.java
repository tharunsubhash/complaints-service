package com.tharun.complaintsservice.services;

import com.tharun.complaintsservice.models.repositorymodels.Complaint;
import com.tharun.complaintsservice.models.resopnsemodels.ComplaintRegisterResponse;
import com.tharun.complaintsservice.repositories.ComplaintsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import lombok.Builder;

@Service
public class ComplaintsService {

    @Autowired
    public ComplaintsRepository complaintsRepository;

    public List<Complaint> getAllComplaints(int userId) {
        return this.complaintsRepository.findAllByUserId(userId);
    }

    public Optional<Complaint> getComplaintByComplaintId(int id) {
        return this.complaintsRepository.findById(id);
    }

    public ComplaintRegisterResponse registerComplaint(Complaint complaint) {
        Complaint registeredComplaint = this.complaintsRepository.save(complaint);
        ComplaintRegisterResponse complaintRegisterResponse = new ComplaintRegisterResponse();
        complaintRegisterResponse.complaintId = registeredComplaint.complaintId;
        complaintRegisterResponse.dateCreated = registeredComplaint.dateCreated;
        return complaintRegisterResponse;
    }
}
