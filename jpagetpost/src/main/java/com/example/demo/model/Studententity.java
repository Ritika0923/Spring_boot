package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="StudentTable")
public class Studententity {
@Id
private int id;
private String name;
private String stream;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getStream() {
	return stream;
}
public void setStream(String stream) {
	this.stream = stream;
}
public Studententity(int id, String name, String stream) {
	super();
	this.id = id;
	this.name = name;
	this.stream = stream;
}
public Studententity() {
	super();
	// TODO Auto-generated constructor stub
}
}
