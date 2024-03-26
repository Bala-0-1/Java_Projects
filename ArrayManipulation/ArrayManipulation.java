package ArrayManipulation;

public class ArrayManipulation {
    int arr[];
    public ArrayManipulation(){
        this.arr = new int[]{1,2,3,4,5};
    }
    public ArrayManipulation(int[] arr){
        this.arr = arr;
    }

    public ArrayManipulation add(int value){
        int[] newArr = new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            newArr[i] = arr[i];
        }
        newArr[arr.length] = value;
        return new ArrayManipulation(newArr);
    }
    
    public ArrayManipulation removeValue(int value){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != value){
                count++;
            }
        }
        int[] newArr = new int[count];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != value){
                newArr[index] = arr[i];
                index++;
            }
        }
        return new ArrayManipulation(newArr);
    }

    // public ArrayManipulation removeValue(int value) {
    //     int[] newArr = new int[arr.length];
    //     int count = 0; // Initialize a count variable to keep track of non-matching elements
        
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] != value) {
    //             newArr[count] = arr[i];
    //             count++; // Increment the count for each non-matching element
    //         }
    //     }
        
    //     // Create a new array with the correct size (count)
    //     int[] finalArray = new int[count];
        
    //     // Copy the non-matching elements from newArr to finalArray
    //     for (int i = 0; i < count; i++) {
    //         finalArray[i] = newArr[i];
    //     }
        
    //     return new ArrayManipulation(finalArray);
    // }

    
    public ArrayManipulation modifyValue(int index, int value){
        int[] newArr = arr;
        newArr[index] = value;
        return new ArrayManipulation(newArr);
    }

    public int[] cloneArray(){
        int[] newArr = arr;
        return newArr;
    }

    public void disp(int[] arr){
        String temp = "[";
        for(int i=0;i<arr.length;i++){
            if(i!=arr.length-1){
            temp+=arr[i]+", ";
            }
            else{
                temp+=arr[i];
            }
        }
        temp+="]";
        System.out.println(temp);
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




    public ArrayManipulation insertbyindex(int index, int val){
        int[] newArr = new int[this.arr.length+1];
        for(int i=0;i<index;i++){
            newArr[i] = arr[i];
        }
        newArr[index] = val;
        for(int i = index;i<newArr.length-1;i++){
            newArr[i+1] = arr[i];
        } 
        return new ArrayManipulation(newArr);
    }

    public static void main(String args[]){
        ArrayManipulation a = new ArrayManipulation(new int[]{32,12,3,45,6});
        System.out.println("The initial array is : "+a);
        System.out.println("Adding 3 to the array : "+a.add(3));
        System.out.println("Removing 12 from the array : "+a.removeValue(12));
        System.out.println("modifying the second index to 5 : "+a.modifyValue(2, 5));
        System.out.println("Inserting 9 into the third index : "+a.insertbyindex(3, 9));
    

    }
    }

