package com.demo.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.employee.entity.EmployDao;
import com.demo.employee.repo.EmployRepository;

@Service
public class EmployService {

	@Autowired
	EmployRepository employRepository;

	public void saveEmploy(EmployDao emp) {
		try {
			employRepository.save(emp);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void patchEmploy(Integer empId, EmployDao emp) {
		// TODO Auto-generated method stub
		employRepository.save(emp);
	}
}
