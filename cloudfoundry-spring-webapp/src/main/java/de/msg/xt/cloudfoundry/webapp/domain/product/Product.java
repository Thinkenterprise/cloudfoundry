package de.msg.xt.cloudfoundry.webapp.domain.product;

import javax.persistence.Entity;

import de.msg.xt.cloudfoundry.webapp.domain.core.AbstractEntity;

@Entity
public class Product extends AbstractEntity{
	
	private String name;

	public Product() {
		super();
	}

	public Product(String name) {
		super();
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
