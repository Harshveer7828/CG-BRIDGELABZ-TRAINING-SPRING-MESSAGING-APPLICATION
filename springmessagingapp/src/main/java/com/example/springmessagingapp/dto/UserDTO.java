package com.example.springmessagingapp.dto;

public class UserDTO {
    private String firstName;
    private String lastName;

    // Constructor
    public UserDTO(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Public getter setter
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
