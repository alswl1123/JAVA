package java_connected_with_git;

import java.time.LocalTime;

public class WithPrac2 {

	public static void main(String[] args) {
		//현재 시간 출력
		LocalTime It = LocalTime.now();
		System.out.println(It);
		
		//시각을 3으로, 분을 25로, 초를 24로, 나노초를 33333 으로 변경
		LocalTime new_time = It.withHour(3)
				.withMinute(25)
				.withSecond(24)
				.withNano(33333);
		System.out.println(new_time);

	}

}
