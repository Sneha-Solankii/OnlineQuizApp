package com.quizapp;

import java.util.*;

public class Quiz {
	private List<Question> questions;
	private int score;
	private Scanner scanner;
	private boolean shuffleQuestions = true; // toggle if you want fixed order
	
	public Quiz(List<Question> questions) {
	this.questions = new ArrayList<>(questions);
	this.score = 0;
	this.scanner = new Scanner(System.in);
	}
	
	public void setShuffleQuestions(boolean shuffle) {
	this.shuffleQuestions = shuffle;
	}


	public void start() {
	   System.out.println("=== Welcome to the Quiz ===");
	   if (shuffleQuestions) Collections.shuffle(questions);
	
	   for (int i = 0; i < questions.size(); i++) {
			Question q = questions.get(i);
			System.out.println();
			System.out.println("Question " + (i + 1) + ": " + q.getPrompt());
	
	
			List<String> opts = q.getOptions();
			for (int j = 0; j < opts.size(); j++) {
			  char label = (char) ('A' + j);
			  System.out.println(" " + label + ". " + opts.get(j));
			}
	
	
			int userChoiceIndex = getUserChoice(opts.size()); // returns 0-based index
				
			if (userChoiceIndex == q.getCorrectOptionIndex()) {
				System.out.println("Correct!\n");
				score++;
			} else {
				char correctChar = (char) ('A' + q.getCorrectOptionIndex());
				System.out.println("Incorrect. Correct answer: " + correctChar + ". " + opts.get(q.getCorrectOptionIndex()) + "\n");			
			}
	     }


	showResults();
	}
	
	
	private int getUserChoice(int numOptions) {
		while (true) {
			System.out.print("Enter your answer (A-" + (char) ('A' + numOptions - 1) + " or 1-" + numOptions + "): ");
			String line = scanner.nextLine().trim().toUpperCase();
			if (line.isEmpty()) continue;
	
	
			// Accept letters A/B/C or numbers 1/2/3
			char first = line.charAt(0);
			if (first >= 'A' && first < ('A' + numOptions)) {
			return first - 'A';
			}
			try {
			int n = Integer.parseInt(line);
			if (n >= 1 && n <= numOptions) return n - 1;
			} catch (NumberFormatException e) {
			// fall-through
			}
			System.out.println("Invalid input. Please enter a valid option.");
		}
	}


	private void showResults() {
			System.out.println("=== Quiz Finished ===");
			System.out.println("Score: " + score + " / " + questions.size());
			double percent = (score * 100.0) / questions.size();
			System.out.printf("Percentage: %.2f%%\n", percent);
		}
	}