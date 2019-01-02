package com.ssafy.java;

public class DigitTest2 {

	public static void main(String[] args) {
		int num = 1;
		for(int i = 5; i > 0; i -=2) {
			for(int j = 0; j < (5 - i) / 2; ++j)
				System.out.print("   ");
			for(int j = 0; j < i; ++j)
				System.out.print(String.format("%3d", num++));
			System.out.println();
		}
		for(int i = 3; i <= 5; i +=2) {
			for(int j = 0; j < (5 - i) / 2; ++j)
				System.out.print("   ");
			for(int j = 0; j < i; ++j)
				System.out.print(String.format("%3d", num++));
			System.out.println();
		}
	}

}
