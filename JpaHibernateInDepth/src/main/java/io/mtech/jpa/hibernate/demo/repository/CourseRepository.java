package io.mtech.jpa.hibernate.demo.repository;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.mtech.jpa.hibernate.demo.entity.Course;
import lombok.extern.slf4j.Slf4j;

@Repository
@Transactional
@Slf4j
public class CourseRepository {

	
	@Autowired
	EntityManager em;

	public Course findById(Long id) {
		return em.find(Course.class, id);
	}

	public Course save(Course course) {

		if (course.getId() == null) {
			em.persist(course);
		} else {
			em.merge(course);
		}

		return course;
	}

	public void deleteById(Long id) {
		Course course = findById(id);
		em.remove(course);
	}

	public void playWithEntityManager() {
		Course course1 = new Course(" Spring Web Services");
		em.persist(course1);
		
		Course course2 = findById(10001L);
		
		course2.setName("Spring JPA - Updated");
		
	}
}
