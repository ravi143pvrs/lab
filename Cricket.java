package Assignmentss;

import java.util.Scanner;

public class Cricket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        final int PLAYERS = 11;
        int runs[] = new int[PLAYERS];
        String names[] = new String[PLAYERS];
        
        for (int i = 0; i < PLAYERS; i++) {
            System.out.println("Enter player " + (i + 1) + " name:");
            names[i] = in.nextLine();
            System.out.println("Enter player " + (i + 1) + " score:");
            runs[i] = in.nextInt();
            in.nextLine();
        }
        
        int highScoreIdx = 0;
        for (int i = 1; i < PLAYERS; i++) {
            if (runs[i] > runs[highScoreIdx])
                highScoreIdx = i;
        }
        
        System.out.println("Highest Scorer");
        System.out.println(names[highScoreIdx] + "\t" + runs[highScoreIdx]);
    }

	}