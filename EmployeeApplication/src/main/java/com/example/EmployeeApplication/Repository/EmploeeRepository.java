package com.example.EmployeeApplication.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeApplication.Model.*;

@Repository
public interface EmploeeRepository extends JpaRepository<EmployeeModel, Long>{

}
