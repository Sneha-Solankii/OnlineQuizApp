package com.quizapp;

import java.util.*;


public class QuizApp {
	public static void main(String[] args) {
	   List<Question> questions = new ArrayList<>();
	
	
	   questions.add(new Question("Which keyword is used to inherit a class in Java?",
               Arrays.asList("implements", "extends", "inherits", "super"), 1));

       questions.add(new Question("Which of these is not a primitive data type in Java?",
               Arrays.asList("int", "float", "String", "char"), 2));

       questions.add(new Question("Which method is the entry point of a Java program?",
               Arrays.asList("start()", "main()", "run()", "init()"), 1));

       questions.add(new Question("Which of the following is used to handle exceptions?",
               Arrays.asList("try-catch", "goto", "if-else", "switch"), 0));

       questions.add(new Question("Which package is imported by default in Java?",
               Arrays.asList("java.util", "java.lang", "java.io", "None"), 1));

       questions.add(new Question("Which concept of OOP means reusing existing code?",
               Arrays.asList("Encapsulation", "Polymorphism", "Inheritance", "Abstraction"), 2));

       questions.add(new Question("Which keyword is used to define a constant variable?",
               Arrays.asList("final", "static", "const", "immutable"), 0));

       questions.add(new Question("Which operator is used for comparison in Java?",
               Arrays.asList("=", "==", "===", "equals"), 1));

       questions.add(new Question("Which collection class stores elements in key-value pairs?",
               Arrays.asList("ArrayList", "HashMap", "HashSet", "Vector"), 1));

       questions.add(new Question("Which of the following is not a loop in Java?",
               Arrays.asList("for", "while", "repeat-until", "do-while"), 2));

		
		Quiz quiz = new Quiz(questions);
		// quiz.setShuffleQuestions(false); // if you prefer fixed order
		quiz.start();
	  }
	}