package com.edu;

import java.util.Scanner;

class BinarySearch{
	int arr[],size,key;
	
	void inputData() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array");
		size=sc.nextInt();
		arr=new int[size];
		System.out.println("Enter "+size+"array element in ascendind order" );
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the search element");
		key=sc.nextInt();
	}
	public void searchBinary() {
		int l,h,mid=0,pos=-1;
		l=0;
		h=size-1;
		
		while(l<=h) {
			mid=(l+h)/2;
			if(key==arr[mid]) {
				pos=mid;
				break;
			}
			else if(key>arr[mid]) {
				l=mid+1;
				
			}
		}
		if(pos>=0) {
			System.out.println(key+" found at " +(mid+1));
		}else {
			System.out.println(key+"notfound");
		}
	}
}

public class BinarySearchEdu {

	
	
	public static void main(String[] args) {
		BinarySearch bob=new BinarySearch();
		bob.inputData();
		bob.searchBinary();
	}

}
