package Com.pratyusha.Entity;

import org.springframework.beans.factory.annotation.Value;

public class Student {

    @Value("${student.name}")
    private String name;

    @Value("${student.branch}")
    private String branch;

    @Value("${student.address}")
    private String address;

    @Value("${student.hobby}")
    private String hobby;

    public void setHobby(String hobby) { this.hobby = hobby; }
    public void setAddress(String address) { this.address = address; }
    public void setBranch(String branch) { this.branch = branch; }
    public void setName(String name) { this.name = name; }

    public void display() {
        System.out.println("Name of Student: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Address: " + address);
        System.out.println("Hobby is: " + hobby);
    }
}