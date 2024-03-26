package Chess;

import java.io.Console;
import java.util.Scanner;

public class CoinMoves extends ChessBoard{

    String piece = "";
//    public static void main(String args[]){
//        CoinMoves c = new CoinMoves();
//        c.play();
//    }

    public void rookMoves(){
        piece = "♖";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates for placing the rook, ");
        System.out.print("Enter the x-coordinate : ");
        int positionA = sc.nextInt();
        System.out.print("Enter the y-coordinate : ");
        int positionB = sc.nextInt();
        ChessBoard c1 = reset();
        c1.chessBoard[positionA][positionB] = piece;
        for(int i = 0;i<this.chessBoard.length;i++){
            if(i!=positionA){
            c1.chessBoard[i][positionB] = "x";
            }
        }
        for(int i = 0;i<this.chessBoard[positionB].length;i++){
            if(i!=positionB){
            c1.chessBoard[positionA][i] = "x";
            }
        }
        System.out.println(c1);

    }

    public void bishopMoves(){
        piece = "♗";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates for placing the Bishop, ");
        System.out.print("Enter the x-coordinate : ");
        int positionA = sc.nextInt();
        System.out.print("Enter the y-coordinate : ");
        int positionB = sc.nextInt();
        ChessBoard c1 = reset();
        c1.chessBoard[positionA][positionB] = piece;

        //code for right diagonal possible moves

        int startX;
        int startY;

        if(positionA - positionB > 0){
            startX = positionA - positionB;
        }
        else{
            startX = 0;
        }
        if(positionB - positionA > 0){
            startY = positionB - positionA;
        }
        else{
            startY = 0;
        }

        int k = startX;
        int m = startY;
        for(int i = startX;i<=7-startY;i++){
            if(c1.chessBoard[k][m] != c1.chessBoard[positionA][positionB]){
                c1.chessBoard[k][m] = "x";
            }
            k++;
            m++;
        }

        // code for left diagonal possible moves starts here
        startX = positionA;
        startY = positionB;
        while(true){
            if((startX<0 || startY<0) || (startX == 7 || startX == 0) || (startY == 0 || startY == 7)){
                break;
            }
            startX++;
            startY--;
        }

        k = startX;
        m = startY;
        for(int i = startX;i>=startY;i--){
            if(c1.chessBoard[k][m] != c1.chessBoard[positionA][positionB]){
                c1.chessBoard[k][m] = "x";
            }
            k--;
            m++;
        }
        System.out.println(c1);
    }


    public void queenMoves(){
        piece = "♕";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates for placing the Queen, ");
        System.out.print("Enter the x-coordinate : ");
        int positionA = sc.nextInt();
        System.out.print("Enter the y-coordinate : ");
        int positionB = sc.nextInt();
        ChessBoard c1 = reset();
        c1.chessBoard[positionA][positionB] = piece;
        for(int i = 0;i<this.chessBoard.length;i++){
            if(i!=positionA){
            c1.chessBoard[i][positionB] = "x";
            }
        }
        for(int i = 0;i<this.chessBoard[positionB].length;i++){
            if(i!=positionB){
            c1.chessBoard[positionA][i] = "x";
            }
        }

        int startX;
        int startY;

        if(positionA - positionB > 0){
            startX = positionA - positionB;
        }
        else{
            startX = 0;
        }
        if(positionB - positionA > 0){
            startY = positionB - positionA;
        }
        else{
            startY = 0;
        }

        int k = startX;
        int m = startY;
        for(int i = startX;i<=7-startY;i++){
            if(c1.chessBoard[k][m] != c1.chessBoard[positionA][positionB]){
                c1.chessBoard[k][m] = "x";
            }
            k++;
            m++;
        }

        // code for left diagonal possible moves starts here
        startX = positionA;
        startY = positionB;
        while(true){
            if((startX<0 || startY<0) || (startX == 7 || startX == 0) || (startY == 0 || startY == 7)){
                break;
            }
            startX++;
            startY--;
        }

        k = startX;
        m = startY;
        for(int i = startX;i>=startY;i--){
            if(c1.chessBoard[k][m] != c1.chessBoard[positionA][positionB]){
                c1.chessBoard[k][m] = "x";
            }
            k--;
            m++;
        }
        System.out.println(c1);
    }

    public boolean boundChecker(int x,int y){
        if((x<0 || y<0) || (x > 7 || x < 0) || (y < 0 || y > 7)){
                return false;
            }
        else{
            return true;
        }
    }

    public void knightMoves(){
        piece = "♘";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates for placing the Knight, ");
        System.out.print("Enter the x-coordinate : ");
        int positionA = sc.nextInt();
        System.out.print("Enter the y-coordinate : ");
        int positionB = sc.nextInt();
        ChessBoard c1 = reset();
        c1.chessBoard[positionA][positionB] = piece;
        int x = 2;
        int y = 1;
        for(int i = 0;i<8;i++){
            if(i>=4){
                x = 1;
                y = 2;
            }

            if(i == 0){
                
            }
            else if(i == 7){
                x = -x;
                y = -y;
            }
            else if(i%2 == 0){
                x = -x;
            }
            else if(i%2 != 0){
                y = -y;
            }
            if(i == 4){
                x = 1;
                y = 2;
            }
            if(boundChecker(positionA+x,positionB+y)){
                c1.chessBoard[positionA+x][positionB+y] = "x";
            }

        }
        System.out.println(c1);
    }

    public void kingMoves(){
        piece = "♔";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates for placing the King, ");
        System.out.print("Enter the x-coordinate : ");
        int positionA = sc.nextInt();
        System.out.print("Enter the y-coordinate : ");
        int positionB = sc.nextInt();
        ChessBoard c1 = reset();
        c1.chessBoard[positionA][positionB] = piece;
        int x = positionA;
        int y = positionB;
        if(boundChecker(x-1, y)){
            c1.chessBoard[x-1][y] = "x";
        }
        if(boundChecker(x+1, y)){
            c1.chessBoard[x+1][y] = "x";
        }
        if(boundChecker(x, y-1)){
            c1.chessBoard[x][y-1] = "x";
        }
        if(boundChecker(x, y+1)){
            c1.chessBoard[x][y+1] = "x";
        }
        if(boundChecker(x-1,y-1)){
            c1.chessBoard[x-1][y-1] = "x";
        }
        if(boundChecker(x+1, y+1)){
            c1.chessBoard[x+1][y+1] = "x";
        }
        if(boundChecker(x+1, y-1)){
            c1.chessBoard[x+1][y-1] = "x";
        }
        if(boundChecker(x-1, y+1)){
            c1.chessBoard[x-1][y+1] = "x";
        }
        System.out.println(c1);
    }

    public void pawnMoves(){
        piece = "♙";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the color of your pawn (b/w) : ");
        String color = sc.nextLine();
        System.out.println("Enter the coordinates for placing the Pawn, ");
        System.out.print("Enter the x-coordinate : ");
        int positionA = sc.nextInt();
        System.out.print("Enter the y-coordinate : ");
        int positionB = sc.nextInt();
        ChessBoard c1 = reset();
        if(color.equals("b")){
            piece = "♟";
        }
        c1.chessBoard[positionA][positionB] = piece;
        
        int twoPosition = (piece == "♟") ? 1 : 6;

        if(positionA == twoPosition){
            if(piece == "♟"){
                c1.chessBoard[positionA+1][positionB] = "x";
                c1.chessBoard[positionA+2][positionB] = "x";
            }
            else{
                c1.chessBoard[positionA-1][positionB] = "x";
                c1.chessBoard[positionA-2][positionB] = "x";
            }
        }

        else if(positionA != twoPosition && boundChecker(positionA, positionB)){
            if(piece == "♟"){
                c1.chessBoard[positionA+1][positionB] = "x";
            }
            else{
                c1.chessBoard[positionA-1][positionB] = "x";
            }
        }

        System.out.println(c1);

    }

    public void play(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Press 1 for chessboard printer.\npress 2 to learn how each pieces move : ");
        int choice = sc.nextInt();
        String c1 = "";
        switch(choice){
            case 1:
                boardChoice();
                break;
            case 2:
                while(true){
                if(c1.equals("q")){
                            System.out.println("Bye Bye!!\nThanks for playing!!");
                            break;
                }
                System.out.print("You will learn how various pieces in chess move\n1.King\n2.Queen\n3.Bishop\n4.Rook\n5.Knight\n6.Pawn : ");                
                int c = sc.nextInt();

                    while(true){
                        switch(c){
                            case 1:
                                kingMoves();
                                break;
                            case 2:
                                queenMoves();
                                break;
                            case 3:
                                bishopMoves();
                                break;
                            case 4:
                                rookMoves();
                                break;
                            case 5:
                                knightMoves();
                                break;
                            case 6:
                                pawnMoves();
                                break;
                            default:
                                System.out.println("Wrong choice !");
                        }
                        sc.nextLine();
                        System.out.print("Do you want to continue ? (y/q/p) : ");
                        c1 = sc.nextLine();
                        if(c1.equals("y")){
                            continue;
                        }
                        if(c1.equals("p")){
                            break;
                        }
                        if(c1.equals("q")){
                            break;
                    }
                    }
                }
                
            default:
                System.out.println("Wrong input choice!");
            
        }
    }


}
