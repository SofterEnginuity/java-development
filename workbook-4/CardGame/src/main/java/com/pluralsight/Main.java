package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deck deck = new Deck();
        deck.shuffle();

        System.out.println("Enter the name for player 1");
        String player1Name = scanner.nextLine();
        System.out.println("Enter the name for player 2");
        String player2Name = scanner.nextLine();

        Hand player1 = new Hand();
        player1.deal(deck.deal());
        player1.deal(deck.deal());

        Hand player2 = new Hand();
        player2.deal(deck.deal());
        player2.deal(deck.deal());

        System.out.println(player1Name + "'s hand");
        player1.print();

        System.out.println(player2Name + "'s hand");
        player2.print();

        int player1Score = player1.getValue();
        int player2Score = player2.getValue();


        if(player1Score <= 21 &&(player1Score > player2Score || player2Score > 21)){
            System.out.println(player1Name +  " wins!!");
        }else if(player2Score <= 21 && (player2Score > player1Score || player1Score < 21)){
            System.out.println(player2Name + " wins!!");
        }else{
            System.out.println("Tie!");
        }
scanner.close();
    }

}
