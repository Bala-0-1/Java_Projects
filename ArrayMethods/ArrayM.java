

public class ArrayM {

    private int arrNumber[];

    public ArrayM(int n, int[] arr){
        arrNumber = new int[n];
        arrNumber = arr;

    }

    public int findMin(){
        int min = arrNumber[0];
        for(int i = 0;i<arrNumber.length;i++){
            if(arrNumber[i]<min){
                min = arrNumber[i];
            }
        }
        return min;
    }
    
    public int findMax(){
    int max = arrNumber[0];
    for(int i = 0;i<arrNumber.length;i++){
        if(arrNumber[i]>max){
            max = arrNumber[i];
        }
    }
    return max;
    }
    
    public int sum(){
        int arrSum = 0;
        for(int i=0;i<arrNumber.length;i++){
            arrSum+=arrNumber[i];
        }
        return arrSum;
    }

    public boolean isExist(int num){
        boolean flag=false;
        for(int i=0;i<arrNumber.length;i++){
            if(arrNumber[i] == num){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public void disp(){
        String temp = "[";
        for(int i=0;i<arrNumber.length;i++){
            temp+=arrNumber[i]+", ";
        }
        temp+="]";
        System.out.println(temp);
    }

    public void disp1(int[] arrNumber){
    String temp = "[";
    for(int i=0;i<arrNumber.length;i++){
        temp+=arrNumber[i]+", ";
    }
    temp+="]";
    System.out.println(temp);
    }

    public int valueOfIndex(int index){
        return arrNumber[index];
    }

    public boolean isDivisible(int num){
        boolean flag = false;
        for(int i=0;i<arrNumber.length;i++){
            if(arrNumber[i]%num == 0){
                flag = true;
                break;
            }
        }
        return flag;
    }


    //another method that also returns the numbers that are divisible by the given number

    public void divisibleValues(int num){
        int[] divisible = new int[arrNumber.length];
        int index = 0;
        for(int i=0;i<arrNumber.length;i++){
            if(arrNumber[i]%num == 0){
                divisible[index] = arrNumber[i];
                index++;
            }           
        }
        disp1(divisible);
    }

    public boolean isOddSum(){
        return (sum()%2 != 0);
    }

    public boolean isEvenSum(){
        return (sum()%2 == 0);
    }

}
