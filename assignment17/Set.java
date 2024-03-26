package assignment17;

public class Set {
    int data[];
    public Set(){
        this.data = new int[]{34,56,78,90};
    }
    public Set(int[] data){
        this.data = data;
    }
    public boolean isExists(int[] data, int value){
        boolean flag = false;
        for(int i=0;i<data.length;i++){
            if(data[i] == value){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public int length(){
        return this.data.length;
    }

    public int[] union(Set obj){
        int[] arr = new int[this.length()+obj.length()];
        for(int i = 0;i<this.data.length;i++){
            arr[i] = this.data[i];
        }
        int counter = this.data.length;
        for(int i = 0;i<obj.data.length;i++){
            if(!isExists(arr, obj.data[i])){
                arr[counter] = obj.data[i];
                counter++;
            }
        }
        return arr;
    }

    public String toString(){
        String res = "";
        if(data!=null || data.length > 0){
            res = "[";
            for(int i = 0; i< data.length;i++){
                if(i != data.length - 1){
                    res = res + data[i] + ", ";
                }
                else{
                    res = res + data[i] + "]";
                }
            }
        }
        else{
            res = "[]";
        }
        return res;
    }

    public int[] removeZeroes(int[] arr){
        int j=0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                j+=1;
            }
        }
        int[] finalArray = new int[j];
        int ind=0;
        for(int i=0; i<finalArray.length; i++){
            if (arr[i]!=0){
                finalArray[ind]=arr[i];
                ind++;
            }
        }
        return finalArray;
    }

    public static void main(String args[]){
        Set setA = new Set(new int[]{23,56,78,90});
        Set setB = new Set(new int[]{20,50,78,95});
        System.out.println("Union of two sets : "+new Set(setA.union(setB)));
        Set setObj = new Set();
        System.out.println("After removing zeroes : "+new Set(setObj.removeZeroes(setA.union(setB))));
    }
}
