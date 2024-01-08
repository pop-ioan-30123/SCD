package com.utcn.employeeapplication.department;
import com.utcn.employeeapplication.employee.Employee;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer departmentID;

    public Integer getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Integer departmentID) {
        this.departmentID = departmentID;
    }

    private String departmentName;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "parent_id")
    private Integer parentID;

    public Integer getParentID() {
        return parentID;
    }

    public void setParentID(Integer parentID) {
        this.parentID = parentID;
    }

    @Column(name = "manager_id")
    private Integer managerID;

    public Integer getManagerID() {
        return managerID;
    }

    public void setManagerID(Integer managerID) {
        this.managerID = managerID;
    }

    @Column(name = "established_date")
    private Integer establishedDate;

    public Integer getEstablishedDate() {
        return establishedDate;
    }

    public void setEstablishedDate(Integer establishedDate) {
        this.establishedDate = establishedDate;
    }

    @Column(name = "location", nullable = false)
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Department(String departmentName, String description, Integer parentID, Integer managerID, Integer establishedDate, String location) {
        this.departmentName = departmentName;
        this.description = description;
        this.parentID = parentID;
        this.managerID = managerID;
        this.establishedDate = establishedDate;
        this.location = location;
    }

    public Department() {

    }
}
