package java_connected_with_git;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		// continue 와 break 를 활용한 예제
		int money = 10000;
		System.out.println("현재 가진 돈은 10000원입니다.");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) 
		{
			System.out.println("얼마를 사용하시겠습니까?");
			int i = sc.nextInt(); //정수를 입력 받음
			
			if(!(0 <= i && i <= money)) //조건식이 false 라면 if 는 없는 함수가 된다.
			{
			//현재 가진 돈보다 크거나, 음수를 입력하면 다시 입력 요구
				System.out.println("다시 입력해주세요(사용 범위가 틀렸습니다)");
				continue;
			}
			
			System.out.printf("이제 %d원이 남았습니다. \n", money -= i);
			//남은 돈의 양 출력
			if(money == 0) //돈이 0원이 되면 종료
			{
				break;
			}
			
		}
		System.out.println("모든 돈을 사용했습니다. 종료");
	}

}
