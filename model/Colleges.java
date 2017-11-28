package org.web.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="COLLEGES")
public class Colleges {
	
	@Column(name="NAME",nullable=false)
	private String Name;
	@Column(name="LOCATION",nullable=false)

	private String location;
	@Column(name="PLACED",nullable=false)
	private Integer percent_placed;
	
	@Column(name="COMPANIES",nullable=false)
	private Integer no_company;
	
	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Integer getNo_placed() {
		return no_placed;
	}


	public void setNo_placed(Integer no_placed) {
		this.no_placed = no_placed;
	}


	public Integer getNo_company() {
		return no_company;
	}


	public void setNo_company(Integer no_company) {
		this.no_company = no_company;
	}


	public P_details getDetails() {
		return details;
	}


	public void setDetails(P_details details) {
		this.details = details;
	}


	public Colleges() {
		super();
		// TODO Auto-generated constructor stub
	}


	//private boolean General(String c_Name) {
		//if(Name.equals(details.getName()))
		//{
			
		//}
	}


