
package sort;

public class SortTest {
public enum SortingAlgorithm { BUBBLE_SORT, INSERTION_SORT, SELECTION_SORT  }      
     public static void sorttest(int A[], SortingAlgorithm sortingAlgo){     
         switch (sortingAlgo) {  
            case BUBBLE_SORT:      
                 bubbleSort(A);                
            break;             
            case INSERTION_SORT:                 
                 insertionSort(A);  
            break;             
            case SELECTION_SORT:    
                 selectionSort(A);        
            break;                   
            default:                
                 System.out.println("Invalid Sorting Algorithm ");                 
                 break;         } 
     }
     
     private static void bubbleSort(int A[]) {         
         int n = A.length,temp;         
         for(int i = 0;i<n-1;i++){             
             for(int j = i+1; j<n;j++){                 
                 if(A[i]>A[j]){                     
                     temp = A[i];                    
                     A[i] = A[j];                    
                     A[j] = temp;                
                 }             
             }         
         }      
     }
     
     private static void insertionSort(int A[]) {          
         int n = A.length;         
         int key,j;         
         for(int i = 1;i<n;i++){             
             key = A[i];             
             j= i-1;             
             while(j>=0 && A[j]>key){                 
                 A[j+1] =A[j];                 
                 j--;             
             }             
             A[j+1]=key;         
         }      
     }
     
     private static void selectionSort(int A[]) {        
         
         int n = A.length;         
         int min_index,temp;       
         for(int i = 1;i<n;i++){            
             min_index = i;             
             for (int j=i+1;j<n;j++){                 
                 if(A[j]<A[min_index])                     
                     min_index = j;             
             }  
             temp = A[i];             
             A[i] = A[min_index];             
             A[min_index]=temp;         
         }     
     }            
}
