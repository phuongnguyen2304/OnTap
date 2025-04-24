package com.example.ontap.Bai10;

public class ClientInfo {
    private String fullName;
    private String email;
    private String phone;
    private String city;

    public ClientInfo() {
    }

    public ClientInfo(String fullName, String email, String phone, String city) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.city = city;
    }

    // Getters & Setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
