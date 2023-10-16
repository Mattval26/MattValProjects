


import java.util.Scanner;

public class grades {

	public static void main(String[] args) {
		//weights();
		courseGrade();
		//homework();
		//exam1();
		//exam2();
		//courseGrade(int [] weights);
	}
	
//==========weight for three components==========================================// 
	public static int[] weights() {
		Scanner inFromKBD = new Scanner(System.in);
		System.out.print("Homework weight? ");
		int hw_wt = inFromKBD.nextInt(); 
		
		System.out.print("Exam 1 weight? ");
		int exam1_wt = inFromKBD.nextInt(); 

		int exam2_wt = 100 - (hw_wt + exam1_wt);
		
		System.out.println("Using weights of " + hw_wt + " " + exam1_wt + " " + exam2_wt);
		
		int [] weight = new int[3];
		
		weight[0] = hw_wt;
		weight[1] = exam1_wt;
		weight[2] = exam2_wt;
		
		return weight;
		
	}
	
//=====Grades for homework ==========================//	
	public static double homework(int hw_weight) {
		System.out.println("Homework:");
		
		Scanner inFromKBD = new Scanner(System.in);
		System.out.print("Number of assignments? ");
		int num_assigns = inFromKBD.nextInt(); 	
		
		System.out.print("Average homework grade? ");
		double av_hw_grade = inFromKBD.nextDouble();
		if (av_hw_grade < 0) {
			av_hw_grade = 0;
		}
		if (av_hw_grade > 10) {
			av_hw_grade = 10;
		}
		
		System.out.print("Number of late days used? ");
		int late_days = inFromKBD.nextInt(); 	
		
		System.out.print("Labs attended? ");
		int labs_attend = inFromKBD.nextInt();
		
	
		
		double wHw_grade = point_totals(num_assigns , av_hw_grade , late_days , labs_attend, hw_weight);
		return wHw_grade;
	}
	
	public static double point_totals(double num_assigns, double av_hw_grade, int late_days, int labs_attend, int hw_weight) {
		
		double pts_poss = (10 * num_assigns) + (4 * num_assigns);
		double hw_grade = av_hw_grade * num_assigns;
		double lab_grade = labs_attend * 4;
		double score = hw_grade + lab_grade;
		
	
//if too many late days are used
		if (late_days > (num_assigns/2)) {
			score = (score) * .9;
		}
		
//if no late days are used (bonus pts)
		else if (late_days == 0) {
			if (av_hw_grade < 10){
				score += 5;
			}
		}
		//int hw_wt = weight[0];
		System.out.println("Total Points:" + score + "/" + pts_poss);
//How do we get hw weight		
		double hw_weighted = (score/pts_poss) * hw_weight;
		System.out.println("Weighted Score: " + hw_weighted);
		return hw_weighted;
		
	}
	

	public static double exam1(int ex1_weight) {
		System.out.println("Exam 1:");
		
		Scanner inFromKBD = new Scanner(System.in);
		System.out.print("Score? ");
		int ex1 = inFromKBD.nextInt();
		
		System.out.print("Curve? ");
		int ex1_curve = inFromKBD.nextInt();	

		double wEx1Score = gradeExam1(ex1, ex1_curve, ex1_weight);
		return wEx1Score;	
	}
	
	public static double gradeExam1(double score, double curve, int ex1_weight) {
		if (score < 0) {
			score = 0;
		} else if (score > 100) {
			score = 100;
		}
		
		double curvedGr = score + curve;
		if (curvedGr > 100) {
			curvedGr = 100;
		}
//how do you get exam weight here
		double weightedEx1 = (curvedGr/100) * ex1_weight;
		System.out.println("Total Points: " + curvedGr + "/100");
		System.out.println("Weighted score: " + weightedEx1);
		return weightedEx1;
	}
	
	public static double exam2(int ex2_weight) {
		System.out.println("Exam 2:");
		
		Scanner inFromKBD = new Scanner(System.in);
		System.out.print("Score? ");
		int ex2 = inFromKBD.nextInt();
		
		System.out.print("Curve? ");
		int ex2_curve = inFromKBD.nextInt();	
		
		if (ex2 > 100) {
			ex2 = 100;
		}
		if (ex2<0) {
			ex2 = 0;
		}
		double ex2_score = ex2 + ex2_curve;
		double weightEx2 = (ex2_score/100) * 30;
		double wEx2Score = gradeExam1(ex2, ex2_curve, ex2_weight);
		return wEx2Score;	
	}
	
	public static double gradeExam2(double score, double curve, int ex2_weight) {
		if (score < 0) {
			score = 0;
		} else if (score > 100) {
			score = 100;
		}
		
		double curvedGr = score + curve;
		if (curvedGr > 100) {
			curvedGr = 100;
		}
//how do you get exam weight here
		double weightedEx2 = (curvedGr/100) * ex2_weight;
		System.out.println("Total Points: " + curvedGr + "/100");
		System.out.println("Weighted score: " + weightedEx2);
		return weightedEx2;
	}
		
	

	public static void courseGrade() {
		int [] weight = weights();
		int hw_weight = weight[0];
		int ex1_weight = weight[1];
		int ex2_weight = weight[2];
		
		double wHw_grade = homework(hw_weight);
		double wEx1Score = exam1(ex1_weight);
		double wEx2Score = exam2(ex2_weight);
		double finalGrade = wHw_grade + wEx1Score + wEx2Score;
		System.out.println("Course grade: " + finalGrade);
	}
	
}
