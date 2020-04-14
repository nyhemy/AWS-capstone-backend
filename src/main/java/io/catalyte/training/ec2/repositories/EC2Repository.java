package io.catalyte.training.ec2.repositories;

import io.catalyte.training.ec2.models.EC2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EC2Repository extends JpaRepository<EC2, Long> {
}
