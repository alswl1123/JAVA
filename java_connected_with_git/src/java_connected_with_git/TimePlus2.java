package java_connected_with_git;

import java.time.LocalDateTime;

public class TimePlus2 {

	public static void main(String[] args) {
		// 현재 시간 출력
		LocalDateTime Id = LocalDateTime.now();
		System.out.println("현재 시간 : " + Id);
		
		// -5시간, +30분, -4초
		LocalDateTime Id2 = Id
				.minusHours(5)
				.plusMinutes(30)
				.minusSeconds(4);
		
		System.out.println("변경 시간 : " + Id2);
		
		// Id2 출력값에서 -24시간
		LocalDateTime Id3 = Id2.minusHours(24);
		System.out.println("자동 변환 시간 : " + Id3);

	}

}
