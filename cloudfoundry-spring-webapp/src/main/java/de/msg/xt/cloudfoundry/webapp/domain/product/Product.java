package de.msg.xt.cloudfoundry.webapp.domain.product;

import javax.persistence.Entity;

import de.msg.xt.cloudfoundry.webapp.domain.core.AbstractEntity;

/**  
* Spring Projections Samples 
* Design and Development by msg Applied Technology Research
* Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/)
* All Rights Reserved.
* 
* @author Michael Schäfer 
*/

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
