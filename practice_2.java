import java.util.Scanner;
//Sucessfully Compeleted
public class practice_2 {
    Scanner sc = new Scanner(System.in);

    int user1[] = new int[2];
    int user2[] = new int[2];
    String value1 = "X";

    public void takeUser1Input(char[][] gameArray) {
        for (int i = 0; i < 2; i++) {
            System.out.println("USER 1: Enter Value of (0,1 or 2 to play : ");
            user1[i] = sc.nextInt();

        }

    }

    public void takeUser2Input(char[][] gameArray) {
        for (int i = 0; i < 2; i++) {
            System.out.println("USER 2:  Enter Value of (0,1 or 2 to play : ");
            user2[i] = sc.nextInt();
        }
    }

    // Tik Tak Toe Game

    public void checkConditionsUser1(char[][] gameArray) {
        // checking for user1

        if (user1[0] == 0 && user1[1] == 0) {
            if (gameArray[0][0] == 0) {
                gameArray[0][0] = 'X';
            } else {
                System.out.println("Renter values");
            }
        } else if (user1[0] == 0 && user1[1] == 1) {
            if (gameArray[0][1] == 0) {
                gameArray[0][1] = 'X';
            } else {
                System.out.println("Renter values");
            }
        } else if (user1[0] == 0 && user1[1] == 2) {
            if (gameArray[0][2] == 0) {
                gameArray[0][2] = 'X';
            } else {
                System.out.println("Renter values");
            }
        } else if (user1[0] == 1 && user1[1] == 0) {
            if (gameArray[1][0] == 0) {
                gameArray[1][0] = 'X';
            } else {
                System.out.println("Renter values");
            }
        } else if (user1[0] == 1 && user1[1] == 1) {
            if (gameArray[1][1] == 0) {
                gameArray[1][1] = 'X';
            } else {
                System.out.println("Renter values");
            }
        } else if (user1[0] == 1 && user1[1] == 2) {
            if (gameArray[1][2] == 0) {
                gameArray[1][2] = 'X';
            } else {
                System.out.println("Renter values");
            }
        } else if (user1[0] == 2 && user1[1] == 0) {
            if (gameArray[2][0] == 0) {
                gameArray[2][0] = 'X';
            } else {
                System.out.println("Renter values");
            }
        } else if (user1[0] == 2 && user1[1] == 1) {
            if (gameArray[2][1] == 0) {
                gameArray[2][1] = 'X';
            } else {
                System.out.println("Renter values");
            }
        } else if (user1[0] == 2 && user1[1] == 2) {
            if (gameArray[2][2] == 0) {
                gameArray[2][2] = 'X';
            } else {
                System.out.println("Renter values");
            }
        } else {
            System.out.println("PLease write correct number");
        }
    }

    public void checkConditionsUser2(char[][] gameArray) {
        // checking for user1
        if (user2[0] == 0 && user2[1] == 0) {
            if (gameArray[0][0] == 0) {
                gameArray[0][0] = 'O';
            } else {
                System.out.println("Renter values");
            }
        } else if (user2[0] == 0 && user2[1] == 1) {
            if (gameArray[0][1] == 0) {
                gameArray[0][1] = 'O';
            } else {
                System.out.println("Renter values");
            }
        } else if (user2[0] == 0 && user2[1] == 2) {
            if (gameArray[0][2] == 0) {
                gameArray[0][2] = 'O';
            } else {
                System.out.println("Renter values");
            }
        } else if (user2[0] == 1 && user2[1] == 0) {
            if (gameArray[1][0] == 0) {
                gameArray[1][0] = 'O';
            } else {
                System.out.println("Renter values");
            }
        } else if (user2[0] == 1 && user2[1] == 1) {
            if (gameArray[1][1] == 0) {
                gameArray[1][1] = 'O';
            } else {
                System.out.println("Renter values");
            }
        } else if (user2[0] == 1 && user2[1] == 2) {
            if (gameArray[1][2] == 0) {
                gameArray[1][2] = 'O';
            } else {
                System.out.println("Renter values");
            }
        } else if (user2[0] == 2 && user2[1] == 0) {
            if (gameArray[2][0] == 0) {
                gameArray[2][0] = 'O';
            } else {
                System.out.println("Renter values");
            }
        } else if (user2[0] == 2 && user2[1] == 1) {
            if (gameArray[2][1] == 0) {
                gameArray[2][1] = 'O';
            } else {
                System.out.println("Renter values");
            }
        } else if (user2[0] == 2 && user2[1] == 2) {
            if (gameArray[2][2] == 0) {
                gameArray[2][2] = 'O';
            } else {
                System.out.println("Renter values");
            }
        } else {
            System.out.println("PLease write correct number");
        }
    }

    // Check winning Conditions

    public void printingUpdatedArray(char[][] gameArray) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(gameArray[i][j] + "                     ");
            }
            System.out.println();
            System.out.println();
            System.out.println();

        }
    }

    public void checkWinningConditions(char[][] gameArray) {
        // conditions for 3 rows
        if (gameArray[0][0] == 'X' && gameArray[0][1] == 'X' && gameArray[0][2] == 'X') {

            System.out.println("User 1 :  X is Win ");
            System.exit(0);
        } else if (gameArray[1][0] == 'X' && gameArray[1][1] == 'X' && gameArray[1][2] == 'X') {

            System.out.println("User 1 :  X is Win ");
            System.exit(0);
        }

        else if (gameArray[2][0] == 'X' && gameArray[2][1] == 'X' && gameArray[2][2] == 'X') {

            System.out.println("User 1 :  X is Win ");
            System.exit(0);
        }
        // conditions for 3 columns
        else if (gameArray[0][0] == 'X' && gameArray[1][0] == 'X' && gameArray[2][0] == 'X') {

            System.out.println("User 1 :  X is Win ");
            System.exit(0);
        } else if (gameArray[0][1] == 'X' && gameArray[1][1] == 'X' && gameArray[2][1] == 'X') {

            System.out.println("User 1 :  X is Win ");
            System.exit(0);
        } else if (gameArray[0][2] == 'X' && gameArray[1][2] == 'X' && gameArray[2][2] == 'X') {

            System.out.println("User 1 :  X is Win ");
            System.exit(0);
        }
        // Diagonal Conditions
        else if (gameArray[0][0] == 'X' && gameArray[1][1] == 'X' && gameArray[2][2] == 'X') {

            System.out.println("User 1 :  X is Win ");
            System.exit(0);
        } else if (gameArray[0][2] == 'X' && gameArray[1][1] == 'X' && gameArray[2][0] == 'X') {

            System.out.println("User 1 :  X is Win ");
            System.exit(0);
        }

        // user2 checking winning conditions

        else if (gameArray[0][0] == 'O' && gameArray[0][1] == 'O' && gameArray[0][2] == 'O') {

            System.out.println("User 1 :  O is Win ");
            System.exit(0);
        } else if (gameArray[1][0] == 'O' && gameArray[1][1] == 'O' && gameArray[1][2] == 'O') {

            System.out.println("User 1 :  O is Win ");
            System.exit(0);
        }

        else if (gameArray[2][0] == 'O' && gameArray[2][1] == 'O' && gameArray[2][2] == 'O') {

            System.out.println("User 1 :  O is Win ");
            System.exit(0);
        }
        // conditions for 3 columns
        else if (gameArray[0][0] == 'O' && gameArray[1][0] == 'O' && gameArray[2][0] == 'O') {

            System.out.println("User 1 :  O is Win ");
            System.exit(0);
        } else if (gameArray[0][1] == 'O' && gameArray[1][1] == 'O' && gameArray[2][1] == 'O') {

            System.out.println("User 1 :  O is Win ");
            System.exit(0);
        } else if (gameArray[0][2] == 'O' && gameArray[1][2] == 'O' && gameArray[2][2] == 'O') {

            System.out.println("User 1 :  O is Win ");
            System.exit(0);
        }
        // Diagonal Conditions
        else if (gameArray[0][0] == 'O' && gameArray[1][1] == 'O' && gameArray[2][2] == 'O') {

            System.out.println("User 1 :  O is Win ");
            System.exit(0);
        } else if (gameArray[0][2] == 'O' && gameArray[1][1] == 'O' && gameArray[2][0] == 'O') {

            System.out.println("User 1 :  O is Win ");
            System.exit(0);
        } 

    }

    public static void main(String[] args) {
        char[][] gameArray = new char[3][3];

        practice_2 game = new practice_2();
        while (true) {
            game.takeUser1Input(gameArray);
            game.checkConditionsUser1(gameArray);
            System.out.println("---------------Display Grid---------------");
            System.out.println();
            System.out.println();
            game.printingUpdatedArray(gameArray);
            game.checkWinningConditions(gameArray);
            System.out.println("----------------Display Grid---------------");
            System.out.println();
            System.out.println();
            game.takeUser2Input(gameArray);
            game.checkConditionsUser2(gameArray);
            game.printingUpdatedArray(gameArray);
            game.checkWinningConditions(gameArray);

        }

    }
}