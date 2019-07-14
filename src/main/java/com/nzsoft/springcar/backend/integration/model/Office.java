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
@Table(name="OFFICES")
public class Office implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@TableGenerator(name = "OFFICE_GENERATOR",
		table = "SECUENCIAS",
		pkColumnName = "SEQ_NAME",
		pkColumnValue = "OFFICE_SEQ",
		valueColumnName = "SEQ_NUMBER",
		allocationSize = 10)
	
	@GeneratedValue(strategy=GenerationType.TABLE, generator = "OFFICE_GENERATOR")
	private Long id;
	
	@Column(name="NOMBRE")
	private String name;
	
	@Embedded
	private Location location;
	
	@Embedded
	private Contact contact;
	
	public Office(){
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "Office [id=" + id + ", name=" + name + ", location=" + location + ", contact=" + contact + "]";
	}
	
}
