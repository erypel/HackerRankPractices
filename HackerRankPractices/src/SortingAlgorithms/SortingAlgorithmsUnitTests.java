package SortingAlgorithms;
import org.junit.jupiter.api.Test;

public class SortingAlgorithmsUnitTests {
	int[] arr1 = {1, 7, 3, 2, 6, 9};
	int[] arr2 = {6, 6};
	int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	int[] arr4 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
	
	public void printArray(int[] array)
	{
		System.out.print("[");
		for(int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i] + " ");
		}
		System.out.print("]");
	}
	
	@Test
	public void testBubbleSort()
	{
		printArray(SortingAlgorithms.bubbleSort(arr1));
		printArray(SortingAlgorithms.bubbleSort(arr2));
		printArray(SortingAlgorithms.bubbleSort(arr3));
		printArray(SortingAlgorithms.bubbleSort(arr4));
	}
	
	@Test
	public void testSelectionSort()
	{
		printArray(SortingAlgorithms.selectionSort(arr1));
		printArray(SortingAlgorithms.selectionSort(arr2));
		printArray(SortingAlgorithms.selectionSort(arr3));
		printArray(SortingAlgorithms.selectionSort(arr4));
	}
	
	@Test
	public void testInsertionSort()
	{
		printArray(SortingAlgorithms.insertionSort(arr1));
		printArray(SortingAlgorithms.insertionSort(arr2));
		printArray(SortingAlgorithms.insertionSort(arr3));
		printArray(SortingAlgorithms.insertionSort(arr4));
	}
	
	@Test
	public void testQuickSort()
	{
		SortingAlgorithms.quicksort(arr1, 0, arr1.length -1);
		SortingAlgorithms.quicksort(arr2, 0, arr2.length -1);
		SortingAlgorithms.quicksort(arr3, 0, arr3.length -1);
		SortingAlgorithms.quicksort(arr4, 0, arr4.length - 1);
		printArray(arr1);
		printArray(arr2);
		printArray(arr3);
		printArray(arr4);
	}
}

