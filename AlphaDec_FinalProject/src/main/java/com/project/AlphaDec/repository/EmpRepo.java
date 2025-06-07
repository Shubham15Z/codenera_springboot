package com.project.AlphaDec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.AlphaDec.model.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer>
{
	public Employee findByEmail(String email);
}
