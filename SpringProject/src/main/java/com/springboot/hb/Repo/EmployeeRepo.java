package com.springboot.hb.Repo;

import org.springframework.data.repository.CrudRepository;

import com.springboot.hb.model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer>{

}
