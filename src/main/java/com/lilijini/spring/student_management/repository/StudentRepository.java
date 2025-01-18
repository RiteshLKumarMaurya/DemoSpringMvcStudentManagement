package com.lilijini.spring.student_management.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.lilijini.spring.student_management.entity.Student;

import net.bytebuddy.asm.Advice.Return;

@Repository
public class StudentRepository {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");

	public void addStudent(Student student) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction etr = em.getTransaction();
		etr.begin();

		// saving operations
		em.persist(student);

		etr.commit();
	}

	public List<Student> getAllStudent() {
		EntityManager em = emf.createEntityManager();
		EntityTransaction etr = em.getTransaction();
		etr.begin();

		CriteriaBuilder cb = emf.getCriteriaBuilder();
		CriteriaQuery<Student> cq = cb.createQuery(Student.class);
		Root<Student> root = cq.from(Student.class);
//		cq.select(Student.class);

		Query q = em.createQuery(cq);
		return q.getResultList();

	}
	
	public Student findStudentById(int studentId) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction etr=em.getTransaction();
		etr.begin();
		
		return em.find(Student.class, studentId);
	}
	
	public void updateStudent(Student student) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction etr=em.getTransaction();
		etr.begin();
		
		em.merge(student);
		
		etr.commit();
	}

	public Student getStudentById(int studentId) {

		 return findStudentById(studentId);
	}

	public void deleteStudentById(int studentId) {

		EntityManager em=emf.createEntityManager();
		EntityTransaction etr=em.getTransaction();
		etr.begin();
		
		Student student=em.find(Student.class, studentId);
		em.remove(student);
		
		etr.commit();
	}

}

