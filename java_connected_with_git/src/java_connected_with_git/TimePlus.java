package java_connected_with_git;

import java.time.LocalDate;

public class TimePlus { //날짜를 더하고 빼는 메서드를 확인한 코드

	public static void main(String[] args) {
		LocalDate Id = LocalDate.now();
		System.out.println(Id);
		LocalDate Id2 = Id
			.minusYears(2)
			.plusMonths(3)
			.minusDays(4); //LocalDateOf() 이렇게 출력 가능
		System.out.println(Id2);
		
		//자동 변환
		LocalDate Id3 = Id2.minusDays(3);
		System.out.println(Id3);
		
		//주 더하기
		LocalDate Id4 = Id3.plusWeeks(3);
		System.out.println(Id4);

	}

}
