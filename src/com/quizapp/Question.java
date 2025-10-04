package com.quizapp;

import java.util.List;


public class Question {
private String prompt;
private List<String> options;
private int correctOptionIndex; // 0-based index


public Question(String prompt, List<String> options, int correctOptionIndex) {
if (options == null || options.size() == 0) throw new IllegalArgumentException("Options cannot be empty");
if (correctOptionIndex < 0 || correctOptionIndex >= options.size())
throw new IllegalArgumentException("correctOptionIndex out of range");
this.prompt = prompt;
this.options = options;
this.correctOptionIndex = correctOptionIndex;
}


public String getPrompt() {
return prompt;
}


public List<String> getOptions() {
return options;
}


public int getCorrectOptionIndex() {
return correctOptionIndex;
}
}