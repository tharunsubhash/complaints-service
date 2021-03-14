package com.tharun.complaintsservice.controllers;

import com.tharun.complaintsservice.services.ComplaintsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/complaints")
public class ComplaintsController {

    @Autowired
    ComplaintsService complaintsService;

    @GetMapping()
    public void getAllComplaints(){
        complaintsService.getAllComplaints();
    }

    @GetMapping("/id/{id}")
    public void getComplaintById(){

    }

    @PostMapping()
    public void registerNewComplaint(){

    }
}
