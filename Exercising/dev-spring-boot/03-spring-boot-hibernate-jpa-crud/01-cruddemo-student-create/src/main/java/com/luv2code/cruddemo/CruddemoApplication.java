package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
			// createStudent(studentDAO);

			// createMultipleStudents(studentDAO);

			readStudent(studentDAO);
		};
	}

	private void readStudent(StudentDAO studentDAO) {
		System.out.println("Creating new studend object ...");
		Student tempStudent = new Student("Mickey", "Michaels", "mickey@gmail.com");

		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);

		int theId = tempStudent.getId();
		System.out.println("Retrieving student with id: " + theId);

		Student myStudent = studentDAO.readById(theId);
		System.out.println("Found the student: " + myStudent);
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		System.out.println("Creating 3 new student objects ...");
		Student tempStudent1 = new Student("Paul", "Pauls", "paul@gmail.com");
		Student tempStudent2 = new Student("Ethan", "Schwab", "ethan@gmail.com");
		Student tempStudent3 = new Student("Paula", "Minute", "paula@gmail.com");

		System.out.println("Saving student objects ...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("Mark", "Marks", "mark@gmail.com");

		System.out.println("Saving student object ...");
		studentDAO.save(tempStudent);

		System.out.println("Saved student. Generated student id: " + tempStudent.getId());
	}

}
