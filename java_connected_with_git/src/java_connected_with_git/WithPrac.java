package java_connected_with_git;

import java.time.LocalDate;

public class WithPrac {

	public static void main(String[] args) {
		LocalDate Id = LocalDate.now();
		System.out.println(Id);
		
		LocalDate new_Id = Id.withYear(1999)
				.withMonth(8) //월 변경
				.withDayOfYear(23); //년의 일 변경
				
		//이 예제는 함수 간의 데이터 간섭이 있다. 주석 처리해보면 확인 가능!
		System.out.println(new_Id);
	}

}
