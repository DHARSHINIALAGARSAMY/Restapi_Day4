package com.skcet.dayfour.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skcet.dayfour.Model.StudentModel;
import com.skcet.dayfour.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ster;
	
	@PostMapping("addemp")
	public List<StudentModel> add(@RequestBody List<StudentModel> st)
	{
		return ster.saveinfo(st);
	}
	
	@GetMapping("show")
	public List<StudentModel> show()
	{
		return ster.showinfo();
	}
	
	@PutMapping("update")
	public StudentModel modify(@RequestBody StudentModel st)
	{
		return ster.changeinfo(st);
	}
	
	@DeleteMapping("dlt")
	public String del(@RequestBody StudentModel st)
	{
		ster.deleteinfo(st);
		return "Deleted Successfully";
	}
}
