package com.java.repository;
import org.springframework.data.repository.CrudRepository;

import com.java.model.Students;
public interface StudentRepository extends CrudRepository<Students, Integer>
{
}
