package com.nzsoft.springcar.backend.integration.model;

import java.io.Serializable;

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

	/*
	@Id
	@TableGenerator(name = "CLIENT_GENERATOR",
		table = "SECUENCIAS",
		pkColumnName = "SEQ_NAME",
		pkColumnValue = "CLIENT_SEQ",
		valueColumnName = "SEQ_NUMBER",
		allocationSize = 10)

	@GeneratedValue(strategy=GenerationType.TABLE, generator = "CLIENT_GENERATOR")*/
	private Long id;
    private String name;
    private Double price;
	
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CommonExtra [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	

}
