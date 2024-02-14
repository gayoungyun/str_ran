package ran;

import java.util.Random;//배열 고정크기,처리속도 빠름/ list 공간 유연, 가변크기

public class Ex01 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println(Math.random());
		}
		System.out.println("---------");
		for(int i=0; i<5; i++) {
			double dou = Math.random()*3;
			System.out.println((int)dou);
	}
		System.out.println("==========");
		Random r = new Random();
		for(int i=0; i<5;i++) {
			int num = r.nextInt(3); //0-2
			System.out.println(num);
		}
	}
}
