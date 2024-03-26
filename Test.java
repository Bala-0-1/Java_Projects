// /* package codechef; // don't place package name! */

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// /* Name of the class has to be "Main" only if the class is public. */
// class Codechef
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		// your code goes here
// 		Scanner scanner = new Scanner(System.in);
//         int T = scanner.nextInt(); 

//         for (int t = 0; t < T; t++) {
//             int n = scanner.nextInt(); 
//             int[] lst = new int[n];

//             // Read the list of numbers
//             for (int i = 0; i < n; i++) {
//                 lst[i] = scanner.nextInt();
//             }

//             int count = 0;
//             int jValue = 0;
//             for (int i = 0; i < n; i++) {
//                 for (int j = jValue; j < n; j++) {
//                     // System.out.println("["+lst[i]+","+lst[j]+"]");
//                     if (lst[i] <= lst[j]) {
//                         int temp = lst[i] + lst[j];
//                         int indexI = i + 1;
//                         int indexJ = j + 1;
//                         // System.out.println("["+lst[i]+","+lst[j]+"]");
//                         // System.out.println("("+indexI+","+indexJ+")");
//                         if (temp % (indexI + indexJ) == 0 && lst[i] != lst[j]) {
//                             // System.out.println("asDZxf : "+lst[i]+" "+lst[j]);
//                             count+=2;
//                         }

//                         else if (temp % (indexI + indexJ) == 0) {
//                             // System.out.println(lst[i]+" "+lst[j]);
//                             count++;
//                         }

//                     }
                    
//                 }
//                 jValue++;
//             }

//             System.out.println(count);
//         }
		
// 	}
// }


// /* package codechef; // don't place package name! */

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// /* Name of the class has to be "Main" only if the class is public. */
// class Codechef
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		// your code goes here
// 		Scanner scanner = new Scanner(System.in);
//         int T = scanner.nextInt(); 

//         for (int t = 0; t < T; t++) {
//             int n = scanner.nextInt(); 
//             int[] lst = new int[n];

//             // Read the list of numbers
//             for (int i = 0; i < n; i++) {
//                 lst[i] = scanner.nextInt();
//             }

//             int count = 0;

//             for (int i = 0; i < n; i++) {
//                 for (int j = 0; j < n; j++) {
//                     if (lst[i] <= lst[j]) {
//                         int temp = lst[i] + lst[j];
//                         int indexI = i + 1;
//                         int indexJ = j + 1;
                        
//                         if (temp % (indexI + indexJ) == 0) {
//                             count++;
//                         }
//                     }
//                 }
//             }

//             System.out.println(count);
//         }
		
// 	}
// }

import java.util.ArrayList;

class Test{
    public static void main(String[] args) {
        ArrayList<Long> ar = new ArrayList<>();
        while(true){
            ar.add(1000000000000000000l);
        }
    }
}