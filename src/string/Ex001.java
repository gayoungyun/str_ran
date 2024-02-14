package string;

public class Ex001 {
	public static void main(String[] args) {
		String str;
		String str1 = new String();
		String str2 = "test";
		String str3 = new String("test init");
		System.out.println("str3 : "+str3);
		String s1= str3.toUpperCase();
		System.out.println("s1 : "+s1);
		String s2 = s1.toLowerCase();
		System.out.println("s2 : "+s2);
		
		str3 = "JaVa";
				if(str3.toLowerCase().equals("java")) {
					System.out.println("수강과목 자바");
				}else { 
					System.out.println("다르다!!");
				}
	}

}
