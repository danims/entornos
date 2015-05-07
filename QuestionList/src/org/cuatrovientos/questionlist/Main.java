/**
 * 
 */
package org.cuatrovientos.questionlist;

import java.util.Scanner;

/**
 * Main program that shows a menu to choose different options.
 * @author Daniel Martin
 *
 */
public class Main {

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
			String wording = "";
			String answer = "";
			String number = "";
			Question result = null;
			Question question = null;
			
			Scanner reader = new Scanner(System.in);
			String option = "";
			QuestionList questionList = new QuestionList();
			do {
				System.out.println("------------ Question List --------------");
				System.out.println("Select one option:");
				System.out.println("1. Add a new question");
				System.out.println("2. Remove a question");
				System.out.println("3. Show the question list");
				System.out.println("4. Pick a random question");
				System.out.println("5. Check answer");
				System.out.println("6. Exit");
				option = reader.nextLine();
			
				switch (option) {
					case "1":
						System.out.println("Please, enter a wording.");
						wording = reader.nextLine();
						System.out.println("Please, enter the answer.");
						answer = reader.nextLine();
						question = new Question(wording,answer);
						questionList.addQuestion(question);
						break;
					case "2":
						System.out.println("Please, enter the question number.");
						number = reader.nextLine();
						questionList.removeQuestion(Integer.parseInt(number));
						break;
					case "3":
						System.out.println(questionList.showAll());
						break;
					case "4":
						System.out.println(questionList.pickRandom());
						break;
					case "5":
						System.out.println("Please, enter the number of the question to check the answer.");
						number = reader.nextLine();
						System.out.println("Now enter the answer.");
						answer = reader.nextLine();
						System.out.println(questionList.checkAnswer(Integer.parseInt(number),answer));
						break;
					case "6":
						System.out.println();
						System.out.println("Closing...");
						break;
					default:
						System.out.println();
						System.out.println("Invalid option");
						break;
					}
			} while (!option.equals("6"));
		}

			
		}
