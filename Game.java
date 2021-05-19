import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    public static int SIZE = 3;
    public static char[][] field = new char[SIZE][SIZE];


    public static void clearBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = ' ';
            }
        }
    }



    public static void printBoard() {
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(j== SIZE -1){
                    System.out.print(" "+ field[i][j] +" \n");
                }
                else{
                    System.out.print(" "+ field[i][j] +" |");
                }
            }

            if(i < SIZE - 1){
                System.out.print("---");
                int k=1;
                while(k <= SIZE -1){
                    System.out.print("+---");
                    k++;
                }

                System.out.println();

            }
        }
    }



    public static void tictactoe() {

        char currentPlayer = 'X';
        System.out.println("choose X position: ");

        while (true) {
            Scanner scan = new Scanner(System.in);
            try{
                int x = scan.nextInt();
                int o = scan.nextInt();

                if (field[x][o] != 'X' && field[x][o] != 'O') {
                    field[x][o] = currentPlayer;
                } else{
                    System.out.println("field is busy");
                    continue;
                }

                if (currentPlayer == 'X') {
                    currentPlayer = 'O';
                    System.out.println("choose O position: ");
                } else {
                    currentPlayer = 'X';
                    System.out.println("choose X position: ");
                }
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("wrong position");
            }  catch(InputMismatchException e){
                System.out.println("insert number");
            }

            printBoard();


            if(Check.rows() == 'X') {
                System.out.println("The winner is X" );
                continueGame();
            } else if(Check.rows() == 'O'){
                System.out.println("The winner is O");
                continueGame();
            }


            if(Check.cols() == 'X') {
                System.out.println("The winner is X" );
                continueGame();
            } else if(Check.cols() == 'O'){
                System.out.println("The winner is O");
                continueGame();
            }


            if(Check.diagonal1() == 'X') {
                System.out.println("The winner is X" );
                continueGame();
            } else if(Check.diagonal1() == 'O'){
                System.out.println("The winner is O");
                continueGame();
            }


            if(Check.diagonal2() == 'X') {
                System.out.println("The winner is X" );
                continueGame();
            } else if(Check.diagonal2() == 'O'){
                System.out.println("The winner is O");
                continueGame();
            }

            if(Check.deathheat()) {
                System.out.println("Deathheat");
                continueGame();
            }

        }
    }

    public static void continueGame(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Want to play again ?");
        System.out.println("Type 'Yes' or 'NO'");
        String answer = scan.nextLine();
        if(answer.equals("Yes")){
            clearBoard();
            tictactoe();
        }else if(answer.equals("No")){
            System.exit(0);
        }else {System.out.println("enter Yes or No"); continueGame();};
    }


    public static void instruction(){
        System.out.println("Welcome to TicTacToe game");
        System.out.println();
        System.out.println("Enter position to place X or 0");
        System.out.println("dividing by SPACE");
        System.out.println();
        System.out.println("List of positions:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(j == SIZE -1){
                    System.out.print(" "+ i + j +" \n");
                }
                else{
                    System.out.print(" "+ i + j +" |");
                }
            }
            if(i < SIZE -1){
                System.out.print("----");
                int k=1;
                while(k<= SIZE -1){
                    System.out.print("+----");
                    k++;
                }
                System.out.println();
            }
        }
        System.out.println();
    }



}
