/**
 * 
 */
package org.cuatrovientos.questionlist;

/**
 * 
 * Represents a question
 * @author Daniel Martin
 *
 */
public class Question {
	
	private String wording;
	private String answer;
	int number = 0;
	/**
	 * @param wording
	 * @param answer
	 */
	public Question(String wording, String answer) {
		this.wording = wording;
		this.answer = answer;
	}
	/**
	 * @return the wording
	 */
	public String getWording() {
		return wording;
	}
	/**
	 * @param wording the wording to set
	 */
	public void setWording(String wording) {
		this.wording = wording;
	}
	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}
	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Question [wording=" + wording + ", answer=" + answer
				+ ", number=" + number + "]";
	}
	

}
