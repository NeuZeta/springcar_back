package com.nzsoft.springcar.backend.integration.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="CLIENTS")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@TableGenerator(name = "CLIENT_GENERATOR",
		table = "SECUENCIAS",
		pkColumnName = "SEQ_NAME",
		pkColumnValue = "CLIENT_SEQ",
		valueColumnName = "SEQ_NUMBER",
		allocationSize = 10)

	@GeneratedValue(strategy=GenerationType.TABLE, generator = "CLIENT_GENERATOR")
	private Long id;
	
	@Column(name="NOMBRE")
	private String firstName;
	
	@Column(name="APELLIDOS")
	private String lastName;
	
	private String idNumber;
	
	@Embedded
	private Location location;
	
	@Embedded
	private Contact contact;
	
	private String userName;
	private String password;
	
	public Client(){
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", idNumber=" + idNumber
				+ ", location=" + location + ", contact=" + contact + ", userName=" + userName + ", pasword=" + password
				+ "]";
	}
	

}
