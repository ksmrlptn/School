package OverAllJavaProgram;

import java.util.Scanner;

import java.util.Scanner;

public class SeatReservation {

    public static void main(String[] args) {
		
        char[][] seatMap = new char[10][4];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                seatMap[i][j] = ' ';
            }
        }

        Scanner input = new Scanner(System.in);
        while (true) {
            
            System.out.print("Enter row number (1-10) (negative number to exit): ");
            int row = input.nextInt();
            if (row < 0) {
                break;
            }
            System.out.print("Enter seat number (1-4): ");
            int seat = input.nextInt();

            if (row < 0 || row >= 10 || seat < 0 || seat >= 4) {
                System.out.println("Invalid row or seat number.");
                continue;
            }

            if (seatMap[row][seat] == 'X') {
                System.out.println("Seat is already reserved.");
                continue;
            }
			
            seatMap[row][seat] = 'X';
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(seatMap[i][j] + " ");
            }
            System.out.println();
        }
    }
}