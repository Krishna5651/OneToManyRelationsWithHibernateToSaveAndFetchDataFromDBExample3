/**
 * Created By Krishna Shinde
 * Date : 30-06-2023
 * Time : 11:50
 * Project: OneToManyRelationalMappingWithHibernateSaveAndFetch
 **/

package com.mahagan.onetomany.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String company_Name;
    private String company_Location;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cid")
    @OrderColumn(name = "type")
    private List<Employees> employees;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany_Name() {
        return company_Name;
    }

    public void setCompany_Name(String company_Name) {
        this.company_Name = company_Name;
    }

    public String getCompany_Location() {
        return company_Location;
    }

    public void setCompany_Location(String company_Location) {
        this.company_Location = company_Location;
    }

    public List<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employees> employees) {
        this.employees = employees;
    }
}


