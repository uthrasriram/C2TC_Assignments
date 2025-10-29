package com.tnsif.ifet.assignmentsix;


		// TODO Auto-generated method stub
		import java.util.*;

		public class StudentTestScoreTracker {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        // Read array size
		        int n = sc.nextInt();
		        int[] scores = new int[n];

		        // Read array elements (student scores)
		        for (int i = 0; i < n; i++) {
		            scores[i] = sc.nextInt();
		        }

		        // Convert array to ArrayList
		        ArrayList<Integer> scoreList = new ArrayList<>();
		        for (int score : scores) {
		            scoreList.add(score);
		        }

		        // Display elements
		        System.out.println("Elements in the ArrayList:");
		        for (int score : scoreList) {
		            System.out.println(score);
		        }

		        sc.close();
		    }
		


	}


