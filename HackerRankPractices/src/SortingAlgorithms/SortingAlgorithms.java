package SortingAlgorithms;
import java.util.ArrayList;

public class SortingAlgorithms {
	public static int[] bubbleSort(int[] arrayToSort)
	{
		int length = arrayToSort.length;
		for(int i = 0; i < length - 1; i++)
		{
			for(int j = 0; j < length - 1 - i; j ++) 
			{
				if(arrayToSort[j] > arrayToSort[j+1]) {
					int temp = arrayToSort[j];
					arrayToSort[j] = arrayToSort[j+1];
					arrayToSort[j+1] = temp;
				}
			}
		}
		return arrayToSort;
	}
	
	public static int[] selectionSort(int[] arrayToSort)
	{
		for(int i = 0; i < arrayToSort.length -1; i++)
		{
			int min_idx = i;
			for(int j = i+1; j < arrayToSort.length; j++)
			{
				if(arrayToSort[j] < arrayToSort[min_idx])
				{
					int temp = arrayToSort[j];
					arrayToSort[j] = arrayToSort[min_idx];
					arrayToSort[min_idx] = temp;
				}
			}
		}
		return arrayToSort;
	}
	
	public static int[] insertionSort(int[] array)
	{
		int length = array.length;
		for(int i = 1; i < length; i++)
		{
			int key = array[i];
			int j = i -1;
			while(j>=0 && array[j] > key)
			{
				int temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				j--;
			}
		}
		return array;
	}
	
	// Quicksort methods
	/* This function takes last element as pivot,
    places the pivot element at its correct
    position in sorted array, and places all
    smaller (smaller than pivot) to left of
    pivot and all greater elements to right
    of pivot */
 private static int partition(int arr[], int low, int high)
 {
     int pivot = arr[high]; 
     int i = (low-1); // index of smaller element
     for (int j=low; j<high; j++)
     {
         // If current element is smaller than or
         // equal to pivot
         if (arr[j] <= pivot)
         {
             i++;

             // swap arr[i] and arr[j]
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
         }
     }

     // swap arr[i+1] and arr[high] (or pivot)
     int temp = arr[i+1];
     arr[i+1] = arr[high];
     arr[high] = temp;

     return i+1;
 }


 /* The main function that implements QuickSort()
   arr[] --> Array to be sorted,
   low  --> Starting index,
   high  --> Ending index */
 public static void quicksort(int arr[], int low, int high)
 {
     if (low < high)
     {
         /* pi is partitioning index, arr[pi] is 
           now at right place */
         int pi = partition(arr, low, high);

         // Recursively sort elements before
         // partition and after partition
         quicksort(arr, low, pi-1);
         quicksort(arr, pi+1, high);
     }
 }
	{
		
	}
}
