package org.cuatrovientos.ips;



import java.util.Random;
import java.util.Scanner;

/**
 * This class generate random ips and shows them, finally makes a summary of the number that starts with
 * @author Daniel Martin
 *
 */
public class Ips {

	/**
	 * 
	 * @param shows the array of ips
	 */
	public static void showArray(String[] ipAddresses) {
		for (int i=0;i< ipAddresses.length;i++) {
			System.out.println(i + ": " + ipAddresses[i]);
		}
	}
		

		/**
		 * generate a random ip
		 * @return
		 */
		public static String generateRandomIp() {
			Random random = new Random();
			int[] ip = new int[4];
			String[] ipST = new String[4];
			String fullip;
			  for (int i=0;i<ip.length;i++) {
				  ip[i] = random.nextInt(256);
				  ipST[i] = String.valueOf(ip[i]);
				}
			  fullip = ipST[0]+"."+ipST[1]+"."+ipST[2]+"."+ipST[3];
			  return fullip;
		  }
			/**
			 * load an array of random ips
			 * @param ipAddresses
			 */
		public static void loadArray(String[] ipAddresses) {
			for (int i=0;i< ipAddresses.length;i++) {
				ipAddresses[i] = generateRandomIp();
			}
			
		}
			/**
			 * makes a summary of the random ips given
			 * @param ipAddresses
			 */
		public static void summary(String[] ipAddresses) {
			int one = 0;
			int two = 0;
			int other = 0;
		 
		 
			for (int i = 0; i < ipAddresses.length;i++) {
				 if (ipAddresses[i].startsWith("1")) {
					 one = one + 1;
				 } else {
					 if (ipAddresses[i].startsWith("2")) {
						 two = two + 1;
					 } else {
						 other = other + 1;
					 }
				 }
			 }
			 
			 System.out.println("Total ips starting with 1: " + one);
			 System.out.println("Total ips starting with 2: " + two);
			 System.out.println("Total ips starting with other numbers: " + other);
		 }
		
		/**
		 * shows the menu of the program
		 * @param args
		 */
		public static void main (String args[]) {
			String [] ipAddresses = new String[10];
			Scanner reader = new Scanner(System.in);
			String option = "";
			
			do {

				System.out.println("Select an option:");
				System.out.println("1. Shows the array");
				System.out.println("2. Generate a random ip");
				System.out.println("3. Load an array of random ips");
				System.out.println("4. Summary of the array of ips");
				System.out.println("5. Exit");

				option = reader.nextLine();

				switch (option) {
				case "1":
					showArray(ipAddresses);
					break;
				case "2":
					generateRandomIp();
					break;
				case "3":
					loadArray(ipAddresses);
					break;
				case "4":
					summary(ipAddresses);
					break;
				case "5":
					System.out.println("Goodbye");
					break;
				default:
					System.out.println("This option doesn't exists");
					break;
				}

			} while (!option.equals("5"));
		}
		


	}
