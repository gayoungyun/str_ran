package ran;

import java.util.Random;

public class quiz001 {// 로또번호 생성
	public static void main(String[] args) {
		
		Random rd = new Random(); //랜덤 객체 생성
		
		for(int i=0; i<6; i++) {
			System.out.println("["+(rd.nextInt(45)+1)+"]"); //1~n사이의 난수 발생 공식(n)+1
		}
		
		
	}

}
