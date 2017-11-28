package org.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
@Entity
@Table(name="college_table")
public class ListOfCollege 
{
	@Column(name="C_NAME",nullable=false)
	private String c_name;
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Id;
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public ListOfCollege() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
