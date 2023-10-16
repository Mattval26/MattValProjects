package GradeCalculator;

import java.util.Scanner;

public class GradeCalculator {

	
	
	
		// TODO Auto-generated method stub
		
		//homework
	
		

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		
		
		
		System.out.println("Enter average Homework Grade:");
		double averageHW_grade = input.nextDouble();
		

		System.out.println("Enter amount of Labs attended:");
		int labsAttended = input.nextInt();

		
		System.out.println("Enter amount of Latedays:");
		int lateDays = input.nextInt();
		
		

		double grade_num = (((10 * averageHW_grade) + (labsAttended * 4)/140)*.50);
		
		if (lateDays > 5) {
			double new_Grade =  (grade_num - 1);
			System.out.println("Your homework grade is:" + new_Grade);
		}
		else if  (lateDays < 5); {
			
			System.out.println("Your homework grade is:" + grade_num);
			
	}
		 if (lateDays == 0) {
			double new_Grade = (grade_num +5 );
			System.out.println("Your homework grade is:" + new_Grade);
			
		}
		 {if (grade_num < 0);{
			
			 grade_num = 0;
		}  
		
	}
		System.out.println("Enter exam 1 score:");

			
			double examOne = input.nextDouble();
			
			System.out.println("Curve? if no curve enter 0");
			int curve = input.nextInt();
			
		if (curve > 0) {
			
			double examOne1 = examOne + curve;
			System.out.println("Exam 1 Score is:"+ examOne1);
			System.out.println("Exam 1 weighted score is" + (examOne1 * .20));
		}
			else {
			System.out.println("Exam 1 score is:" + examOne);
			System.out.println("Exam 1 weighted score is "+ examOne * .20);
			
			
			
			

			
			}
		
	
		System.out.println("Enter exam 2 score:");

		
		double examTwo = input.nextDouble();
		
		System.out.println("Curve? if no curve enter 0");
		int curve1 = input.nextInt();
		
	if (curve1 > 0) {
		
		double examTwo1 = examTwo + curve1;
		System.out.println("Exam 2 Score is:"+ examTwo1);
		System.out.println("Exam 2 weighted score is" + (examTwo1 * .30));
	
		
		if (examTwo1 > 100);
			examTwo1 = 100;
			System.out.print("Exam 2 score is: " + examTwo1);
			System.out.print("Exam 2 weighted score is:" + examTwo1 * .30);
	}
		else {
		System.out.println("Exam 2 score is:" + examTwo);
		System.out.println("Exam 2 weighted score is "+ examTwo * .30);
		
		}
		
		double WeightedExamOne = examOne * .20;
		double WeightedExamTwo = examTwo * .30;
		double totalScore = (WeightedExamOne + WeightedExamTwo + grade_num);
		
		System.out.println("Total score for the course is:" +totalScore);

			
		}
		
		
	}

		
	//public static int exam1() {
	//System.out.println("Enter grade for exam 1");
		//Scanner input = new Scanner(System.in);
		//int examOne = input.nextInt();
		//return examOne;
		
	
	//public static void exam2() {
		
		//System.out.println("Enter grade for exam 2");
		//Scanner input = new Scanner(System.in);
		//int examTwo = input.nextInt();
		
	
	
	
	
	//public static void HomeworkGrade() {
	 
		
		
		//double WeightedHwGrade = ((averageHomeworkGrade * AmountofAssignments) + (labsAttended * 4))/((AmountofAssignments * 10)+(TotalLabs * 4)) * 50;
		//System.out.println(WeightedHwGrade);
		
	
	
	

	
//////////////////////////////////		
	
	