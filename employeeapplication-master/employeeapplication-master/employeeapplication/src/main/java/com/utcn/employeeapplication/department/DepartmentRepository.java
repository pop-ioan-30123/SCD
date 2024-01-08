package com.utcn.employeeapplication.department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    Department findByLocation(String location);

    Department findByEstablishedDate(Integer establishedDate);

    //Department findByName(String name);
}
