package io.mtech.Databasedemo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "find_all_persons", query="select p from Person p")
public class Person {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String location;
	private Date birthDate;

	public Person(String name, String location, Date birthDate) {
		super();
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return String.format("\nPerson[id=%s, name=%s, location=%s, birthdate=%s]", id, name, location, birthDate);
	}

}
