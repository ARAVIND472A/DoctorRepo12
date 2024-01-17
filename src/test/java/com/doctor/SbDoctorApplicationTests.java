package com.doctor;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbDoctorApplicationTests {

	@Test
	void contextLoads() {
	}

	DoctorDAO dao=new DoctorDAO();
	Doctor bean=new Doctor(101,"kumar","neuro","neuro",3);
	

	@Test
	void testDao() {
		String expect="Inserted";
		 String result=dao.insert(bean);
		 assertEquals(expect, result);
		
	}

}
