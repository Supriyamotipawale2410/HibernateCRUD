package com.demo.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="myemp")
public class Employee {
	@Id
    private int empid;
    private String ename;
    private double sal;
    @ManyToOne(cascade=CascadeType.REFRESH)
    @JoinColumn(name="deptno")
    private Department dept;
	public Employee() {
		super();
	}
	public Employee(int empid, String ename, double sal, Department dept) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
		this.dept = dept;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", sal=" + sal + ", dept=" + dept + "]";
	}
	
    
}
