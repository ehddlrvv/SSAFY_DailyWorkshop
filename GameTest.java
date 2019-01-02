package com.ssafy.java;

import java.util.Scanner;

public class GameTest {
	private static int user_win = 0;
	private static int com_win = 0;
	
	public static void main(String[] args) {
		System.out.println(">>���������� ������ �����մϴ�. �Ʒ� ���� �� �ϳ��� ������.");
		System.out.println("1. 5�� 3��");
		System.out.println("2. 3�� 2��");
		System.out.println("3. 1�� 1��");
		System.out.print("��ȣ�� �Է��ϼ���.");
		
		// User input and setting
		Scanner sc = new Scanner(System.in);
		int type = sc.nextInt();
		int loop = 0;
		int goal = 0;
		
		switch(type) {
			// 5�� 3��
			case 1 : 
				loop = 5;
				goal = 3;
				break;
			// 3�� 2��
			case 2 : 
				loop = 3;
				goal = 2;
				break;
			// 1�� 1��
			default :
				loop = 1;
				goal = 1;
				break;
		}
		
		// ���ø�ŭ �ݺ�
		for(int i = 0; i < loop; ++i) {
			if(goal == user_win || goal == com_win) break;
			System.out.print("���������� �� �ϳ� �Է�: ");
			System.out.println(rockScissorsPaperByRandom(sc.next()));
		}
		
		System.out.println();
		
		// ��� ���
		if(user_win == com_win) 
			System.out.println("### �����ϴ�!!!");
		else if(user_win > com_win) 
			System.out.println("### ����� ��!!!");
		else 
			System.out.println("### ��ǻ�� ��!!!");
	}
	/**
	 * ����� �Է�(����,����,��)�� ���� ���Ƿ� ��ǻ�Ͱ� ������ �߻����� ��� ���� �� string ��� ��ȯ
	 * @param user ����� �Է�(����,����,��)
	 * @return ��� string
	 */
	public static String rockScissorsPaperByRandom(String user) {
		int computer = (int)(Math.random() * 3) + 1;
		int result = 0; // 1 : win 2 : lose 3 : equal
		switch (computer) {
		// ����
		case 1:
			if(user == "����") result = 3;
			else if(user == "����") result = 1;
			else result = 2;
			break;
		// ����
		case 2:
			if(user == "����") result = 2;
			else if(user == "����") result = 3;
			else result = 1;
			break;
		// ��
		default:
			if(user == "����") result = 1;
			else if(user == "����") result = 2;
			else result = 3;
			break;
		}
		String str = "";
		if(result == 1) {
			user_win++;
			str = "�̰���ϴ�!!!";
		}
		else if(result == 2) {
			str = "�����ϴ�!!!";
		}
		else {
			com_win++;
			str = "�����ϴ�!!!";
		}
		return str;
	}
}
