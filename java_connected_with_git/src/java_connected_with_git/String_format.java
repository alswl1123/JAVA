package java_connected_with_git;

public class String_format {

	public static void main(String[] args) {
		System.out.println(String.format("%d", 1234+5678)); //정수형 (6912 출력)
		
		System.out.println(String.format("%d", "1234"+"5678")); //에러 뜸
		
		System.out.println(String.format("%s", "1234"+"5678")); //문자열형 (12345678 출력)
		
		System.out.println(String.format("%s", 1234+5678)); //6912 출력
		
		
		
	}

}
