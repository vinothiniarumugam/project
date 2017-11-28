package org.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin_table")
public class Admin {
	@Column(name="NAME",nullable=false)
	private String name;
	@Column(name="PHONE",nullable=false)
	private String ph;
	@Id
	@Column(name="PASSWORD",nullable=false)
	private String password;
	
	@Column(name="MAIL",nullable=false)
	private String mail;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}	

}
