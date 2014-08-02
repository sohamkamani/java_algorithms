package algorithms;

import java.util.Random;

public class Main {
	
	public static void main(String [] args){
		int [] a = {1,2};
		swap(a);
		/*int c = a;
		a=b;
		b=c;*/
		System.out.println(a[0]);
		System.out.println(a[1]);

	}
	
	public static void printArray(int [] i){
		for(int item : i){
			System.out.print(item);
			System.out.print(" ");
			
		}
		System.out.println();
	}
	
	public static void swap(int [] x){
		int c = x[0];
		x[0]=x[1];
		x[1]=c;
	}

}
