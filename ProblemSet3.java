/**
 * Problem Set 3.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * conditional control structures. It's also your first introduction to methods,
 * so things look a little different. The main method is done for you. Lines 31-40
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet3 {
    
    private static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        ProblemSet3 ps = new ProblemSet3();
        
        // comment out or uncomment as needed
        
        ps.sign();          // executes Exercise 1
        ps.parity();        // executes Exercise 2
        ps.ordered();       // executes Exercise 3
        ps.gpa();           // executes Exercise 4
        ps.grade();         // executes Exercise 5
        ps.cards();         // executes Exercise 6
        ps.leapYear();      // executes Exercise 7
        ps.state();         // executes Exercise 8
        ps.months();        // executes Exercise 9
        ps.salary();        // executes Exercise 10
        
        in.close();
    }
    
    /*
     * Exercise 1.
     * 
     * Prompt the user to enter an integer. Is it positive, negative, or zero?
     */
    
    public void sign() {
	int pnzNum;
	 Scanner pnz = new Scanner(System.in);
	 System.out.println("Enter an interger: ");
	 pnzNum = pnz.nextInt(); 
	 if (pnzNum > 0)
	 {
		 System.out.println("Positive");
	 }
	else if(pnzNum < 0)
	{
	System.out.println("Negative");
	}
	 else
	 {
	System.out.println("Zero");
	 }
    }
    
   /*
     * Exercise 2.
     * 
     * Prompt the user to enter an integer. Is it even or odd?
     */
    
    public void parity() {
	int eoo;
	System.out.println("\nEnter an interger: ");
	Scanner eos = new Scanner(System.in);
	eoo = eos.nextInt();
	if ( eoo % 2 == 0 )
        System.out.println("Even");
     else
        System.out.println("Odd");
 
    }
    
     /*
     * Exercise 3.
     *
     * Prompt the user to enter three integers. How are the integers ordered?
     */

    public void ordered() {

      System.out.println("\nEnter three integers.");

      System.out.print("\nEnter integer: ");
      long firstInt = in.nextLong();
      System.out.print("Enter integer: ");
      long secInt = in.nextLong();
      System.out.print("Enter integer: ");
      long thirdInt = in.nextLong();
      in.nextLine();

      if (secInt > firstInt && thirdInt > secInt) {
        System.out.println("\nStrictly increasing.");
      } else if ((secInt >= firstInt && thirdInt >= secInt) && (firstInt != thirdInt || secInt != thirdInt)) {
        System.out.println("\nIncreasing.");
      } else if (firstInt == secInt && firstInt == thirdInt) {
        System.out.println("\nSame.");
      } else if ((secInt <= firstInt && thirdInt <= secInt) && (firstInt != thirdInt || secInt != thirdInt)) {
        System.out.println("\nDecreasing.");
      } else {
        System.out.println("\nUnordered.");
      }

    }

    /*
     * Exercise 4.
     *
     * Prompt the user to enter a letter grade. What's the corresponding GPA?
     */

    public void gpa() {

      final double grdA = 4.00;
      final double grdB = 3.00;
      final double grdC = 2.00;
      final double grdD = 1.00;
      final double grdf = 0.00;
      final double plus = 0.33;
      final double mins = 0.33;

      System.out.print("\nEnter a letter grade: ");
      String letterGrade = in.nextLine();
      String letter = String.valueOf(letterGrade.charAt(0));
      String symbol = "";
      double gpaVar = 0.00;
      try {
        symbol = String.valueOf(letterGrade.charAt(1));
      } catch (Exception e) {

      }

      if (letter.equals("A")) {
        gpaVar = grdA;
      } else if (letter.equals("a")) {
        gpaVar = grdA;
      } else if (letter.equals("B")) {
        gpaVar = grdB;
      } else if (letter.equals("b")) {
        gpaVar = grdB;
      } else if (letter.equals("C")) {
        gpaVar = grdC;
      } else if (letter.equals("c")) {
        gpaVar = grdC;
      } else if (letter.equals("D")) {
        gpaVar = grdD;
      } else if (letter.equals("d")) {
        gpaVar = grdD;
      } else if (letter.equals("F")) {
        gpaVar = grdf;
      } else if (letter.equals("f")) {
        gpaVar = grdf;
      } else {
        System.out.println("\nThat's not a valid letter grade.");
      }

      if (letter.equals("F") || letter.equals("f")) {
        if (symbol.equals("+")) {
          System.out.println("\nThat's not a valid letter grade.");
        } else if (symbol.equals("-")) {
          System.out.println("\nThat's not a valid letter grade.");
        } else System.out.printf("\nYour GPA is %.2f.\n", gpaVar);
      } else if (letter.equals("A") || letter.equals("a")) {
        if (symbol.equals("+")) {
        } if (symbol.equals("-")) {
          gpaVar -= 0.33;
          System.out.printf("\nYour GPA is %.2f.\n", gpaVar);
        } else {
          System.out.printf("\nYour GPA is %.2f.\n", gpaVar);
        }
      } else if (symbol.equals("+")) {
        gpaVar += plus;
        System.out.printf("\nYour GPA is %.2f.\n", gpaVar);
      } else if (symbol.equals("-")) {
        gpaVar -= mins;
        System.out.printf("\nYour GPA is %.2f.\n", gpaVar);
      } else if (symbol.equals("")) {
        System.out.printf("\nYour GPA is %.2f.\n", gpaVar);
      }

    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */

    public void grade() {

      final double maxA = 100;
      final double minA = 90;
      final double maxB = 89;
      final double minB = 80;
      final double maxC = 79;
      final double minC = 70;
      final double maxD = 69;
      final double minD = 60;
      final double maxF = 59;
      final double minF = 0;

      System.out.print("\nEnter a grade: ");
      double numberGrade = in.nextDouble();
      in.nextLine();

      if (numberGrade <= maxA && numberGrade >= minA) {
          System.out.println("\nYou recieved an A.");
      } else if (numberGrade <= maxB && numberGrade >= minB) {
          System.out.println("\nYou recieved a B.");
      } else if (numberGrade <= maxC && numberGrade >= minC) {
          System.out.println("\nYou recieved a C.");
      } else if (numberGrade <= maxD && numberGrade >= minD) {
          System.out.println("\nYou recieved a D.");
      } else if (numberGrade <= maxF && numberGrade >= minF) {
          System.out.println("\nYou recieved an F.");
      } else if (numberGrade < 0) {
          System.out.println("\nGrades below 0 are invalid.");
      } else if (numberGrade > 100) {
          System.out.println("\nGrades above 100 are invalid.");
      }

    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a playing card. What card was entered?
     */

    public void cards() {

      System.out.print("\nEnter a card: ");
      String card = in.nextLine();
      String rank = card.substring(0, 1);
      String suit = card.substring(1);
      String rankWord = "";
      String suitWord = "";
      boolean valid = false;

      if (suit.equals("C")) {
        suitWord = "Clubs";
        valid = true;
      } else if (suit.equals("c")) {
        suitWord = "Clubs";
        valid = true;
      } else if (suit.equals("D")) {
        suitWord = "Diamonds";
        valid = true;
      } else if (suit.equals("d")) {
        suitWord = "Diamonds";
        valid = true;
      } else if (suit.equals("H")) {
        suitWord = "Hearts";
        valid = true;
      } else if (suit.equals("h")) {
        suitWord = "Hearts";
        valid = true;
      } else if (suit.equals("S")) {
        suitWord = "Spades";
        valid = true;
      } else if (suit.equals("s")) {
        suitWord = "Spades";
        valid = true;
      } else {
        valid = false;
        System.out.println("\nThat's not a valid suit.");
      }

      if (valid) {
        if (rank.equals("2")) {
          rankWord = "Two";
        } else if (rank.equals("3")) {
          rankWord = "Three";
        } else if (rank.equals("4")) {
          rankWord = "Four";
        } else if (rank.equals("5")) {
          rankWord = "Five";
        } else if (rank.equals("6")) {
          rankWord = "Six";
        } else if (rank.equals("7")) {
          rankWord = "Seven";
        } else if (rank.equals("8")) {
          rankWord = "Eight";
        } else if (rank.equals("9")) {
          rankWord = "Nine";
        } else if (rank.equals("T")) {
          rankWord = "Ten";
        } else if (rank.equals("t")) {
          rankWord = "Ten";
        } else if (rank.equals("J")) {
          rankWord = "Jack";
        } else if (rank.equals("j")) {
          rankWord = "Jack";
        } else if (rank.equals("Q")) {
          rankWord = "Queen";
        } else if (rank.equals("q")) {
          rankWord = "Queen";
        } else if (rank.equals("K")) {
          rankWord = "King";
        } else if (rank.equals("k")) {
          rankWord = "King";
        } else if (rank.equals("A")) {
          rankWord = "Ace";
        } else if (rank.equals("a")) {
          rankWord = "Ace";
        } else {
          valid = false;
          System.out.println("\nThat's not a valid rank.");
        }
      }

      if (valid) {
        System.out.println("\n" + rankWord + " of " + suitWord + ".");
      }

    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a year. Is it a leap year or not?
     */

    public void leapYear() {

      System.out.print("\nEnter a year: ");
      long year = in.nextLong();

      if (year >= 0) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
          System.out.println("\n" + year + " is a leap year.");
        } else {
          System.out.println("\n" + year + " is not a leap year.");
        }
      }

    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */

    public void state() {

      final double cFreeze = 0;
      final double cBoil = 100;
      final double fFreeze = 32;
      final double fBoil = 212;

      System.out.print("\nEnter a temperature: ");
      double temperature = in.nextDouble();
      in.nextLine();
      System.out.print("Enter a scale: ");
      String scale = in.nextLine();

      if (scale.equals("C") || scale.equals("c")) {
        if (temperature >= cBoil) {
          System.out.println("\nGas.");
        } else if (temperature <= cFreeze) {
          System.out.println("\nSolid.");
        } else if (temperature < cBoil && temperature > cFreeze) {
          System.out.println("\nLiquid.");
        }
      }

      if (scale.equals("F") || scale.equals("f")) {
        if (temperature >= fBoil) {
          System.out.println("\nGas.");
        } else if (temperature <= fFreeze) {
          System.out.println("\nSolid.");
        } else if (temperature < fBoil && temperature > fFreeze) {
          System.out.println("\nLiquid.");
        }
      }

      if (!(scale.equals("C") || scale.equals("c")) && !(scale.equals("F") || scale.equals("f"))) {
        System.out.println("\nThat's not a valid scale.");
      }

    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter a month. How many days are in that month?
     */

    public void months() {

      System.out.print("\nEnter a month: ");
      String month = in.nextLine();
      month = month.toLowerCase();

      if (month.equals("january")) {
        System.out.println("\n31 days.");
      } else if (month.equals("february")) {
        System.out.println("\n28 or 29 days.");
      } else if (month.equals("march")) {
        System.out.println("\n31 days.");
      } else if (month.equals("april")) {
        System.out.println("\n30 days.");
      } else if (month.equals("may")) {
        System.out.println("\n31 days.");
      } else if (month.equals("june")) {
        System.out.println("\n30 days.");
      } else if (month.equals("july")) {
        System.out.println("\n31 days.");
      } else if (month.equals("august")) {
        System.out.println("\n31 days.");
      } else if (month.equals("september")) {
        System.out.println("\n30 days.");
      } else if (month.equals("october")) {
        System.out.println("\n31 days.");
      } else if (month.equals("november")) {
        System.out.println("\n30 days.");
      } else if (month.equals("december")) {
        System.out.println("\n31 days.");
      } else {
        System.out.println("\nThat's not a valid month.");
      }

    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */

    public void salary() {

      final double overtimeThresh = 40;
      final double overPay = 1.5;

      System.out.print("\nWage: ");
      double wage = in.nextDouble();

      if (wage < 0) {
        System.out.println("\nYour wage must be greater than or equal to $0.00/hour.");
      }

      System.out.print("Hours: ");
      double hours = in.nextDouble();

      if (hours < 0) {
        System.out.println("\nYour hours must be greater than or equal to 0.0.");
      }

      double hoursOT;
      double pay;

      if (hours > overtimeThresh) {
        hoursOT = hours - overtimeThresh;
        pay = 40 * wage + hoursOT * overPay * wage;
        System.out.printf("\nYou'll make $%,.2f this week.\n", pay);
      } else {
        pay = wage * hours;
        System.out.printf("\nYou'll make $%,.2f this week.\n", pay);
      }
    }
}