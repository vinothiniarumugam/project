package org.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="PLACEMENT")
public class P_details {
	@Column(name="NAME",nullable=false)
	private String name;
	@Column(name="DEPT")
	private String dept;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public Colleges getColl() {
		return coll;
	}
	public void setColl(Colleges coll) {
		this.coll = coll;
	}

	private String admin;
	private Colleges coll;
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	public P_details() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
