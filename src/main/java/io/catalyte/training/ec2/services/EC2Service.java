package io.catalyte.training.ec2.services;

import io.catalyte.training.ec2.models.EC2;

import java.util.List;

public interface EC2Service {

    List<EC2> getCustomers(EC2 ec2);
}
