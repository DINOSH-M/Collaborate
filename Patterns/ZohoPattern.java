package com.numbers;

/*
   print the pattern 
   
 for n = 3  for n = 4     for n = 5  and so on...
   
  1 3 6      1 3 6 10      1 2 6 10 15
  2 5        2 5 9         2 5 9 14
  4          4 8           4 8 13
             7             7 12
                           11
*/

import java.util.Scanner;

public class ZohoPattern {
	public static void print(int n) {
		int matrix[][] = new int[n][n],number = 1;
		
		for(int k = 0 ; k < n ; k++) {
			for(int i = k ,j = 0 ; i>=0 ; i--,j++) {
				matrix[i][j] = number++ ;
			}
		}
		
		for(int i = 0 ; i < n ;i++) {
			for(int j = 0 ; j < n ; j++) {
				if(matrix[i][j] != 0)
					System.out.print(matrix[i][j]+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in) ;
		System.out.print("enter number : ");
		int n = s.nextInt();
		print(n) ;
	}
}
