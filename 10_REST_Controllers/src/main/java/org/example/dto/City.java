package org.example.dto;

public class City {
    private String name;
    private String code;

    public City(String name, String code) {
        this.name = name;
        this.code = code;
    }
    public City() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
