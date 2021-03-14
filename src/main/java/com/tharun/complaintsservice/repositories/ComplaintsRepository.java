package com.tharun.complaintsservice.repositories;

import com.tharun.complaintsservice.models.repositorymodels.Complaint;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ComplaintsRepository extends CrudRepository<Complaint, Integer> {
    List<Complaint> findAllByUserId(int userId);
    Complaint findByComplaintId(int complaintId);
}
