package com.demo.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.employee.entity.EmployDao;

@Repository
public interface EmployRepository extends CrudRepository<EmployDao, Integer>{

}
