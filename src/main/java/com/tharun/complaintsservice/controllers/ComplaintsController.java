package com.tharun.complaintsservice.controllers;

import com.tharun.complaintsservice.models.repositorymodels.Complaint;
import com.tharun.complaintsservice.models.requestmodels.UserValidationRequest;
import com.tharun.complaintsservice.models.resopnsemodels.ComplaintRegisterResponse;
import com.tharun.complaintsservice.models.resopnsemodels.UserValidationResponse;
import com.tharun.complaintsservice.services.ComplaintsService;
import com.tharun.complaintsservice.services.UserAuthenticate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/complaints")
public class ComplaintsController {

    @Autowired
    ComplaintsService complaintsService;

    @Autowired
    public UserAuthenticate userAuthenticate;

    @GetMapping()
    public List<Complaint> getAllComplaints(@RequestHeader UserValidationRequest userValidation){
        UserValidationResponse userValidationResponse = this.userAuthenticate.getUserIdAfterValidation(userValidation);
       return complaintsService.getAllComplaints(userValidationResponse.userId);
    }

    @GetMapping("/id/{id}")
    public Optional<Complaint> getComplaintById(@RequestHeader UserValidationRequest userValidation, @PathVariable(name = "id") int id){
        UserValidationResponse userValidationResponse = this.userAuthenticate.getUserIdAfterValidation(userValidation);
        return complaintsService.getComplaintByComplaintId(id);
    }

    @PostMapping()
    public ComplaintRegisterResponse registerNewComplaint(@RequestHeader UserValidationRequest userValidation, @RequestBody Complaint complaint){
        UserValidationResponse userValidationResponse = this.userAuthenticate.getUserIdAfterValidation(userValidation);
        complaint.userId = userValidationResponse.userId;
        return complaintsService.registerComplaint(complaint);
    }
}
