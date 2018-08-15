package com.sj.spring.jpa.springJpa.controller;
import com.sj.spring.jpa.springJpa.model.FirstLoginFlagEnum;
import com.sj.spring.jpa.springJpa.model.UserMaster;
import com.sj.spring.jpa.springJpa.model.UserStatusEnum;
import com.sj.spring.jpa.springJpa.repository.StudentRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
class StudentRegistrationController {
    @Autowired
    private StudentRegistrationRepository studentRegistrationRepository;

    @PostMapping("/studentRegistration")
    public UserMaster createStudentRegistration(@Valid @RequestBody UserMaster studentRegistration) {
    	System.out.println("HI");
        studentRegistration.setFirstLoginFlag(FirstLoginFlagEnum.YES);
        studentRegistration.setStatus(UserStatusEnum.ENABLED);
        //if(studentRegistration.getMPassword().equals(studentRegistration.getPassword())){
            return studentRegistrationRepository.save(studentRegistration);
        /*}
        else
            return "";*/
    }
}
