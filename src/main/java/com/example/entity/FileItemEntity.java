package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mediaitems")
public class FileItemEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "username")
	private String username;

	@Column(name = "filename")
	private String filename;

	@Column(name = "location")
	private String location;

	@Column(name = "hidden")
	private boolean hidden;

	public FileItemEntity() {
	}

	public FileItemEntity(String username, String filename, String location, boolean hidden) {
		this.username = username;
		this.filename = filename;
		this.location = location;
		this.hidden = hidden;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isHidden() {
		return hidden;
	}

	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}
	
	@Override
	public String toString() {
		return "FileItemEntity [id=" + id + ", username=" + username + ", filename=" + filename + ", location="
				+ location + ", hidden=" + hidden + "]";
	}
}

