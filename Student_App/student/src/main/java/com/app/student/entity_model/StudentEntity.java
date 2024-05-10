package com.app.student.entity_model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="STUDENT")
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name", nullable = false)
	private String first_name;
	
	@Column(name = "last_name", nullable = false)
	private String last_name;
	
	@Column(name = "mail_id", nullable = false)
	private String mail_id;
	
	@Column(name = "created_by", nullable = false)
	private String created_by="Shivshankar";
	
	@Column(name = "created_date", nullable = false)
	private LocalDateTime created_date=LocalDateTime.now();

	
	/**
	 * 
	 */
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param id
	 * @param first_name
	 * @param last_name
	 * @param mail_id
	 * @param created_by
	 * @param created_date
	 */
	public StudentEntity(long id, String first_name, String last_name, String mail_id, String created_by,
			LocalDateTime created_date) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.mail_id = mail_id;
		this.created_by = created_by;
		this.created_date = created_date;
	}


	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}


	/**
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}


	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}


	/**
	 * @param last_name the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	/**
	 * @return the mail_id
	 */
	public String getMail_id() {
		return mail_id;
	}


	/**
	 * @param mail_id the mail_id to set
	 */
	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}


	/**
	 * @return the created_by
	 */
	public String getCreated_by() {
		return created_by;
	}


	/**
	 * @param created_by the created_by to set
	 */
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}


	/**
	 * @return the created_date
	 */
	public String getCreated_date() {
		return created_date.format(DateTimeFormatter.ofPattern("YYYY, dd MMM"));
	}


	/**
	 * @param created_date the created_date to set
	 */
	public void setCreated_date(LocalDateTime created_date) {
		this.created_date = created_date;
	}


	
	
	
		
}
