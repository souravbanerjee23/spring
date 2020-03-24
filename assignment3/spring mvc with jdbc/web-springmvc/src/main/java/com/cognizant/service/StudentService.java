package com.cognizant.service;

import java.util.List;

import com.cognizant.model.Student;

public interface StudentService {
	public String insert(Student s);

	public String update(Student s);

	public String delete(int id);

	public List<Student> getAll();
}
