package com.api;

public class EmployeeDto {
    private long id;
    private String name;


    //setter
    public EmployeeDto(long id, String name) {
        this.id = id;
        this.name = name;
}
//getter
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }




}
