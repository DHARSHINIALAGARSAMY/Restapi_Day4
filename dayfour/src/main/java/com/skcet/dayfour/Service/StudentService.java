package com.skcet.dayfour.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skcet.dayfour.Model.StudentModel;
import com.skcet.dayfour.Repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo stu;
	
	public List<StudentModel> saveinfo(List<StudentModel> st)
	{
		return (List<StudentModel>)stu.saveAll(st);
	}
	
	public List<StudentModel> showinfo()
	{
		return stu.findAll();
	}
	
	public StudentModel changeinfo(StudentModel st)
	{
		return stu.saveAndFlush(st);
	}
	
	public void deleteinfo(StudentModel st)
	{
		stu.delete(st);
	}
	
}
