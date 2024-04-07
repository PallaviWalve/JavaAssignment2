//Create a student class with the following data members:- rollNo, Name,
//Course, Mark, grade, result. Develop function members to
//a. assign values for rollNo, name, course and mark.
//b. Find out the grade for the student(if mark &gt;90, then grade is A, if
//mark is between 80 and 90, then grade is B, if mark is between 70
//and 80, then grade is C, if mark is between 60 and 70, then grade
//is D, otherwise, grade is F.
//c. Find the result of the student. If mark&gt;60, then the result is Pass,
//otherwise Fail
//d. Print out the details of the student

package assignment2;

public class Question8 {
	
		private int rollNo;
		private String name,course,result;
		private double marks;
		private char grade;
		
		public void acceptDetails(int rollNo,String name,String course,double marks)
		{
			this.rollNo=rollNo;
			this.name=name;
			this.course=course;
			this.marks=marks;	
		}
		
		public char calGrade(double marks)
		{
			if(marks>90)
			{
				return grade='A';
			}
			else if(marks>=80 && marks<=90)
			{
				return grade='B';
			}
			else if(marks>=70 && marks<=80)
			{
				return grade='C';
			}
			else if(marks>=60 && marks<=70)
			{
				return grade='D';
			}
			else
			{
				return grade='F';
			}
			
		}
		public String calResult(double marks)
		{
			if(marks>=60)
			{
				return result="Pass";
			}
			else {
				return result="Fail";
			}
		}
		
		public void display()
		{
			System.out.println("---------------Student Details------------------");
			
			System.out.println("Roll Number : "+rollNo);
			System.out.println("Name        : "+name);
			System.out.println("Course      : "+course);
			System.out.println("Marks       : "+marks);
			calGrade( marks);
			calResult(marks);
			System.out.println("Result      : "+result);
			System.out.println("Grade       : "+grade);
			
		}	
		
		public static void main(String[] args)
		{
			Question8 student=new Question8();
			int rollNo;
			String name,course,result;
			double marks;
			char grade;
			student.acceptDetails(2, "Pallavi", "DAC", 86.26);
//			student.calGrade(86.34);
//			student.calResult(86.34);
			student.display();
		}
	}
