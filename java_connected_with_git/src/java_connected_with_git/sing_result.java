package java_connected_with_git;

public class sing_result {
	public static void main(String[] args) {
		System.out.println(sing.getInstance());
		System.out.println(sing.getInstance()); //싱글턴임(주소값이 같음)
		System.out.println("--------");
		System.out.println(sing.getInstance1());
		System.out.println(sing.getInstance1()); //싱글턴이 아님(주소값이 다름)
	}	
}
