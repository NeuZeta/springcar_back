package com.nzsoft.springcar.backend.integration.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="EXTRAS")
public class CommonExtra implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "EXTRA_GENERATOR",
		table = "SECUENCIAS",
		pkColumnName = "SEQ_NAME",
		pkColumnValue = "EXTRA_SEQ",
		valueColumnName = "SEQ_NUMBER",
		allocationSize = 10)

	@GeneratedValue(strategy=GenerationType.TABLE, generator = "EXTRA_GENERATOR")
	private Long id;
    
	@Column(name="NOMBRE")
	private String name;
	
	@Column(name="PRECIO")
    private double price;
	
	public CommonExtra() {
		
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CommonExtra [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
