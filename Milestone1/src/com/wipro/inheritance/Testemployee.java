package com.wipro.inheritance;
class employee extends person {
private double annual_salary;
private int emp_yr;
private String insurance_no;
public employee(String n,double a,int y,String i) {
	super(n);
	annual_salary=a;
	emp_yr=y;
	insurance_no=i;
}
public void setSalary(double a) {
	annual_salary=a;
}
public void setYear(int y) {
	emp_yr=y;
}
public void setInsurance_no(String i) {
	insurance_no=i;
}
public double getSalary() {
	return annual_salary;
}
public int getyear() {
	return emp_yr;
}
public String getInsurance_no() {
	return insurance_no;
}
public String toString() {
	return super.toString()+" "+annual_salary+" "+emp_yr+" "+insurance_no;
}
}
class person {
private String name;
public person(String n) {
	name=n;
}
public void setName(String n) {
	name=n;
}
public String getName() {
	return name;
}
public String toString() {
	return name;
}
}
public class Testemployee {
public static void main(String[] args) {
	person p=new person("abdul");
	employee e=new employee("rahaman",10000,2015,"xyza");
	System.out.println(p);
	System.out.println(e);
}
}