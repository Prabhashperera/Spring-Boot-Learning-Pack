package org.example.dto;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;

public class UserDto {
    private String uId;
    private String uName;
    private String uAddress;
    private City city;

    public UserDto() {
    }

    public UserDto(String uId, String uName, String uAddress, City city) {
        this.uId = uId;
        this.uName = uName;
        this.uAddress = uAddress;
        this.city = city;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "uId='" + uId + '\'' +
                ", uName='" + uName + '\'' +
                ", uAddress='" + uAddress + '\'' +
                ", city=" + city +
                '}';
    }
}
