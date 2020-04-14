package io.catalyte.training.ec2.controllers;

import io.catalyte.training.ec2.models.EC2;
import io.catalyte.training.ec2.services.EC2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/ec2")
public class EC2Controller {

    @Autowired
    private EC2Service ec2Service;

    /**
     * Calls the service to retrieve ec2.
     *
     * @return a list of all ec2
     */
    @GetMapping
    public ResponseEntity<List<EC2>> getEC2(EC2 ec2) {
        return new ResponseEntity<>(ec2Service.getCustomers(ec2), HttpStatus.OK);
    }
}
