package com.moisecodes.schoolmis.model;
import  java.time.LocalDateTime;
// School model
public class School {
    private Long id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String principalName;
    private Integer  establishedYear;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    public School(){

    }

    public School( String name, String address, String phone , String email, String principalName, Integer establishedYear) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.principalName = principalName;
        this.establishedYear = establishedYear;



    }
    public School(Long id ,String name, String address, String phone , String email, String principalName, Integer establishedYear,LocalDateTime createdAt,LocalDateTime updatedAt) {
        this(name,address,phone,email,principalName,establishedYear);
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id ) {
        this.id = id ;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void  setAddress(String address) {
        this.address = address;
    }
    public String  getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String  getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPrincipalName() {
        return principalName;
    }
    public void setPrincipalName(String principalName) {
        this.principalName = principalName;

    }
    public Integer  getEstablishedYear() {
        return establishedYear;
    }
    public void setEstablishedYear(Integer  establishedYear) {
        this.establishedYear = establishedYear;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;

    }
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(LocalDateTime updatedAt){
        this.updatedAt = updatedAt;
    }


}
