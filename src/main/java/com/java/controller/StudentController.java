package com.java.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.model.Students;
import com.java.service.StudentService;
//mark class as Controller
@RestController
public class StudentController 
{
//autowire the StudentService class
@Autowired
StudentService studentService;
//creating a get mapping that retrieves all the books detail from the database 
@GetMapping("/Students")
private List<Students> getAllStudents() 
{
return studentService.getAllStudents();
}
//creating a get mapping that retrieves the detail of a specific book
@GetMapping("/Students/{studentid}")
private Students getBooks(@PathVariable("studentId") int studentId) 
{
return studentService.getStudentById(studentId);
}
//creating a delete mapping that deletes a specified book
@DeleteMapping("/Students/{studentid}")
private void deleteStudent(@PathVariable("studentid") int studentid) 
{
studentService.delete(studentid);
}
//creating post mapping that post the Student detail in the database
@PostMapping("/Students")
private int saveStudent(@RequestBody Students students) 
{
studentService.saveOrUpdate(students);
return students.getStudentId();
}
//creating put mapping that updates the book detail 
@PutMapping("/Students")
private Students update(@RequestBody Students students) 
{
studentService.saveOrUpdate(students);
return students;
}
}
