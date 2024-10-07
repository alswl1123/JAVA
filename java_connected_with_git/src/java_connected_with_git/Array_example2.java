package java_connected_with_git;

public class Array_example2 {

	public static void main(String[] args) {
		// 오름차순 예제 (내가 만들어봄)
		
		int[] arr = {46, 68, 12, 57, 100};
		
		for(int i = 0; i < arr.length -1; i++) 
		{
			for(int j = i + 1; j < arr.length; j++) 
			{
				if (arr[i] > arr[j])
				{
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			
			}
		}
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i] + " ");
		}
	}

}
