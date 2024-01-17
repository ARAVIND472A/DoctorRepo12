package com.doctor.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.doctor.pojo.Doctor;

class DoctorDAOTest {
	
	DoctorDAO dao=new DoctorDAO();
	Doctor bean=new Doctor(101,"kumar","neuro","neuro",3);
	

	@Test
	void testDao() {
		String expect="Inserted";
		 String result=dao.insert(bean);
		 assertEquals(expect, result);
		
	}

}
