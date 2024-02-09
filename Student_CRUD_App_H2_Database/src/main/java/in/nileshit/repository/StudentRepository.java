package in.nileshit.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;


import in.nileshit.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Serializable> {

}
