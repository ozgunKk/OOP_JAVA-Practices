package it.polito.med;

public class Doctor {

	private String name;
	private String surname;
	private String id;
	private String speciality;
	
	public Doctor(String id, String name, String surname, String speciality) {
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.speciality = speciality;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	
	
}
