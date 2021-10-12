package com.java.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.model.Students;
import com.java.repository.StudentRepository;
//defining the business logic
@Service
public class StudentService
{
@Autowired
StudentRepository studentRepository;
//getting all books record by using the method findaAll() of CrudRepository
public List<Students> getAllStudents() 
{
List<Students> books = new ArrayList<Students>();
studentRepository.findAll().forEach(books1 -> books.add(books1));
return books;
}
//getting a specific record by using the method findById() of CrudRepository
public Students getStudentById(int id) 
{
return studentRepository.findById(id).get();
}
//saving a specific record by using the method save() of CrudRepository
public void saveOrUpdate(Students students) 
{
studentRepository.save(students);
}
//deleting a specific record by using the method deleteById() of CrudRepository
public void delete(int id) 
{
	studentRepository.deleteById(id);
}
//updating a record
public void update(Students students, int studentId) 
{
	studentRepository.save(students);
}
}