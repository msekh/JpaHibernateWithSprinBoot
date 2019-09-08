package io.mtech.Databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.mtech.Databasedemo.entity.Person;
import io.mtech.Databasedemo.jpa.PersonJpaRepository;

@SpringBootApplication
public class JPADemoApplication implements CommandLineRunner {

	private static Logger logger = LoggerFactory.getLogger(JPADemoApplication.class);

	@Autowired
	PersonJpaRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(JPADemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User Id 10001 -> {}", repo.findById(10001));
		logger.info("User Insert 10005 -> {}", repo.insert(new Person("Lolona", "Jessore", new Date(1988, 12, 03))));
		logger.info("User update 10003 ->{}",
				repo.update(new Person(10003, "Ashik", "Jessore", new Date(1990, 11, 13))));

		repo.delete(10002);
		logger.info("All Persons -> {}", repo.getAllPersons());
		/*
		 * logger.info("User Id 10002 -> No of raws deleting..{}",
		 * dao.deleteById(10002));
		 */
	}

}
