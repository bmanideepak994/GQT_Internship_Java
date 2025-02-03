package com.mani.gqt.project1;
import java.util.*;
public class NewGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Question1 q = new Question1();
        int opt;
        
        System.out.println("********** Welcome to the GAME **********");
            System.out.println("********** GAME RULES **********");
            System.out.println("1. You will be asked some questions.");
            System.out.println("2. Each correct answer earns you 1000 rupees.");
            System.out.println("3. If you answer incorrectly, the game ends.");
            System.out.println("4. You have two lifelines: '50-50' and 'Call a Friend'.");
            System.out.println("5. Each lifeline can be used only once.");
            System.out.println("6. If you answer all questions correctly, you win the game.");
            System.out.println("*********************************");

        do {
            System.out.println("Select an option:");
            System.out.println("1. Answer a question");
            System.out.println("2. Quit the game");
            opt = s.nextInt();
            
            switch (opt) {
                case 1:
                    if (!q.Ques()) {
                        opt = 2;
                    }
                    break;
                case 2:
                    System.out.println("You have exited the game.");
                    System.out.println("Total amount won: " + q.getTotalAmount() + " rupees");
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1 or 2.");
            }
        } while (opt != 2);
        s.close();
    }
}

class Question1 {
    private int qcount = 1;
    private Options1 o = new Options1();
    private int totalAmount = 0;
    boolean Ques() {
        boolean isCorrect = false;
        switch (qcount) {
            case 1:
                System.out.println("First Question: What is the capital of India?");
                isCorrect = o.option(qcount);
                break;
            case 2:
                System.out.println("Second Question: What is the national animal of India?");
                isCorrect = o.option(qcount);
                break;
            case 3:
                System.out.println("Third Question: Who is the President of India (2025)?");
                isCorrect = o.option(qcount);
                break;
            case 4:
                System.out.println("Fourth Question: What is the currency of India?");
                isCorrect = o.option(qcount);
                break;
            case 5:
                System.out.println("Fifth Question: Which is the largest state in India by area?");
                isCorrect = o.option(qcount);
                break;
            default:
                System.out.println("Congratulations! You have answered all questions correctly!");
                return false;
        }

        if (isCorrect) {
            qcount++;
            totalAmount += 1000;
            return true;
        } else {
        	System.out.println("Total amount won: " + totalAmount + " rupees");
            return false;
        }
    }

    int getTotalAmount() {
        return totalAmount;
    }
}

class Options1 {
    Scanner s = new Scanner(System.in);
    GResult1 r = new GResult1();
    char ch;
    boolean fiftyFiftyUsed = false;
    boolean callAFriendUsed = false;

    boolean option(int qcount) {
        switch (qcount) {
            case 1:
                System.out.println("a. Hyderabad");
                System.out.println("b. Delhi");
                System.out.println("c. Bengaluru");
                System.out.println("d. Chennai");
                break;
            case 2:
                System.out.println("a. Lion");
                System.out.println("b. Tiger");
                System.out.println("c. Elephant");
                System.out.println("d. Leopard");
                break;
            case 3:
                System.out.println("a. Ram Nath Kovind");
                System.out.println("b. Narendra Modi");
                System.out.println("c. Droupadi Murmu"); 
                System.out.println("d. Rahul Gandhi");
                break;
            case 4:
                System.out.println("a. Rupee"); 
                System.out.println("b. Dollar");
                System.out.println("c. Euro");
                System.out.println("d. Yen");
                break;
            case 5:
                System.out.println("a. Maharashtra");
                System.out.println("b. Rajasthan"); 
                System.out.println("c. Uttar Pradesh");
                System.out.println("d. Madhya Pradesh");
                break;
        }

        System.out.println("Do you want to use a lifeline?");
        System.out.println("1. 50-50 (Remaining: " + (fiftyFiftyUsed ? "0" : "1") + ")");
        System.out.println("2. Call a Friend (Remaining: " + (callAFriendUsed ? "0" : "1") + ")");
        System.out.println("3. No Lifeline");
        
        int lifelineChoice = s.nextInt();
        if (lifelineChoice == 1 && !fiftyFiftyUsed) {
            useFiftyFifty(qcount);
            fiftyFiftyUsed = true;
        } else if (lifelineChoice == 2 && !callAFriendUsed) {
            useCallAFriend(qcount);
            callAFriendUsed = true;
        } else if (lifelineChoice != 3) {
            System.out.println("Invalid choice or lifeline already used.");
        }

        System.out.print("Select your option: ");
        ch = s.next().charAt(0);
        return r.res(qcount, ch);
    }

    void useFiftyFifty(int qcount) {
        System.out.println("50-50 Lifeline used! Eliminating two incorrect options...");

        switch (qcount) {
            case 1:
                System.out.println("b. Delhi");
                System.out.println("c. Bengaluru");
                break;
            case 2:
                System.out.println("b. Tiger");
                System.out.println("c. Elephant");
                break;
            case 3:
                System.out.println("c. Droupadi Murmu");
                System.out.println("a. Ram Nath Kovind");
                break;
            case 4:
                System.out.println("a. Rupee");
                System.out.println("c. Euro");
                break;
            case 5:
                System.out.println("b. Rajasthan");
                System.out.println("c. Uttar Pradesh");
                break;
        }
    }

    void useCallAFriend(int qcount) {
        System.out.println("Calling a friend...");
        System.out.println("Your friend suggests the correct answer is: ");
        
        switch (qcount) {
            case 1:
                System.out.println("b. Delhi");
                break;
            case 2:
                System.out.println("b. Tiger");
                break;
            case 3:
                System.out.println("c. Droupadi Murmu");
                break;
            case 4:
                System.out.println("a. Rupee");
                break;
            case 5:
                System.out.println("b. Rajasthan");
                break;
        }
    }
}

class GResult1 {
    boolean res(int qcount, char ch) {
        boolean correct = false;

        switch (qcount) {
            case 1:
                if (ch == 'b') 
                	correct = true;
                break;
            case 2:
                if (ch == 'b') 
                	correct = true;
                break;
            case 3:
                if (ch == 'c') 
                	correct = true;
                break;
            case 4:
                if (ch == 'a') 
                	correct = true;
                break;
            case 5:
                if (ch == 'b') 
                	correct = true;
                break;
        }

        if (correct) {
            System.out.println("Correct Answer! You have won 1000 rupees.");
            return true;
        } else {
            System.out.println("Wrong Answer! You are out of the game.");
            return false;
        }
    }
}
