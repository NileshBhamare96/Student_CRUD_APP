package in.nileshit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.nileshit.entity.Student;
import in.nileshit.service.StudentService;

@RestController
public class StudentRestController {

	@Autowired
	private StudentService service;

	@PostMapping("/addstudentInfo")
	public ResponseEntity<String> addStudentInfo(@RequestBody Student student) {
		String msg = service.addStudnetInfo(student);
		return new ResponseEntity<>(msg, HttpStatus.CREATED);

	}

	@PutMapping("/updatestudentInfo")
	public ResponseEntity<String> updateStudentInfo(@RequestBody Student student) {
		String msg = service.updateStudnetInfo(student);
		return new ResponseEntity<>(msg, HttpStatus.OK);

	}

	@GetMapping("/allstudentsinfo")
	public ResponseEntity<List<Student>> getAllStundentsInfo() {
		List<Student> allStudnetsInfo = service.getAllStudents();
		return new ResponseEntity<>(allStudnetsInfo, HttpStatus.OK);
	}

	@DeleteMapping("/deletestudentinfo/{studentId}")
	public ResponseEntity<String> deleteStudentInfo(@PathVariable Integer studentId) {
		String msg = service.deleteStudent(studentId);
        return new ResponseEntity<>(msg, HttpStatus.OK);
	}
}
