package io.catalyte.training.ec2.data;


import io.catalyte.training.ec2.models.EC2;
import io.catalyte.training.ec2.repositories.EC2Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * This class runs after the server starts and executes methods that load initial datasets into the
 * db Using this only for the example project
 */
@Component
public class DataLoader implements CommandLineRunner {

  private final Logger logger = LoggerFactory.getLogger(DataLoader.class);

  @Autowired
  private EC2Repository ec2Repository;

  private EC2 ec2One;
  private EC2 ec2Two;
  private EC2 ec2Three;

  @Override
  public void run(String... strings) throws Exception {
    logger.info("Loading data...");

    loadEc2();

    logger.info("Data load complete");
  }

  private void loadEc2() {
    ec2One = ec2Repository.save(new EC2("ClientPortal", "c5.large", "Running"));
    ec2Two = ec2Repository.save(new EC2("TrainingPortal", "m5.metal", "Running"));
    ec2Three = ec2Repository.save(new EC2("Dashboard", "t2.nano", "Stopped"));
  }

}
