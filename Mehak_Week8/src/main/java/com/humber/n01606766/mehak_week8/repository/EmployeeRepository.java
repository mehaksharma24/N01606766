package com.humber.n01606766.mehak_week8.repository;

import com.humber.n01606766.mehak_week8.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
