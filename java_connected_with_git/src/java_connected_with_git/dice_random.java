package java_connected_with_git;

import java.util.Random;
import java.util.Scanner;

public class dice_random {

	public static void main(String[] args) {
		Random rd = new Random(); //import 필요
		
		String answer = "y"; //값 초기화 안 해도 nextLine에서 입력 받으므로 괜찮다.
		
		Scanner input = new Scanner(System.in);
		
		while(answer.equals("y")) {
			
			//1~6 사이의 값을 랜덤하게 추출(+1 없이 6만 넣으면 0~5 반환)
			
			int first = rd.nextInt(6) + 1; //항상 함수가 먼저 실행됨
			int second = rd.nextInt(6) + 1;
			
			System.out.println("주사위를 굴리겠습니까? y or n");
			answer = input.nextLine();
			
			System.out.println("첫 번째 주사위 값 : " + first);
			System.out.println("두 번째 주사위 값 : " + second);
			
			if (first == second) {
				System.out.println("축하합니다. 더블입니다!");
			}
			
		}
		
	}

}
