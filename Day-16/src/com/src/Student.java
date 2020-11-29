package com.src;

public class Student {
	private int studentId;
	private String studentName;
	private Address studentAddress;
	private int mathMarks;
	private int sciMarks;
	private int socMarks;
	private int totalMarks;
	private double averageMarks;
	private char gradeStudent;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public int getMathMarks() {
		return mathMarks;
	}
	public void setMathMarks(int mathMarks) {
		this.mathMarks = mathMarks;
	}
	public int getSciMarks() {
		return sciMarks;
	}
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	public void setSciMarks(int sciMarks) {
		this.sciMarks = sciMarks;
	}
	public int getSocMarks() {
		return socMarks;
	}
	public void setSocMarks(int socMarks) {
		this.socMarks = socMarks;
	}
	public Student(int studentId, String studentName, Address address, int mathMarks, int sciMarks, int socMarks) {
		
		this(studentId,studentName,address);
		this.mathMarks = mathMarks;
		this.sciMarks = sciMarks;
		this.socMarks = socMarks;
	}
	public int getTotalMarks()
	{
		return mathMarks + sciMarks + socMarks;
	}
	
	public double getAverage()
	{
		return getTotalMarks()/3;
	}
	
	public String getGrade()
	{
		double avg=getAverage();		
		return (avg>75.0 && avg<=100)?"A":(avg>65 && avg<=75)?"B":(avg>55 && avg<=65)?"C":(avg>35 && avg<=55)?"D":"F";		
	}
	
	
	public Student(int studentId, String studentName, Address address) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = address;
	}
	public Student getStudent(int studentId, String studentName, Address address)
	{
		Student s=new Student();
		s.studentId = studentId;
		s.studentName = studentName;
		s.studentAddress = address;
		s.mathMarks = 0;
		s.sciMarks = 0;
		s.socMarks = 0;
		return s;
		
	}
	
	public Student()
	{
		this.studentId = 0;
		this.studentName = "";
		this.studentAddress = null;
		this.mathMarks = 0;
		this.sciMarks = 0;
		this.socMarks = 0;	
	}
	
	
	
}
