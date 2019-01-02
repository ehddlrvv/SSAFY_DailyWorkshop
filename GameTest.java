package com.ssafy.java;

import java.util.Scanner;

public class GameTest {
	private static int user_win = 0;
	private static int com_win = 0;
	
	public static void main(String[] args) {
		System.out.println(">>가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
		System.out.println("1. 5판 3승");
		System.out.println("2. 3판 2승");
		System.out.println("3. 1판 1승");
		System.out.print("번호를 입력하세요.");
		
		// User input and setting
		Scanner sc = new Scanner(System.in);
		int type = sc.nextInt();
		int loop = 0;
		int goal = 0;
		
		switch(type) {
			// 5판 3승
			case 1 : 
				loop = 5;
				goal = 3;
				break;
			// 3판 2승
			case 2 : 
				loop = 3;
				goal = 2;
				break;
			// 1판 1승
			default :
				loop = 1;
				goal = 1;
				break;
		}
		
		// 선택만큼 반복
		for(int i = 0; i < loop; ++i) {
			if(goal == user_win || goal == com_win) break;
			System.out.print("가위바위보 중 하나 입력: ");
			System.out.println(rockScissorsPaperByRandom(sc.next()));
		}
		
		System.out.println();
		
		// 결과 출력
		if(user_win == com_win) 
			System.out.println("### 비겼습니다!!!");
		else if(user_win > com_win) 
			System.out.println("### 사용자 승!!!");
		else 
			System.out.println("### 컴퓨터 승!!!");
	}
	/**
	 * 사용자 입력(가위,바위,보)에 따라 임의로 컴퓨터가 난수를 발생시켜 결과 누적 및 string 결과 반환
	 * @param user 사용자 입력(가위,바위,보)
	 * @return 결과 string
	 */
	public static String rockScissorsPaperByRandom(String user) {
		int computer = (int)(Math.random() * 3) + 1;
		int result = 0; // 1 : win 2 : lose 3 : equal
		switch (computer) {
		// 가위
		case 1:
			if(user == "가위") result = 3;
			else if(user == "바위") result = 1;
			else result = 2;
			break;
		// 바위
		case 2:
			if(user == "가위") result = 2;
			else if(user == "바위") result = 3;
			else result = 1;
			break;
		// 보
		default:
			if(user == "가위") result = 1;
			else if(user == "바위") result = 2;
			else result = 3;
			break;
		}
		String str = "";
		if(result == 1) {
			user_win++;
			str = "이겼습니다!!!";
		}
		else if(result == 2) {
			str = "비겼습니다!!!";
		}
		else {
			com_win++;
			str = "졌습니다!!!";
		}
		return str;
	}
}
