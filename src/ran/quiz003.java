package ran;

import java.util.Random;
import java.util.Scanner;

public class quiz003 {//가위바위보게임
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("====가위바위보=====");
		System.out.println("숫자 선택하세요(1.가위/ 2. 바위/ 3.보) : ");

		int inputNum = sc.nextInt();
		if(inputNum == 1) {
			System.out.println("당신은 가위를 냈습니다");
		}else if( inputNum ==2 ) {
			System.out.println("당신은 바위를 냈습니다");
		}else if (inputNum == 3) {
			System.out.println("당신은 보를 냈습니다");
		}else {
			System.out.println("1~3숫자를 골라주세요");
		}

		int computer = rand.nextInt(3)+1;
		if(computer == 1) {
			System.out.println("컴퓨터가 가위를 냈습니다");
		}else if(computer == 2) {
			System.out.println("컴퓨터가 바위를 냈습니다");
		}else if(computer ==3 ) {
			System.out.println("컴퓨터가 보를 냈습니다");
		}else {
			System.out.println("====================");
		}
		if (inputNum >0&& inputNum <4) {
			if(inputNum == 1) {
				if(computer == 1) {
					System.out.println("비겼습니다");
				}else if(computer == 2) {
					System.out.println("당신이 졌습니다");
				}else {
					System.out.println("당신이 이겼습니다");
				}

			}else if(inputNum ==2) {
				if(computer == 1) {
					System.out.println("당신이 이겼습니다");
				}else if(computer == 2) {
					System.out.println("비겼습니다");
				}else {
					System.out.println("당신이 졌습니다");
				}

			}else if(inputNum == 3) {
				if(computer == 1) {
					System.out.println("당신이 졌습니다");
				}else if(computer == 2) {
					System.out.println("당신이 이겼습니다");
				}else {
					System.out.println("비겼습니다");
				}

			}else {
				System.out.println("1~3의 숫자를 입력하세요");
			}
		}
	}

}
