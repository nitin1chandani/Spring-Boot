package com.nitinchandani.cruddemo;

import com.nitinchandani.cruddemo.dao.StudentDAO;
import com.nitinchandani.cruddemo.entity.Student;
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
				createStudent(studentDAO);
			};
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating a new student object...");
		Student tempStudent = new Student("Paul","Doe","paul@gmail.com");
		System.out.println("saving the student...");
		studentDAO.save(tempStudent);
		System.out.println("Saved student. Generated id: "+ tempStudent.getId());
	}

}
