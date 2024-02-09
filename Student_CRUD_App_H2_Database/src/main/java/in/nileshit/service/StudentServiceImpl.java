package in.nileshit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nileshit.entity.Student;
import in.nileshit.repository.StudentRepository;

@Service
class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repository;

	@Override
	public String addStudnetInfo(Student student) {
		Integer studentId = student.getStudentId();

		repository.save(student);
		if(studentId == null)
		{
			return "Student Information Inserted";
		}
		else
		{
			return "Student Information Updated";
		}
	}

	@Override
	public String updateStudnetInfo(Student student)
	{
		Integer studentId = student.getStudentId();
		repository.save(student);
		if(studentId == null)
		{
			return "Student Information Inserted";
		}
		else
		{
			return "Student Information Updated";
		}
		
	}

	@Override
	public List<Student> getAllStudents() {
		return (List<Student>) repository.findAll();
	}

	@Override
	public String deleteStudent(Integer studentId) {
		repository.deleteById(studentId);
		return "Student Information Deleted";
	}

}
