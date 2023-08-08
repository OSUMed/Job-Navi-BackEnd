package com.sri.hibernate.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Applications {
	private Long rowId;
	private String jobTitle;
	private String dateCreated;
	private String priority;
	private String status;
	private String salary;
	private String location;
	private String notes;
	private String company;
	private String dateApplied;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getRowId() {
		return rowId;
	}

	public void setRowId(Long rowId) {
		this.rowId = rowId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDateApplied() {
		return dateApplied;
	}

	public void setDateApplied(String dateApplied) {
		this.dateApplied = dateApplied;
	}

	@Override
	public String toString() {
		return "Application{" + "rowId=" + rowId + ", jobTitle='" + jobTitle + '\'' + ", dateCreated='" + dateCreated
				+ '\'' + ", priority='" + priority + '\'' + ", status='" + status + '\'' + ", salary='" + salary + '\''
				+ ", location='" + location + '\'' + ", notes='" + notes + '\'' + ", company='" + company + '\''
				+ ", dateApplied='" + dateApplied + '\'' + '}';
	}
}
