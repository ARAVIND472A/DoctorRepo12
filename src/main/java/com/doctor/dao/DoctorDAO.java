package com.doctor.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.doctor.pojo.Doctor;

@Repository
public class DoctorDAO {
	
	   static List<Doctor> list;
		
		public static void insert(Doctor bean)
		{
			list=new ArrayList<Doctor>();
			
			list.add(bean);
			
		}
		
		public static  List<Doctor> view()
		{
			return list;
		} 

}
