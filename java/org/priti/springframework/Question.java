package org.priti.springframework;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	int questionId;
	String question;
	List<String> answers;
	Set answer1;
	Map answer2;
	public Question(){
		
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question
				+ ", answers=" + answers + ", answer1=" + answer1
				+ ", answer2=" + answer2 + "]";
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswers() {
		System.out.println("list of answer"+answers);
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	public Set getAnswer1() {
		System.out.println("set of answer"+answer1);
		return answer1;
	}
	public void setAnswer1(Set answer1) {
		this.answer1 = answer1;
	}
	public Map getAnswer2() {
		System.out.println("map of answer"+answer2);
		return answer2;
	}
	public void setAnswer2(Map answer2) {
		this.answer2 = answer2;
	}
	
	
	
}
