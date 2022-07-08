
package sort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){ 
   System.out.println("*********************************************************************************************");     
   System.out.println("*Algorithm Sorting Program for comparison & Analysis of Runtime of different sorting method *");
   System.out.println("*********************************************************************************************");
   System.out.println("Please enter the number of integers to be sorted:");         
   Scanner scanner = new Scanner(System.in);        
   int n = scanner.nextInt();         
   int A [] = new int[n];         
   int B [] = new int[n];         
   long start,end;         
   for(int i = 0;i<n;i++)            
   A[i] = (int)(Math.random()*100000) + 1;                     
   
// BUBBLE SORT Method, Runtime in nanoseconds   
   System.arraycopy(A,0,B,0,n);          
   start = System.nanoTime();        
   SortTest.sorttest(A,SortTest.SortingAlgorithm.BUBBLE_SORT);        
   end = System.nanoTime();  
   System.out.println("****************************************************************");
   System.out.println("*     RUNTIME for Bubble Sort Algorithm :" + (end-start)+ " nanoseconds  *");       
   
// INSERTION SORT, Runtime in nanoseconds        
   System.arraycopy(A,0,B,0,n);        
   start = System.nanoTime();       
   SortTest.sorttest(A,SortTest.SortingAlgorithm.INSERTION_SORT);        
   end = System.nanoTime();         
   System.out.println("*     RUNTIME for Insertion Sort Algorithm:" + (end-start)+ " nanoseconds  *");   
   
// SELECTION SORT, Runtime in nanoseconds          
   System.arraycopy(A,0,B,0,n);         
   start = System.nanoTime();        
   SortTest.sorttest(A,SortTest.SortingAlgorithm.SELECTION_SORT);        
   end = System.nanoTime();         
   System.out.println("*     RUNTIME for Selection Sort Algorithm :" + (end-start)+ " nanoseconds *");
   System.out.println("****************************************************************");
   }
       public static  void DisplayArray(int A[]){         
           System.out.print("[");        
           for (int element : A){           
               System.out.print(element+",");         
           }         
           System.out.println("\b]");     
       } 
}
