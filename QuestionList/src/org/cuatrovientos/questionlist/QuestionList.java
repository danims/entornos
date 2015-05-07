/**
 * 
 */
package org.cuatrovientos.questionlist;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;

/**
 * Represent the question list
 * @author Daniel Martin
 *
 */
public class QuestionList {
	
	int k = 0;
	private Hashtable<Integer,Question> Questions;

	/**
	 * @param questions
	 */
	public QuestionList() {
		Questions = new Hashtable<Integer,Question>();
	}
	
	/**
	 * adds question in the question list
	 * @param question
	 */
	public void addQuestion (Question question) {
		question.setNumber(k);
		Questions.put(question.getNumber(), question);
		k = k + 1 ;
	}
	
	/**
	 * removes question from the question list
	 * @param question
	 * @return if question was successfully removed or not
	 */
	public void removeQuestion(Integer number) {
		Questions.remove(number);
	}
	/**
	 * shows question list
	 * @return the question list
	 */
	public String showAll() {
		String questionList = "";
		Enumeration<Integer> keys = Questions.keys();
		
		while (keys.hasMoreElements()) {
			Integer number = keys.nextElement();
			questionList = questionList + Questions.get(number).toString() + "\n";
		}
		
		return questionList;
	}
	
	/**
	 * return a random question to the user
	 * @return a random question
	 */
	public String pickRandom()  {
		String randomQuestion = "";
		int randomNumber = 0;
		Random random = new Random();
		randomNumber = random.nextInt(Questions.size());
		randomQuestion = Questions.get(randomNumber).toString();
		return randomQuestion;
	}
	/**
	 * check is the answer is correct
	 * @return a boolean
	 */
	public String checkAnswer(Integer number, String theAnswer)  {
		String correct = "";
		if (theAnswer.equals(Questions.get(number).getAnswer())) {
			correct = "The answer is correct!";
			return correct;
		}
		correct = "Sorry you failed";
		return correct;
	}
}
