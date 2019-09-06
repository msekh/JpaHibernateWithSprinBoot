package io.mtech.Databasedemo.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
private int id;
private String name;
private String location;
private Date birthDate;

@Override 
public String toString() {
	return String.format("\nPerson[id=%s, name=%s, location=%s, birthdate=%s]", id,name,location,birthDate);
}
}
