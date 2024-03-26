package androiddsaquestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {

    ArrayList<Persons> arr = new ArrayList();
    
    ArrayList<Integer> arr1 = new ArrayList<>();

    int removeCount = 0;

    public static void main(String[] args) {
        Test t = new Test();
        t.arr.add(new Persons("abc","1900-1950"));
        t.arr.add(new Persons("def","1910-1940"));
        t.arr.add(new Persons("ghi","1920-1970"));
        t.arr.add(new Persons("jkl","1800-1950"));
        t.arr.add(new Persons("mno","1905-1930"));

        t.arr1.add(5);
        t.arr1.add(7);
        t.arr1.add(8);
        t.arr1.add(12);
        t.arr1.add(16);

        // System.out.println("Is 10 a prime number : "+t.isPrime(10));
        // System.out.println("Population at 1930 : "+t.populationAtN(1930));
        // System.out.println("Number of one in binary of 10 : "+t.onesInBinary(10));
        System.out.println(t.sortByPrime(t.arr1));

    }

     public ArrayList<Integer> insertionSort(ArrayList<Integer> elements){
        int count = 0;
        for(int i=1; i<elements.size(); i++){
            int key = elements.get(i);
            int j= i-1;
            count++;
            while (j>=0 && key < elements.get(j)) {
                count+=1;
                elements.set(j+1, elements.get(j));
                j = j-1;
            }
            elements.set(j+1, key);
        }
        return elements;

    }



    public ArrayList<Integer> sortByPrime(ArrayList<Integer> arr){
        ArrayList<Integer> sortedList = new ArrayList<>();

        ArrayList<Integer> arr1 = new ArrayList<>();

        for(int i : arr){
            int nearestPrimeOfI = nearestPrime(i);
            arr1.add(nearestPrimeOfI);
        }

        ArrayList<Integer> arr2 = insertionSort(arr1);

        for(int i: arr2){
            sortedList.add(arr.get(arr1.indexOf(i)));
            System.out.println(sortedList);
            System.out.println(arr1);
            removeItem(arr1.indexOf(i));
        }
        return sortedList;
    }

    public synchronized void removeItem(int index){
        arr1.remove(arr1.get(index));
        removeCount++;
    }

    public int nearestPrime(int num){
        int prime1 = 0;
        int prime2 = 0;

        for(int i = num;i>=2;i--){
            if(isPrime(i)){
                prime1 = i;
                break;
            }
        }
        for(int i = 2;i<=num;i++){
            if(isPrime(i)){
                prime2 = i;
                break;
            }
        }

        return ((num-prime1) > (num - prime2))?prime2 : prime1;
    }

    public int onesInBinary(int num){
        int num1 = num;
        String str = "";
        while(num1 != 0){
            int temp = num1%2;
            num1 = Math.round(num1/2);
            str += String.valueOf(temp);

        }

        return count(str,'1');
        
    }

    public int count(String str1, char str2){
        int count = 0;
        for(int i = 0;i<str1.length();i++){
            if(str1.charAt(i) == str2){
                count+=1;
            }
        }
        return count;
    }

    public String rev(String str){
        String reversedString = "";
        int index = str.length()-1;
    
        for(int i = 0;i<str.length();i++){
            reversedString+=str.charAt(index);
            index--;
        }

        return reversedString;
    }

    public void pattern1(int num){
        int count = 1;
        for(int i = 0;i<num;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(count);
                if(Math.ceil(num%2) <= j){
                    count--;
                }
                else{
                    count++;
                }
                
            }
            System.out.println();
        }
    }

    public int populationAtN(int num){
        int count = 0;
        for(Persons i : arr){
            String[] str = i.lifeSpan.split("-");
            int num1 = Integer.parseInt(str[0]);
            int num2 = Integer.parseInt(str[1]);
            for(int j = num1;j<=num2;j++){
                if(num == j){
                    count+=1;
                    break;
                }
            }
            
        }
        return count;
    }

    public boolean isPrime(int num){
        for(int i = 2;i<Math.round(Math.pow(num,0.5));i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

   

}


class Persons{
    String name;
    String lifeSpan;

    public Persons(){

    }

    public Persons(String name, String lifeSpan){
        this.name = name;
        this.lifeSpan = lifeSpan;
    }

}

