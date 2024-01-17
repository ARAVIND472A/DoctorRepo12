package com.doctor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.doctor.dao.DoctorDAO;
import com.doctor.pojo.Doctor;


public class DMSController {
	
	@Autowired
	DoctorDAO dao;
	
	public void performInsert(Doctor bean)
	{
		dao.insert(bean);
		System.out.println("Inserted");
		List <Doctor> list=dao.view();
		System.out.println(list);
	}

}
