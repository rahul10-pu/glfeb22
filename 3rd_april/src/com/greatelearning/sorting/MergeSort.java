package com.greatelearning.sorting;

public class MergeSort {

	public void merge(int arr[],int left,int mid, int right) {
		//get the length for first and secod array
		int l1=mid-left+1;
		int l2=right-mid;
		//create 2 array
		int leftArray[]=new int[l1];
		int rightArray[]=new int[l2];
		
		//copy left array content from arr to leftArray
		for(int i=0;i<l1;i++) {
			leftArray[i]=arr[i];
		}
		//copy right array content from arr to rightArray
		for(int i=0;i<l2;i++) {
			rightArray[i]=arr[i];
		}
		//npw merge will happen in original array
		//2 pointer, i for left array, j for right array
		int i=0, j=0;
		//take k which will increment for original array
		int k=left;
		while(i<l1 && j<l2) {
			if(leftArray[i]<rightArray[j]) {
				arr[k]=leftArray[i];
				i++;
			}else {
				arr[k]=rightArray[j];
				j++;
			}
			k++;
		}
		while(i<l1) {
			arr[k]=leftArray[i];
			i++;
			k++;
		}
		while(j<l2) {
			arr[k]=rightArray[j];
			j++;
			k++;
		}
		
	}
	
	public void divide(int arr[],int left, int right) {
		if(left<right) {
			int mid=(left+right)/2;
			divide(arr,left,mid);
			divide(arr,mid+1,right);
			merge(arr,left,mid,right);
		}else {
			return;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


//public void mergeSort(int[] inputArray){
//	int inputSize = inputArray.length;
//	int midIndex = inputSize/2;
//	
//	if(inputSize<2){
//		return;
//	}
//
//	int[] leftArray = new int[midIndex];
//	int[] rightArray = new int[inputSize-midIndex];
//
//	for(int i=0;i<midIndes;i++)
//	{
//		leftArray[i]=inputArray[i];
//	}
//
//	for(int i=0;i<inputSize;i++){
//		rightArray[i-midIndex]=inputArray[i];
//	}
//
//	mergeSort(leftArray);
//	mergeSort(rightArray);
//	merge(arr, leftArray, rightArray);
//}





