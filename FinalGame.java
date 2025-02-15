package com.mani.gqt.project2;
import java.util.*;
public class FinalGame {
	public static final String RESET = "\u001B[0m";
	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
	public static final String YELLOW = "\u001B[33m";
	public static final String BLUE = "\u001B[34m";
	public static final String PURPLE = "\u001B[35m";
	public static final String CYAN = "\u001B[36m";

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Question q = new Question();
		GResult r = new GResult();
		int opt, qcount = 1;
		System.out.println(GREEN + "**********Welcome to the GAME**********" + RESET);
		System.out.println(RED + "************GAME RULES************" + RESET);
		System.out.println(YELLOW+"***********************************************************************"+RESET);
		System.out.println(CYAN + "1. You will be asked some questions.");
		System.out.println("2. Each correct answer earns you 1000 rupees.");
		System.out.println("3. If you answer incorrectly, the game ends.");
		System.out.println("4. You have two lifelines: '50-50' and 'Call a Friend'.");
		System.out.println("5. Each lifeline can be used only once.");
		System.out.println("6. If you answer all questions correctly, you win the game." + RESET);
		System.out.println(YELLOW+"***********************************************************************"+RESET);
		do {
			System.out.println(BLUE + "Select any one of the option");
			System.out.println("1. Answer a question");
			System.out.println("2. Quit the game" + RESET);
			opt = s.nextInt();
			switch (opt) {
			case 1:
				if (q.Ques(qcount)) {
					if (qcount == 10 && q.Ques(qcount)) {
						System.out.println("You have answered all the questions correctly");
						break;
					} else {
						qcount += 1;
					}
				} else {
					opt = 2;
				}
				break;
			case 2:
				System.out.println(RED + "You are out of the game" + RESET);
				break;
			}
		} while (opt != 2);
	}
}

class Question extends FinalGame {
	Options o = new Options();

	boolean Ques(int qcount) {
		switch (qcount) {
		case 1:
			System.out.println("First question");
			System.out.println(PURPLE + "What is the capital of India ?" + RESET);
			if (!o.option(qcount))
				return false;
			else {
				qcount += 1;
				return true;
			}
		case 2:
			System.out.println("Second question");
			System.out.println(PURPLE + "What is the national animal of India?" + RESET);
			if (!o.option(qcount))
				return false;
			else {
				qcount += 1;
				return true;
			}
		case 3:
			System.out.println("Third question");
			System.out.println(PURPLE + "Who is the President of India (2025)?" + RESET);
			if (!o.option(qcount))
				return false;
			else {
				qcount += 1;
				return true;
			}
		case 4:
			System.out.println("Fourth question");
			System.out.println(PURPLE + "What is the currency of India?" + RESET);
			if (!o.option(qcount))
				return false;
			else {
				qcount += 1;
				return true;
			}
		case 5:
			System.out.println("Fifth question");
			System.out.println(PURPLE + "Which is the largest state in India by area?" + RESET);
			if (!o.option(qcount))
				return false;
			else {
				qcount += 1;
				return true;
			}
		case 6:
			System.out.println("Sixth question");
			System.out.println(PURPLE + "Which of these is NOT a classical dance form of India?" + RESET);
			if (!o.option(qcount))
				return false;
			else {
				qcount += 1;
				return true;
			}
		case 7:
			System.out.println("Seventh question");
			System.out.println(PURPLE + "What is the name of the Indian space agency?" + RESET);
			if (!o.option(qcount))
				return false;
			else {
				qcount += 1;
				return true;
			}
		case 8:
			System.out.println("Eighth question");
			System.out.println(PURPLE + "In which city is the famous monument, the Taj Mahal, located?" + RESET);
			if (!o.option(qcount))
				return false;
			else {
				qcount += 1;
				return true;
			}
		case 9:
			System.out.println("Nineth question");
			System.out.println(PURPLE + "What is the name of the Indian Parliament?" + RESET);
			if (!o.option(qcount))
				return false;
			else {
				qcount += 1;
				return true;
			}
		case 10:
			System.out.println("Tenth question");
			System.out.println(PURPLE + "Which of these is a major festival celebrated in India?" + RESET);
			if (!o.option(qcount))
				return false;
			else {
				return true;
			}
		}
		return false;
	}
}

class Options extends FinalGame {
	Scanner s = new Scanner(System.in);
	GResult r = new GResult();
	char ch;
	int opt, c50 = 0, cf = 0;

	boolean option(int qcount) {
		switch (qcount) {
		case 1:
			System.out.println(YELLOW + "a. Hyderabad");
			System.out.println("b. Delhi");
			System.out.println("c. Bengaluru");
			System.out.println("d. Chennai" + RESET);
			System.out.println(BLUE + "Select your option: " + RESET);
			System.out.println(RED + "1. 50-50");
			System.out.println("2. Call a friend");
			System.out.println("3. No Lifeline" + RESET);
			System.out.println("Select a lifeline if needed : ");
			opt = s.nextInt();
			if (opt == 1) {
				System.out.println(YELLOW + "b. Delhi");
				System.out.println("c. Bengaluru" + RESET);
				System.out.println(BLUE + "Select option" + RESET);
				c50 = 1;
			} else if (opt == 2) {
				System.out.println(YELLOW + "b. Delhi");
				System.out.println("Select option" + RESET);
				cf = 1;
			} else
				System.out.println(PURPLE + "Select answer" + RESET);
			char ch = s.next().charAt(0);
			if (r.res(qcount, ch))
				return true;
			break;
		case 2:
			System.out.println(YELLOW + "a. Lion");
			System.out.println("b. Tiger");
			System.out.println("c. Elephant");
			System.out.println("d. Leopard" + RESET);
			System.out.println(BLUE + "Select your option: " + RESET);
			if (c50 != 1)
				System.out.println(RED + "1. 50-50");
			if (cf != 1)
				System.out.println(RED + "2. Call a friend");
			System.out.println(RED + "3. No Lifeline" + RESET);
			System.out.println("Select a lifeline if needed : ");
			opt = s.nextInt();
			if (opt == 1) {
				System.out.println(YELLOW + "b. Tiger");
				System.out.println("c. Elephant" + RESET);
				System.out.println(BLUE + "Select option" + RESET);
				c50 = 1;
			} else if (opt == 2) {
				System.out.println(YELLOW + "b. Tiger" + RESET);
				System.out.println(BLUE + "Select option" + RESET);
				cf = 1;
			} else
				System.out.println(PURPLE + "Select answer" + RESET);
			ch = s.next().charAt(0);
			if (r.res(qcount, ch))
				return true;
			break;
		case 3:
			System.out.println(YELLOW + "a. Ram Nath Kovind");
			System.out.println("b. Narendra Modi");
			System.out.println("c. Droupadi Murmu");
			System.out.println("d. Rahul Gandhi" + RESET);
			System.out.println(BLUE + "Select option" + RESET);
			if (c50 != 1)
				System.out.println(RED + "1. 50-50");
			if (cf != 1)
				System.out.println(RED + "2. Call a friend");
			System.out.println(RED + "3. No Lifeline" + RESET);
			System.out.println("Select a lifeline if needed : ");
			int opt = s.nextInt();
			if (opt == 1) {
				System.out.println(YELLOW + "c. Droupadi Murmu");
				System.out.println("a. Ram Nath Kovind" + RESET);
				System.out.println(BLUE + "Select option" + RESET);
				c50 = 1;
			} else if (opt == 2) {
				System.out.println(YELLOW + "c. Droupadi Murmu" + RESET);
				System.out.println(BLUE + "Select option" + RESET);
				cf = 1;
			} else
				System.out.println(PURPLE + "Select answer" + RESET);
			ch = s.next().charAt(0);
			if (r.res(qcount, ch))
				return true;
			break;
		case 4:
			System.out.println(YELLOW + "a. Rupee");
			System.out.println("b. Dollar");
			System.out.println("c. Euro");
			System.out.println("d. Yen" + RESET);
			System.out.println(BLUE + "Select option" + RESET);
			if (c50 != 1)
				System.out.println(RED + "1. 50-50");
			if (cf != 1)
				System.out.println(RED + "2. Call a friend");
			System.out.println(RED + "3. No Lifeline" + RESET);
			System.out.println("Select a lifeline if needed : ");
			opt = s.nextInt();
			if (opt == 1) {
				System.out.println(YELLOW + "a. Rupee");
				System.out.println("c. Euro" + RESET);
				System.out.println(BLUE + "Select option" + RESET);
				c50 = 1;
			} else if (opt == 2) {
				System.out.println(YELLOW + "a. Rupee" + RESET);
				System.out.println(BLUE + "Select option" + RESET);
				cf = 1;
			} else
				System.out.println(PURPLE + "Select answer" + RESET);
			ch = s.next().charAt(0);
			if (r.res(qcount, ch))
				return true;
			break;
		case 5:
			System.out.println(YELLOW + "a. Maharashtra");
			System.out.println("b. Rajasthan");
			System.out.println("c. Uttar Pradesh");
			System.out.println("d. Madhya Pradesh" + RESET);
			System.out.println(BLUE + "Select option" + RESET);
			if (c50 != 1)
				System.out.println(RED + "1. 50-50");
			if (cf != 1)
				System.out.println(RED + "2. Call a friend");
			System.out.println(RED + "3. No Lifeline" + RESET);
			System.out.println("Select a lifeline if needed : ");
			opt = s.nextInt();
			if (opt == 1) {
				System.out.println(YELLOW + "b. Rajasthan");
				System.out.println("c. Uttar Pradesh" + RESET);
				System.out.println(BLUE + "Select option" + RESET);
				c50 = 1;
			} else if (opt == 2) {
				System.out.println(YELLOW + "b. Rajasthan" + RESET);
				System.out.println(BLUE + "Select option" + RESET);
				cf = 1;
			} else
				System.out.println(PURPLE + "Select answer" + RESET);
			ch = s.next().charAt(0);
			if (r.res(qcount, ch))
				return true;
			break;
		case 6:
			System.out.println(YELLOW + "a. Bharatanatyam");
			System.out.println("b. Kathak");
			System.out.println("c. Salsa");
			System.out.println("d. Odissi" + RESET);
			System.out.println(BLUE + "Select option" + RESET);
			if (c50 != 1)
				System.out.println(RED + "1. 50-50");
			if (cf != 1)
				System.out.println(RED + "2. Call a friend");
			System.out.println(RED + "3. No Lifeline" + RESET);
			System.out.println("Select a lifeline if needed : ");
			opt = s.nextInt();
			if (opt == 1) {
				System.out.println(YELLOW + "b. Kathak");
				System.out.println("c. Salsa" + RESET);
				System.out.println(BLUE + "Select option" + RESET);
				c50 = 1;
			} else if (opt == 2) {
				System.out.println(YELLOW + "c. Salsa" + RESET);
				System.out.println(BLUE + "Select option" + RESET);
				cf = 1;
			} else
				System.out.println(PURPLE + "Select answer" + RESET);
			ch = s.next().charAt(0);
			if (r.res(qcount, ch))
				return true;
			break;
		case 7:
			System.out.println(YELLOW + "a. NASA");
			System.out.println("b. ESA");
			System.out.println("c. JAXA");
			System.out.println("d. ISRO" + RESET);
			System.out.println(BLUE + "Select option" + RESET);
			if (c50 != 1)
				System.out.println(RED + "1. 50-50");
			if (cf != 1)
				System.out.println(RED + "2. Call a friend");
			System.out.println(RED + "3. No Lifeline" + RESET);
			System.out.println("Select a lifeline if needed : ");
			opt = s.nextInt();
			if (opt == 1) {
				System.out.println(YELLOW + "b. ESA");
				System.out.println("d. ISRO" + RESET);
				System.out.println(BLUE + "Select option" + RESET);
				c50 = 1;
			} else if (opt == 2) {
				System.out.println(YELLOW + "d. ISRO" + RESET);
				System.out.println(BLUE + "Select option" + RESET);
				cf = 1;
			} else
				System.out.println(PURPLE + "Select answer" + RESET);
			ch = s.next().charAt(0);
			if (r.res(qcount, ch))
				return true;
			break;
		case 8:
			System.out.println(YELLOW + "a. Mumbai");
			System.out.println("b. Delhi");
			System.out.println("c. Agra");
			System.out.println("d. Jaipur" + RESET);
			System.out.println(BLUE + "Select option" + RESET);
			if (c50 != 1)
				System.out.println(RED + "1. 50-50");
			if (cf != 1)
				System.out.println(RED + "2. Call a friend");
			System.out.println(RED + "3. No Lifeline" + RESET);
			System.out.println("Select a lifeline if needed : ");
			opt = s.nextInt();
			if (opt == 1) {
				System.out.println(YELLOW + "b. Delhi");
				System.out.println("c. Agra" + RESET);
				System.out.println(BLUE + "Select option" + RESET);
				c50 = 1;
			} else if (opt == 2) {
				System.out.println(YELLOW + "c. Agra" + RESET);
				System.out.println(BLUE + "Select option" + RESET);
				cf = 1;
			} else
				System.out.println(PURPLE + "Select answer" + RESET);
			ch = s.next().charAt(0);
			if (r.res(qcount, ch))
				return true;
			break;
		case 9:
			System.out.println(YELLOW + "a. Sansad");
			System.out.println("b. Congress");
			System.out.println("c. Duma");
			System.out.println("d. Reichstag" + RESET);
			System.out.println(BLUE + "Select option" + RESET);
			if (c50 != 1)
				System.out.println(RED + "1. 50-50");
			if (cf != 1)
				System.out.println(RED + "2. Call a friend");
			System.out.println(RED + "3. No Lifeline" + RESET);
			System.out.println("Select a lifeline if needed : ");
			opt = s.nextInt();
			if (opt == 1) {
				System.out.println(YELLOW + "a. Sansad");
				System.out.println("d. Reichstag" + RESET);
				System.out.println(BLUE + "Select option" + RESET);
				c50 = 1;
			} else if (opt == 2) {
				System.out.println(YELLOW + "a. Sansad" + RESET);
				System.out.println(BLUE + "Select option" + RESET);
				cf = 1;
			} else
				System.out.println(PURPLE + "Select answer" + RESET);
			ch = s.next().charAt(0);
			if (r.res(qcount, ch))
				return true;
			break;
		case 10:
			System.out.println(YELLOW + "a. Halloween");
			System.out.println("b. Diwali");
			System.out.println("c. Punakha Drubchen");
			System.out.println("d. Dashain" + RESET);
			System.out.println(BLUE + "Select option" + RESET);
			if (c50 != 1)
				System.out.println(RED + "1. 50-50");
			if (cf != 1)
				System.out.println(RED + "2. Call a friend");
			System.out.println(RED + "3. No Lifeline" + RESET);
			System.out.println("Select a lifeline if needed : ");
			opt = s.nextInt();
			if (opt == 1) {
				System.out.println(YELLOW + "b. Diwali");
				System.out.println("c. Punakha Drubchen" + RESET);
				System.out.println(BLUE + "Select option" + RESET);
				c50 = 1;
			} else if (opt == 2) {
				System.out.println(YELLOW + "b. Diwali" + RESET);
				System.out.println(BLUE + "Select option" + RESET);
				cf = 1;
			} else
				System.out.println(PURPLE + "Select answer" + RESET);
			ch = s.next().charAt(0);
			if (r.res(qcount, ch))
				return true;
			break;
		}
		return false;
	}
}

class GResult extends FinalGame {
	int amt = 0;

	boolean res(int qcount, char ch) {
		switch (qcount) {
		case 1:
			if (ch == 'b') {
				System.out.println(GREEN + "Correct Answer you have won 1000 rupees" + RESET);
				amt += 1000;
				System.out.println(CYAN + "Till now you have won " + amt + " rupees" + RESET);
				return true;
			} else {
				System.out.println(RED + "Wrong Answer");
				System.out.println("You are out of the game." + RESET);
				System.out.println(CYAN + "Till now you have won " + amt + " rupees" + RESET);
			}
			break;
		case 2:
			if (ch == 'b') {
				System.out.println(GREEN + "Correct Answer you have won 1000 rupees" + RESET);
				amt += 1000;
				System.out.println(CYAN + "Till now you have won " + amt + " rupees" + RESET);
				return true;
			} else {
				System.out.println(RED + "Wrong Answer");
				System.out.println("You are out of the game." + RESET);
				System.out.println(CYAN + "Till now you have won " + amt + " rupees" + RESET);
			}
			break;
		case 3:
			if (ch == 'c') {
				System.out.println(GREEN + "Correct Answer you have won 1000 rupees" + RESET);
				amt += 1000;
				System.out.println(CYAN + "Till now you have won " + amt + " rupees" + RESET);
				return true;
			} else {
				System.out.println(RED + "Wrong Answer");
				System.out.println("You are out of the game." + RESET);
				System.out.println(CYAN + "Till now you have won " + amt + " rupees" + RESET);
			}

			break;
		case 4:
			if (ch == 'a') {
				System.out.println(GREEN + "Correct Answer you have won 1000 rupees" + RESET);
				amt += 1000;
				System.out.println("Till now you have won " + amt + " rupees");
				return true;
			} else {
				System.out.println(RED + "Wrong Answer");
				System.out.println("You are out of the game." + RESET);
				System.out.println(CYAN + "Till now you have won " + amt + " rupees" + RESET);
			}
			break;
		case 5:
			if (ch == 'b') {
				System.out.println(GREEN + "Correct Answer you have won 1000 rupees" + RESET);
				amt += 1000;
				System.out.println(CYAN + "Till now you have won " + amt + " rupees" + RESET);
				return true;
			} else {
				System.out.println(RED + "Wrong Answer");
				System.out.println("You are out of the game." + RESET);
				System.out.println(CYAN + "Till now you have won " + amt + " rupees" + RESET);
			}
			break;
		case 6:
			if (ch == 'c') {
				System.out.println(GREEN + "Correct Answer you have won 1000 rupees" + RESET);
				amt += 1000;
				System.out.println(CYAN + "Till now you have won " + amt + " rupees" + RESET);
				return true;
			} else {
				System.out.println(RED + "Wrong Answer");
				System.out.println("You are out of the game." + RESET);
				System.out.println(CYAN + "Till now you have won " + amt + " rupees" + RESET);
			}
			break;
		case 7:
			if (ch == 'd') {
				System.out.println(GREEN + "Correct Answer you have won 1000 rupees" + RESET);
				amt += 1000;
				System.out.println(CYAN + "Till now you have won " + amt + " rupees" + RESET);
				return true;
			} else {
				System.out.println(RED + "Wrong Answer");
				System.out.println("You are out of the game." + RESET);
				System.out.println(CYAN + "Till now you have won " + amt + " rupees" + RESET);
			}
			break;
		case 8:
			if (ch == 'c') {
				System.out.println(GREEN + "Correct Answer you have won 1000 rupees" + RESET);
				amt += 1000;
				System.out.println(CYAN + "Till now you have won " + amt + " rupees" + RESET);
				return true;
			} else {
				System.out.println(RED + "Wrong Answer");
				System.out.println("You are out of the game." + RESET);
				System.out.println(CYAN + "Till now you have won " + amt + " rupees" + RESET);
			}
			break;
		case 9:
			if (ch == 'a') {
				System.out.println(GREEN + "Correct Answer you have won 1000 rupees" + RESET);
				amt += 1000;
				System.out.println(CYAN + "Till now you have won " + amt + " rupees" + RESET);
				return true;
			} else {
				System.out.println(RED + "Wrong Answer");
				System.out.println("You are out of the game." + RESET);
				System.out.println(CYAN + "Till now you have won " + amt + " rupees" + RESET);
			}
			break;
		case 10:
			if (ch == 'b') {
				System.out.println(GREEN + "Correct Answer you have won 1000 rupees" + RESET);
				System.out.println(GREEN + "Congratulations you have won the game" + RESET);
				amt += 1000;
				System.out.println(CYAN + "Till now you have won " + amt + " rupees" + RESET);
				return false;
			} else {
				System.out.println(RED + "Wrong Answer");
				System.out.println("You are out of the game." + RESET);
				System.out.println(CYAN + "Till now you have won " + amt + " rupees" + RESET);
			}
			break;
		}
		return false;
	}
}
