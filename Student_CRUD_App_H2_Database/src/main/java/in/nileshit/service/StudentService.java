package in.nileshit.service;

import java.util.List;

import in.nileshit.entity.Student;

public interface StudentService {
	public String addStudnetInfo(Student student);

	public String updateStudnetInfo(Student student);

	public List<Student> getAllStudents();

	public String deleteStudent(Integer studentId);

}
