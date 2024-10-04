package java_connected_with_git;

import java.util.HashMap;
import java.util.Scanner;

public class dictionary_example {
	
	//사전 알고리즘

	public static void main(String[] args) 
	{
		HashMap hm = new HashMap();
		Scanner sc = new Scanner(System.in); //console 로 입력 받을 수 있음
				
		hm.put("apple", "사과");
		hm.put("paper", "종이");
		hm.put("flower", "꽃");
		String voca; //voca 변수 생성
		
		System.out.println("뜻을 알고 싶은 영어 단어를 입력하세요.");
		voca = sc.nextLine(); //nextInt 아님
		
		if(hm.containsKey(voca)) 
		{
			System.out.println("해당하는 뜻은 : " + hm.get(voca));
		}
		
		else 
		{
			System.out.println("해당 단어에 대한 뜻은 데이터베이스에 없습니다.");
		}
	}
}
