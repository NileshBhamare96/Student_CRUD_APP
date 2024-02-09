package in.nileshit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Student_Details")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer studentId ;
	
	@Column
	private Integer studentAge ;
	
	@Column
	private String studentName ;
	
	@Column
	private String courseName ;
	
	@Column
	private Double courseFee ;

}

