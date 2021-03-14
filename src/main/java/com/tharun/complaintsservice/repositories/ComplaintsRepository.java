package com.tharun.complaintsservice.repositories;

import com.tharun.complaintsservice.models.repositorymodels.Complaint;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface ComplaintsRepository extends CrudRepository<Complaint, String> {
}
