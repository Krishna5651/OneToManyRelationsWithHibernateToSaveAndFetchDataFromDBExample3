/**
 * Created By Krishna Shinde
 * Date : 30-06-2023
 * Time : 11:50
 * Project: OneToManyRelationalMappingWithHibernateSaveAndFetch
 **/

package com.mahagan.onetomany.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String employee_Name;
    private String employee_Location;
    private String employee_Age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployee_Name() {
        return employee_Name;
    }

    public void setEmployee_Name(String employee_Name) {
        this.employee_Name = employee_Name;
    }

    public String getEmployee_Location() {
        return employee_Location;
    }

    public void setEmployee_Location(String employee_Location) {
        this.employee_Location = employee_Location;
    }

    public String getEmployee_Age() {
        return employee_Age;
    }

    public void setEmployee_Age(String employee_Age) {
        this.employee_Age = employee_Age;
    }
}


