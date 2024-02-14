package ran;

import java.util.Random;

public class quiz002 {//3개의 문자열이 같은 것이 나오게 하는 게임
	public static void main(String[] args) {
		String[] items = {"cherry", "apple", "banna", "melon","7"};
		
		Random random = new Random();
		
		int []nums = new int [3];
		for(int i=0; i<nums.length; i++) {
			nums[i]= random.nextInt(5);
		}
		String result = items[nums[0]]+"|"+items[nums[1]]+"|"+items[nums[2]];
		System.out.println(result);
		
		int[]point = {10, 20, 30, 40 , 1000};
		
		if(nums[0]==nums[1]&& nums[0]== nums[2]) {
			for(int n=0; n<point.length; n++) {
				if(nums[0]==n) {
					System.out.println(point[n]+"점 입니다");
				}
			}
		}else {
			System.out.println("0점 입니다");
		}
	}

}
