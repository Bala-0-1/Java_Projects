package UmaSanProgrammingPuzzles;

public class RecursionMatch {
    int[] arr;
    int count = 0; 
    static int maxLength;
    static int minLength;
    public RecursionMatch(){
        this.arr = new int[]{1,2,3,4,5};
        maxLength = this.arr.length;
    }

    public RecursionMatch(int[] arr){
        this.arr = arr;
    }
    public static void main(String args[]){
        RecursionMatch r1 = new RecursionMatch(new int[]{1,2,5,3,5,6});
        RecursionMatch r2 = new RecursionMatch(new int[]{7,6,4,6});
        maxLength = (r1.arr.length<r2.arr.length) ? r1.arr.length-1 : r2.arr.length-1;
        minLength = (r1.arr.length>r2.arr.length) ? r1.arr.length-1 : r2.arr.length-1;
        System.out.println("First array : "+r1);
        System.out.println("Second array : "+r2);
        System.out.println("Number of pairs : "+r1.countPairs(r2, (r1.arr.length>r2.arr.length) ? minLength : maxLength
        ,(r1.arr.length>r2.arr.length) ? maxLength : minLength));
    }

    public int countPairs(RecursionMatch obj,int maxLength,int minLength){
        if(maxLength == 0){
            return count;
        }
        else if(this.arr[maxLength] == obj.arr[minLength]){
            count+=1;
            return countPairs(obj, maxLength-1,minLength-1);
        }
        else{
            return countPairs(obj, maxLength-1,minLength-1);
        }
    }

      public String toString(){
        String res = "";
        if(arr!=null || arr.length > 0){
            res = "[";
            for(int i = 0; i< arr.length;i++){
                if(i != arr.length - 1){
                    res = res + arr[i] + ", ";
                }
                else{
                    res = res + arr[i] + "]";
                }
            }
        }
        else{
            res = "[]";
        }
        return res;
    }

    
}
