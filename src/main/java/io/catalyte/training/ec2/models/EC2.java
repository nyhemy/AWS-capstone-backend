package io.catalyte.training.ec2.models;

import javax.persistence.*;

@Entity
@Table(name = "ec2")
public class EC2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ec2Id;

    private String name;

    private String type;

    private String status;

    public EC2() {
    }

    public EC2(String name, String type, String status) {
        this.name = name;
        this.type = type;
        this.status = status;
    }

    public Long getEc2Id() {
        return ec2Id;
    }

    public void setEc2Id(Long ec2Id) {
        this.ec2Id = ec2Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
