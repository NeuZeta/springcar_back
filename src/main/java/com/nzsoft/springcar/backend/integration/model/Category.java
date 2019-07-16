package com.nzsoft.springcar.backend.integration.model;

public class Category {
	
	private String name;
    private Double baseInsurancePrice;
    private Double topInsurancePrice;
	
    public Category() {
		
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
    
    
    

}
