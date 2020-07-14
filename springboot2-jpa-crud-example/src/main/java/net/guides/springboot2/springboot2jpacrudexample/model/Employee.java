package net.guides.springboot2.springboot2jpacrudexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

	private long id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String salary;
	private String supervisor;
	private String family_members;
	private String department;
	
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, String emailId, String department, String salary, String family_members, String supervisor) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.department = department;
		this.family_members = family_members;
		this.salary = salary;
		this.supervisor = supervisor;
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "first_name", nullable = false)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "last_name", nullable = false)
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "email_address", nullable = false)
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	@Column(name = "department", nullable = false)
	public void getDepartment(String department) {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Column(name = "salary", nullable = false)
	public void getSalary(String salary) {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	@Column(name = "supervisor", nullable = false)
	public void getSupervisor(String supervisor) {
		return supervisor;
	}
	public void setSupervisor(String Supervisor) {
		this.supervisor = supervisor;
	}
	
	@Column(name = "family_members", nullable = false)
	public void getFamily_members(String family_members) {
		return family_members;
	}
	public void setFamily_members(String Supervisor) {
		this.family_members = family_members;
	
	}

	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ",department="+department+",salary="+salary+" ,supervisor="+supervisor+",family_members="+family_members+",firstName=" + firstName + ",lastName=" + lastName + ", emailId=" + emailId
				+ "]";
	}
	
}
