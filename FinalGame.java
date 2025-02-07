package com.mani.gqt.project2;
import java.util.*;
public class FinalGame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Question q=new Question();
		GResult r=new GResult();
		int opt,qcount=1;
		System.out.println("**********Welcome to the GAME**********");
		System.out.println("********** GAME RULES **********");
        System.out.println("1. You will be asked some questions.");
        System.out.println("2. Each correct answer earns you 1000 rupees.");
        System.out.println("3. If you answer incorrectly, the game ends.");
        System.out.println("4. You have two lifelines: '50-50' and 'Call a Friend'.");
        System.out.println("5. Each lifeline can be used only once.");
        System.out.println("6. If you answer all questions correctly, you win the game.");
        System.out.println("*********************************");
		do
		{
			System.out.println("Select any one of the option");
			System.out.println("1. Answer a question");
			System.out.println("2. Quit the game");
			opt=s.nextInt();
			switch(opt)
			{
			case 1:if(q.Ques(qcount))
					{
						if(qcount==5 && q.Ques(qcount))
						{
							System.out.println("You have answered all the questions correctly");
							break;
						}
						else {
							qcount+=1;
						}
					}
					else {
						opt=2;
					}
					break;
			case 2:System.out.println("You are out of the game");
					break;
			}
		}while(opt!=2);
	}
}
class Question
{
	Options o=new Options();
	boolean Ques(int qcount)
	{
		switch(qcount)
		{
		case 1:System.out.println("First question");
 				System.out.println("What is the capital of India ?");
 				if(!o.option(qcount))
 					return false;
 				else
 				{
 					qcount+=1;
 					return true;
 				}
		case 2:System.out.println("Second question");
 				System.out.println("What is the national animal of India?");
 				if(!o.option(qcount))
 					return false;
 				else
 				{
 					qcount+=1;
 					return true;
 				}
		case 3:System.out.println("Third question");
 				System.out.println("Who is the President of India (2025)?");
 				if(!o.option(qcount))
 					return false;
 				else
 				{
 					qcount+=1;
 					return true;
 				}
		case 4:System.out.println("Fourth question");
 				System.out.println("What is the currency of India?");
 				if(!o.option(qcount))
 					return false;
 				else
 				{
 					qcount+=1;
 					return true;
 				}
		case 5:System.out.println("Fifth question");
 				System.out.println("Which is the largest state in India by area?");
 				if(!o.option(qcount))
 					return false;
 				else
 				{
 					return true;
 				}
		}
		return false;
	}
}
class Options
{
	Scanner s=new Scanner(System.in);
	GResult r=new GResult();
	char ch;
	int opt,c50=0,cf=0;
	boolean option(int qcount)
	{
		switch(qcount)
		{
		case 1:System.out.println("a. Hyderabad");
			System.out.println("b. Delhi");
			System.out.println("c. Bengaluru");
			System.out.println("d. Chennai");
			System.out.println("Select your option: ");
			System.out.println("1. 50-50");
			System.out.println("2. Call a friend");
			System.out.println("3. No Lifeline");
			System.out.println("Select a lifeline if needed : ");
			opt=s.nextInt();
			if(opt==1)
			{
				System.out.println("b. Delhi");
                System.out.println("c. Bengaluru");
                System.out.println("Select option");
                c50=1;
			}
			else if(opt==2)
			{
				System.out.println("b. Delhi");
				System.out.println("Select option");
				cf=1;
			}
			else
				System.out.println("Select answer");
			char ch=s.next().charAt(0);
			if(r.res(qcount,ch))
				return true;
			break;
		case 2:
			System.out.println("a. Lion");
			System.out.println("b. Tiger");
			System.out.println("c. Elephant");
			System.out.println("d. Leopard");
			System.out.println("Select your option: ");
			if(c50!=1)
			System.out.println("1. 50-50");
			if(cf!=1)
			System.out.println("2. Call a friend");
			System.out.println("3. No Lifeline");
			System.out.println("Select a lifeline if needed : ");
			opt=s.nextInt();
			if(opt==1)
			{
				System.out.println("b. Tiger");
                System.out.println("c. Elephant");
                System.out.println("Select option");
                c50=1;
			}
			else if(opt==2)
			{
				System.out.println("b. Tiger");
				System.out.println("Select option");
				cf=1;
			}
			else
				System.out.println("Select answer");
			   ch=s.next().charAt(0);
			if(r.res(qcount,ch))
				return true;
			break;
		case 3:
			System.out.println("a. Ram Nath Kovind");
            System.out.println("b. Narendra Modi");
            System.out.println("c. Droupadi Murmu"); 
            System.out.println("d. Rahul Gandhi");
            System.out.println("Select your option: ");
            if(c50!=1)
    			System.out.println("1. 50-50");
    		if(cf!=1)
    			System.out.println("2. Call a friend");
			System.out.println("3. No Lifeline");
			System.out.println("Select a lifeline if needed : ");
			int opt=s.nextInt();
			if(opt==1)
			{
				System.out.println("c. Droupadi Murmu");
                System.out.println("a. Ram Nath Kovind");
                System.out.println("Select option");
                c50=1;
			}
			else if(opt==2)
			{
				System.out.println("c. Droupadi Murmu");
				System.out.println("Select option");
				cf=1;
			}
			else
				System.out.println("Select answer");
			ch=s.next().charAt(0);
			if(r.res(qcount,ch))
				return true;
			break;
		case 4:
			System.out.println("a. Rupee"); 
            System.out.println("b. Dollar");
            System.out.println("c. Euro");
            System.out.println("d. Yen");
            System.out.println("Select your option: ");
            if(c50!=1)
    			System.out.println("1. 50-50");
    		if(cf!=1)
    			System.out.println("2. Call a friend");
			System.out.println("3. No Lifeline");
			System.out.println("Select a lifeline if needed : ");
			opt=s.nextInt();
			if(opt==1)
			{
				System.out.println("a. Rupee");
                System.out.println("c. Euro");
                System.out.println("Select option");
                c50=1;
			}
			else if(opt==2)
			{
				System.out.println("a. Rupee");
				System.out.println("Select option");
				cf=1;
			}
			else
				System.out.println("Select answer");
			ch=s.next().charAt(0);
			if(r.res(qcount,ch))
				return true;
			break;
		case 5:
			System.out.println("a. Maharashtra");
            System.out.println("b. Rajasthan"); 
            System.out.println("c. Uttar Pradesh");
            System.out.println("d. Madhya Pradesh");
            System.out.println("Select your option: ");
            if(c50!=1)
    			System.out.println("1. 50-50");
    		if(cf!=1)
    			System.out.println("2. Call a friend");
			System.out.println("3. No Lifeline");
			System.out.println("Select a lifeline if needed : ");
			opt=s.nextInt();
			if(opt==1)
			{
				System.out.println("b. Rajasthan");
                System.out.println("c. Uttar Pradesh");
                System.out.println("Select option");
                c50=1;
			}
			else if(opt==2)
			{
				System.out.println("b. Rajasthan");
				System.out.println("Select option");
				cf=1;
			}
			else
				System.out.println("Select answer");
			ch=s.next().charAt(0);
			if(r.res(qcount,ch))
				return true;
			break;
		}
		return false;
	}
}
class GResult
{
	int amt=0;
	boolean res(int qcount,char ch)
	{
		switch(qcount)
		{
		case 1:if(ch=='b')
				{
					System.out.println("Correct Answer you have won 1000 rupees");
					amt+=1000;
					System.out.println("Till now you have won "+amt+" rupees");
					return true;
				}
				else {
					System.out.println("Wrong Answer");
					System.out.println("You are out of the game.");
					System.out.println("Till now you have won "+amt+" rupees");
				}
				break;
		case 2:if(ch=='b')
			{
				System.out.println("Correct Answer you have won 1000 rupees");
				amt+=1000;
				System.out.println("Till now you have won "+amt+" rupees");
				return true;
			}
			else {
				System.out.println("Wrong Answer");
				System.out.println("You are out of the game.");
				System.out.println("Till now you have won "+amt+" rupees");
			}
			break;
		case 3:if(ch=='c')
			{
				System.out.println("Correct Answer you have won 1000 rupees");
				amt+=1000;
				System.out.println("Till now you have won "+amt+" rupees");
				return true;
			}
			else {
				System.out.println("Wrong Answer");
				System.out.println("You are out of the game.");
				System.out.println("Till now you have won "+amt+" rupees");
			}
			
			break;
		case 4:if(ch=='a')
				{
				System.out.println("Correct Answer you have won 1000 rupees");
				amt+=1000;
				System.out.println("Till now you have won "+amt+" rupees");
				return true;
				}	
			else {
				System.out.println("Wrong Answer");
				System.out.println("You are out of the game.");
				System.out.println("Till now you have won "+amt+" rupees");
			}
			break;
		case 5:if(ch=='b')
				{
					System.out.println("Correct Answer you have won 1000 rupees");
					System.out.println("You have answered all the questiona");
					amt+=1000;
					System.out.println("Till now you have won "+amt+" rupees");
					return false;
				}
			else {
				System.out.println("Wrong Answer");
				System.out.println("You are out of the game.");
				System.out.println("Till now you have won "+amt+" rupees");
			}
			break;
		}
		return false;
	}
}