package com.example.studentinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentinfo.exception.StudentNotFoundException;
import com.example.studentinfo.model.Student;
import com.example.studentinfo.repository.StudentRepository;

@Service
public class StudentService {
	 @Autowired
	    private StudentRepository repo;

	    public Student addStudent(Student student) {
	        return repo.save(student);
	    }

	    public List<Student> getAllStudents() {
	        return repo.findAll();
	    }

	    public Student getStudentById(Long id) {
	        return repo.findById(id)
	                .orElseThrow(() -> new StudentNotFoundException("Student not found with id: " + id));
	    }

	    public Student updateStudent(Long id, Student student) {
	        Student existing = getStudentById(id);
	        existing.setFirstName(student.getFirstName());
	        existing.setLastName(student.getLastName());
	        existing.setEmail(student.getEmail());
	        existing.setCourse(student.getCourse());
	        existing.setAge(student.getAge());
	        return repo.save(existing);
	    }

	    public void deleteStudent(Long id) {
	        Student existing = getStudentById(id);
	        repo.delete(existing);
	    }
}
