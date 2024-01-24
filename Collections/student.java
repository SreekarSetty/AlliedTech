package Collections;

import java.util.*;


public class student 
{
	String firstName;
	String lastName;
	double gpa;
	@Override
	public String toString() {
		return "student [firstName=" + firstName + ", lastName=" + lastName + ", gpa=" + gpa + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public student(String firstName, String lastName, double d) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = d;
	}
	public static void main(String[] args) 
	{
		ArrayList<student> al = new ArrayList<student>();
		
		al.add(new student("Sreekar","Somi Setty",4.9));
		al.add(new student("Sreedath","Somi Setty",5.5));
		al.add(new student("Sreekar","Setty",9));
		al.add(new student("Sreekar","Somi",9.1));
		al.add(new student("Sar","Sety",9.2));
		double totalgpa=0;
		
		for(student s:al)
		{
			totalgpa=totalgpa+s.getGpa();
		}
		double avgcgpa=totalgpa/al.size();
		for(student s1:al)
		{
			if(avgcgpa<s1.getGpa())
			{
				System.out.println(s1.getLastName()+" "+s1.getFirstName()+" "+s1.getGpa() );
			}
		}
		
		
	}

}
