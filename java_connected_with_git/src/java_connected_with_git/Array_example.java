package java_connected_with_git;

public class Array_example {

	public static void main(String[] args) {
		    // 오름차순 예제
		      
		    int[] arr = {99, 32, 22, 87, 140};
		      
		    for(int i = 0; i < arr.length-1; i++)
		    {
		        for(int j = i + 1 ; j < arr.length; j++)
		        {
		           if(arr[i] < arr[j]) //오름차순 정렬. 비교 후 제일 높은 숫자가 앞에 위치함
		           {
		               int tmp = arr[i]; //i를 tmp 변수에 잠시 넣어두고
		               arr[i] = arr[j]; //j로 i 값 덮어쓰기(변수값은 덮어쓰기밖에 안 되어서 변수값을 상호 교환하려면 임시로 담아둘 다른 변수를 생성해야 함)
		               arr[j] = tmp; //j 자리에 i 넣기
		           }
		        }
		     }
		    for(int i = 0; i < arr.length; i++) //System.out 을 여러 번 쓰지 않기 위해 for문 사용
		    { 
		    	System.out.println(arr[i] + " ");
		    	
		    //for문을 쓰지 않는다면 아래와 같이 작성해야함 (번거롭다)
		    //	System.out.println(arr[0] + " ");
		    //	System.out.println(arr[1] + " ");
		    //	System.out.println(arr[2] + " ");
		    //	System.out.println(arr[3] + " ");
		    //	System.out.println(arr[4]);
	
		    }
		}
	}