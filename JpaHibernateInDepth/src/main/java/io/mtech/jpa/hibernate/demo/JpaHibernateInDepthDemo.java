package io.mtech.jpa.hibernate.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.mtech.jpa.hibernate.demo.repository.CourseRepository;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class JpaHibernateInDepthDemo implements CommandLineRunner{
	@Autowired
	private CourseRepository repository;


	public static void main(String[] args) {
		SpringApplication.run(JpaHibernateInDepthDemo.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		repository.playWithEntityManager();
	}	
}
