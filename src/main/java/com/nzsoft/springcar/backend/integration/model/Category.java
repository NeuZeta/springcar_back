package com.nzsoft.springcar.backend.integration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORIES")
public class Category {
	
	@Id
	private Long id;
	
	private String name;
    private Double baseInsurancePrice;
    private Double topInsurancePrice;
    
    @Column(name="TOP_INSURANCE_GLASS_PROTECTION_PRICE")
    private Double tireAndGlassProtectionPrice;
	
    public Category() {
		
	}
    
    public Long getId(){
    	return id;
    }
    
    public void setId(Long id){
    	this.id = id;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBaseInsurancePrice() {
		return baseInsurancePrice;
	}

	public void setBaseInsurancePrice(Double baseInsurancePrice) {
		this.baseInsurancePrice = baseInsurancePrice;
	}

	public Double getTopInsurancePrice() {
		return topInsurancePrice;
	}

	public void setTopInsurancePrice(Double topInsurancePrice) {
		this.topInsurancePrice = topInsurancePrice;
	}

	public Double getTireAndGlassProtectionPrice() {
		return tireAndGlassProtectionPrice;
	}

	public void setTireAndGlassProtectionPrice(Double tireAndGlassProtectionPrice) {
		this.tireAndGlassProtectionPrice = tireAndGlassProtectionPrice;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", baseInsurancePrice=" + baseInsurancePrice
				+ ", topInsurancePrice=" + topInsurancePrice + ", tireAndGlassProtectionPrice="
				+ tireAndGlassProtectionPrice + "]";
	}
    

}
