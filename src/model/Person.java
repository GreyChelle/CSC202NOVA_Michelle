package model;

import java.io.Serializable;


public class Person implements Serializable{
    private String firstName;
    private String lastName;
    private String dob;
    private String gender;
    private String ssn;

    public Person() {
        this.firstName = "Mishka";
        this.lastName = "Harper";
        this.dob = "10/1/1990";
        this.gender = "female";
        this.ssn = "666-66-6666";
    }
    public Person(String firstName, String lastName, String dob, String ssn, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.ssn = ssn;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", ssn='" +ssn + '\'' +'}';
    }
}
