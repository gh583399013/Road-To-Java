package test001;

public class OriginQuickSort {
	public static void quickSort(int[] arr, int start, int end){
		if(start >= end){
			System.out.println("########");
			return ;
		}
		
		int left = start;
		int right = end;
		
		
		int waitSwap = start;
		int waitSwapNum = arr[waitSwap];
//		int tmpNum = arr[0];
		while(start < end){
			while(arr[end] >= waitSwapNum && start < end){
				end--;
			}
			while(arr[start] <= waitSwapNum && start < end){
				start++;
			}
			if(start < end){
				int swapNum = arr[end];
				arr[end] = arr[start];
				arr[start] = swapNum;
			}
		}
		int swapNum = arr[start];
		arr[start] = arr[waitSwap];
		arr[waitSwap] = swapNum;
		
		quickSort(arr, left, start -1);
		quickSort(arr, start + 1, right);
	}
	
	public static void main(String[] args) {
		int[] arr = {6,1,2,7,9};
		OriginQuickSort.quickSort(arr, 0, arr.length-1);
		for(int a: arr){
			System.out.println(a + "#");
		}
	}
}
