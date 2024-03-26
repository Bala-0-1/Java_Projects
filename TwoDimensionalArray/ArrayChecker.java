package TwoDimensionalArray;

import java.util.Scanner;

public class ArrayChecker {
    int[][] arr1;
    
    public ArrayChecker(){
        arr1 = new int[][]{{1,0,0},{0,1,0},{0,0,1}};
    }

    public ArrayChecker(int[][] arr1){
        this.arr1 = arr1;
    }

    public ArrayChecker getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int c = sc.nextInt();
        int[][] newArr = new int[r][c];
        for(int i = 0;i<newArr.length;i++){
            for(int j = 0;j<arr1[i].length;j++){ 
                System.out.print("Enter the value for the coordinate "+"("+i+","+j+")"+" : ");
                newArr[i][j] = sc.nextInt();
            }
        }
        return new ArrayChecker(newArr);
    }

    public ArrayChecker addition(ArrayChecker m){
        int[][] arr = new int[arr1.length][arr1[0].length];
        for(int i=0; i< arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                arr[i][j] = arr1[i][j]+m.arr1[i][j];
            }
        }
        return new ArrayChecker(arr);
    }

    public ArrayChecker subtraction(ArrayChecker m){
        int[][] arr = new int[arr1.length][arr1[0].length];
        for(int i=0; i< arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                arr[i][j] = arr1[i][j]-m.arr1[i][j];
            }
        }
        return new ArrayChecker(arr);
    }
    public ArrayChecker multiplication(ArrayChecker m){
        int[][] arr = new int[arr1.length][m.arr1[0].length];
        for(int i=0; i<arr1.length;i++){
            for(int j=0;j<m.arr1[0].length;j++){
                int val = 0;
                for(int k=0;k<arr1[0].length;k++){
                    val+=arr1[i][k]*m.arr1[k][j];
                }
                arr[i][j]=val;
            }
        }
        return new ArrayChecker(arr);
    }

    public boolean isRow(){
        if(arr1[0].length == 1){
            return true;
        }
        return false;
    }

    public boolean isColumn(){
        return (arr1.length == 1) ? true : false;
    }

    public ArrayChecker transpose(){
        int[][] newArr = new int[arr1[0].length][arr1.length];
        for(int i = 0;i<arr1.length;i++){
            for(int j = 0;j<arr1[i].length;j++){
                newArr[i][j] = arr1[j][i];
            }
        }
        
        return new ArrayChecker(newArr);

    }

    public boolean isIdentity(){
        boolean flag = true;
        int k = 0;
        for(int i = 0;i<arr1.length;i++){
            for(int j = 0;j<arr1[i].length;j++){
                if(i!=j){
                    if(arr1[i][j] != 0){
                        // System.out.println(arr1[i][j]);
                        flag = false;
                        break;
                    }
                }
            }
            if(arr1[k][k]!=1){
                    flag = false;
                    break;
            }
            k+=1;
        }
        return flag;
    }

    /* 1 0 0 
       0 1 0
       0 0 4
     */
    public boolean isUpperTriangular(){
        for(int i = 0;i<arr1.length;i++){
            for(int j = 0;j<arr1[i].length;j++){
                if(i>j && arr1[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
        
    }

    public boolean isLowerTriangular(){
        for(int i = 0;i<arr1.length;i++){
            for(int j = 0;j<arr1[i].length;j++){
                if(i<j && arr1[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
        
    }

    public boolean isSquare(){
        int row = arr1.length;
        for(int i = 0;i<arr1.length;i++){
            int count = 0;
            for(int j = 0;j<arr1[i].length;j++){
                count+=1;
            }
            if(count!=row){
                return false;
            }
        }
        return true;
    }

    public boolean isSymmetric(){
        for(int i = 0;i<arr1.length;i++){
            for(int j = 0;j<arr1[i].length;j++){
                if(this.arr1[i][j]!=arr1[j][i]){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isSkewSymmetric(){
    for(int i = 0;i<arr1.length;i++){
        for(int j = 0;j<arr1[i].length;j++){
            if(this.arr1[i][j]!=-arr1[j][i]){
                return false;
            }
        }
    }
    return true;
    }

    public boolean isScalar(){
        int a = arr1[0][0];
        for(int i = 1;i<arr1.length;i++){
            if(arr1[i][i]!=a){
                return false;
            }
        }
        return true;

    }

    public String toString(){
        String str = "{\n";
        if(this.arr1.length != 0){
        for(int i = 0;i<arr1.length;i++){
            str+="{";
            for(int j=0;j<arr1[i].length;j++){
                if(j!=arr1[i].length-1){
                str+=arr1[i][j]+",";
                }
                else{
                    str+=arr1[i][j];
                }
            }
            if(i!=arr1.length-1){
            str+="},\n";
            }
            else{
                str+="}\n";
            }
        }
        str+="}";
        }

        else{
            str = "{}";
        }
        return str;
    }

    /* 1 0 0 
       0 1 0
       0 0 1
     */

}
