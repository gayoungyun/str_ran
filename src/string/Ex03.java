package string;

public class Ex03 {
	public static void main(String[] args) {
		String str = "test     ";
		System.out.println("str : "+str);
		System.out.println(str.equals("test"));
		
		String result = str.trim(); //양쪽 공백 삭제
		System.out.println("result : "+result);
		System.out.println(result.equals("test"));
		
		String addr = "05214 노원구 동일로4567"; //특정문자 자른다
		System.out.println(addr);
		
		String[]split = addr.split(" ");
		for(int i=0 ; i<split.length ; i++) {
			System.out.println(i+"."+split[i]);
		}
		
		String phone = "010-1234-1234";
		String rep = phone.replace("-"," ");
		System.out.println("rep : "+rep);
		
		phone = "1234";
		int num = Integer.parseInt(phone); //문자를 숫자로
		System.out.println( num + 100);
		String s = num + ""; //숫자를 문자로
		System.out.println(s+100);
				
	}

}
