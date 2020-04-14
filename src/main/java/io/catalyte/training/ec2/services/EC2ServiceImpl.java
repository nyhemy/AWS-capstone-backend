package io.catalyte.training.ec2.services;

import io.catalyte.training.ec2.models.EC2;
import io.catalyte.training.ec2.repositories.EC2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EC2ServiceImpl implements EC2Service {

    @Autowired
    private EC2Repository ec2Repository;

    @Override
    public List<EC2> getCustomers(EC2 ec2) {

        return ec2Repository.findAll(Example.of(ec2));

    }
}
