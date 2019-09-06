package io.mtech.Databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.mtech.Databasedemo.dao.PersonJdbcDao;
import io.mtech.Databasedemo.entity.Person;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

	private static Logger logger = LoggerFactory.getLogger(DatabaseDemoApplication.class);

	@Autowired
	PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All Persons -> {}", dao.getAllPersons());
		logger.info("User Id 10001 -> {}", dao.findById(10001));
		logger.info("User Id 10002 -> No of raws deleting..{}", dao.deleteById(10002));
		logger.info("User Insert 10005 -> {}", dao.insert(new Person(10005,"Lolona", "Jessore",new Date(1988,12,03))));
		logger.info("User update 10003 ->{}", dao.update(new Person(10003,"Ashik", "Jessore",new Date(1990,11,13))));
	}

}
