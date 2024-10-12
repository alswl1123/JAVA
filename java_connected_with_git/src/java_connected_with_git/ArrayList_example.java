package java_connected_with_git;

import java.util.*;

public class ArrayList_example {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		
		list1.add("A");
		list1.add("C");
		list1.add("D");
		list1.add("E");
		
		System.out.println("초기 상태 : ");
		System.out.println(list1);
		
		System.out.println("인덱스 1 위치에 B 추가 : ");
		list1.add(1, "B"); //위치, 추가할 내용 순서로 작성!
		//list1.add("B", 1); //이렇게 쓰면 에러 남
		System.out.println(list1);
		
		System.out.println("인덱스 2 위치의 값 삭제 : ");
		list1.remove(2);
		System.out.println(list1);

		System.out.println("인덱스 2번 위치의 값 반환 : " + list1.get(2));
	}

}
