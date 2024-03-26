package Chess;

import java.util.Scanner;


public class ChessBoard {
    static final int dimension = 8;
    String[][] chessBoard;

    String color1 = ConsoleColors.BLACK_BACKGROUND;
    String color2 = ConsoleColors.WHITE_BACKGROUND;

    public ChessBoard(){
        chessBoard = new String[dimension][dimension];
    }

    public ChessBoard(String[][] arr){
        chessBoard = arr;
    }

    public void setColor1(String color1){
        this.color1 = color1;
    } 

    public void setColor2(String color2){
        this.color2 = color2;
    } 

    public void colorScheme(){
        Scanner sc = new Scanner(System.in);
        System.out.print("There are 3 color schemes available,\n1.cyan and white\n2.green and white\n3.blue and white\n4.yellow and white\n5.Black and White.\nGive input as their respective numbers : ");
        int num = sc.nextInt();
        switch(num){
            case 1:
                setColor1(ConsoleColors.WHITE_BACKGROUND);
                setColor2(ConsoleColors.CYAN_BACKGROUND);
                break;
            case 2:
                setColor1(ConsoleColors.GREEN_BACKGROUND);
                setColor2(ConsoleColors.WHITE_BACKGROUND);
                break;
            case 3:
                setColor1(ConsoleColors.BLUE_BACKGROUND);
                setColor2(ConsoleColors.WHITE_BACKGROUND);
                break; 
            case 4:
                setColor1(ConsoleColors.WHITE_BACKGROUND);
                setColor2(ConsoleColors.YELLOW_BACKGROUND);
                break;
            case 5:
                break;
            default:
                System.out.println("Wrong input!");
        }
        sc.close();
    }
    public ChessBoard resetCoordinates(){
    String[][] newChess = new String[dimension][dimension];
    for(int i=0;i<newChess.length;i++){
        for(int j=0;j<newChess.length;j++){
            newChess[i][j]=""+i+","+j;
        }
    }
    return new ChessBoard(newChess);
    }
    public ChessBoard reset(){
        String[][] newChess = new String[dimension][dimension];
        for(int i=0;i<newChess.length;i++){
            for(int j=0;j<newChess.length;j++){
                newChess[i][j]="-";
            }
        }
        return new ChessBoard(newChess);
    }

    public ChessBoard flip(){
        String[][] newChess = new String[dimension][dimension];
        newChess[7][0]="♖";
        newChess[7][1]="♘";
        newChess[7][2]="♗";
        newChess[7][3]="♔";
        newChess[7][4]="♕";
        newChess[7][5]="♗";
        newChess[7][6]="♘";
        newChess[7][7]="♖";

        for(int j=0;j<newChess[0].length;j++){
            newChess[6][j]="♙";
        }

        for(int i=2;i<newChess.length-2;i++){
            for(int j=0;j<newChess.length;j++){
                newChess[i][j]="-";
            }
        }

        for(int j=0;j<newChess[0].length;j++){
            newChess[1][j]="♟";
        }
        newChess[0][0]="♜";
        newChess[0][1]="♞";
        newChess[0][2]="♝";
        newChess[0][3]="♚";
        newChess[0][4]="♛";
        newChess[0][5]="♝";
        newChess[0][6]="♞";
        newChess[0][7]="♜";

        return new ChessBoard(newChess);
    }
    

    public ChessBoard defaultPosition(){
        String[][] newChess = new String[dimension][dimension];
        newChess[0][0]="♖";
        newChess[0][1]="♘";
        newChess[0][2]="♗";
        newChess[0][3]="♔";
        newChess[0][4]="♕";
        newChess[0][5]="♗";
        newChess[0][6]="♘";
        newChess[0][7]="♖";

        for(int j=0;j<newChess[0].length;j++){
            newChess[1][j]="♙";
        }
        for(int i=2;i<newChess.length-2;i++){
            for(int j=0;j<newChess.length;j++){
                newChess[i][j]="-";
            }
        }
        for(int j=0;j<newChess[0].length;j++){
            newChess[6][j]="♟";
        }
        newChess[7][0]="♜";
        newChess[7][1]="♞";
        newChess[7][2]="♝";
        newChess[7][3]="♚";
        newChess[7][4]="♛";
        newChess[7][5]="♝";
        newChess[7][6]="♞";
        newChess[7][7]="♜";

        return new ChessBoard(newChess);
    }

    public String toString(){
        String str = "";
        for(int i = 0;i<chessBoard.length;i++){
            for(int j = 0;j<chessBoard[i].length;j++){
                if((i+j)%2== 0){
                    str += color1+" "+chessBoard[i][j]+" "+ConsoleColors.RESET;
                }
                else{
                    str += color2+" "+chessBoard[i][j]+" "+ConsoleColors.RESET; 
                }

            }
            str+="\n";
        }
        return str;
    }

    public void boardChoice(){
        Scanner sc = new Scanner(System.in);
        ChessBoard c = new ChessBoard();
        // ChessBoard c1 = c.defaultPosition();
        System.out.print("Do you want a,\n1.Regular board\n2.Flipped Board\n3.Empty Board\nGive input as their respective numbers : ");
        int num = sc.nextInt();
        switch(num){
            case 1:
                ChessBoard c1 = c.defaultPosition();
                c1.colorScheme();
                System.out.println(c1);
                break;
            case 2:
                ChessBoard c2 = c.flip();
                c2.colorScheme();
                System.out.println(c2);
                break;
            case 3:
                ChessBoard c3 = c.reset();
                c3.colorScheme();
                System.out.println(c3);
                break;
            default:
                System.out.println("Wrong input!");
        }
    }
//    public static void main(String args[]){
//        ChessBoard c = new ChessBoard();
//        c.boardChoice();
//    }

}
