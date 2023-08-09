package com.neo.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neo.app.entities.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
