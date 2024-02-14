package ran;

import java.util.Random;
import java.util.Scanner;

public class quiz004 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int num1, num2, sum;
		int a=1; //game over뜰때 0과 숫자차이
		while(true) {
			num1 = rand.nextInt(10)+1; //1부터 내가 max값으로 지정하고 싶은 수까지 랜덤으로 뽑히게끔한다
			num2 = rand.nextInt(10)+1;//10은 0~9까지의 숫자

			System.out.println(num1+"+"+num2+"= : ");
			int b = input.nextInt();
			sum = num1 +num2;
			if(a==5) {
				System.out.println("game over");
				break;
			}else if(b != sum) {
				System.out.println("fail");
				a++; //있어야 break로 빠져나온다, 위치조심
			}else if(b == sum) {
				System.out.println("success");
			}
		}

	}

}
