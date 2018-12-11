package org.priti.springframework;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
int questionid;
String question;
List<String> answerlist;
Set answerset;
Map answermap;
public int getQuestionid() {
	return questionid;
}
public void setQuestionid(int questionid) {
	this.questionid = questionid;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public List<String> getAnswer() {
	
		System.out.println("List Elements :"  + answerlist);
	    
		return answerlist;
	}
	
public void setAnswer(List<String> answer) {
	this.answerlist = answer;
}
public Set getAnswer1() {
	System.out.println("List Elements :"  + answerset);
    
	return answerset;
}
public void setAnswer1(Set answer1) {
	this.answerset = answer1;
}
public Map getAnswer2() {
	System.out.println("List Elements :"  + answermap);
    
	return answermap;
}
public void setAnswer2(Map answer2) {
	this.answermap = answer2;
}
public Question() {
	super();
	this.questionid = questionid;
	this.question = question;
	this.answerlist = answerlist;
	this.answerset = answerset;
	this.answermap = answermap;
}
@Override
public String toString() {
	return "Question [questionid=" + questionid + ", question=" + question
			+ ", answer=" + answerlist + ", answer1=" + answerset + ", answer2="
			+ answermap + "]";
}


}

