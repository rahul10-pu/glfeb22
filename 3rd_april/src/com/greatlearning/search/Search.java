package com.greatlearning.search;

public class Search {
	 int findPivotElement(int arr[], int low, int high) {
			
			if (high < low)
				return -1;
			else if (high == low)
				return low;

			
			int mid = (low + high) / 2;
			
			if (mid < high && arr[mid] > arr[mid + 1])
				return mid+1;
			
			else if (mid > low && arr[mid] < arr[mid - 1])
				return (mid - 1);
			
			else if (arr[low] >= arr[mid])
				return findPivotElement(arr, low, mid - 1);
			
			return findPivotElement(arr, mid + 1, high);
		}

		
}
