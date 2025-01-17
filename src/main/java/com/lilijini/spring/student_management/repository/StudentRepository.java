package com.lilijini.spring.student_management.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.lilijini.spring.student_management.entity.Student;

@Repository
public class StudentRepository {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("mysql-config");
	
	public void addStudent(Student student) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction etr=em.getTransaction();
		etr.begin();
		
		//saving operations
		em.persist(student);
		
		etr.commit();
		em.close();
	}
}
