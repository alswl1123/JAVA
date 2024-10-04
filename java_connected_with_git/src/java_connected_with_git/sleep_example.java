package java_connected_with_git;

public class sleep_example {

	public static void main(String[] args) 
	{
		for(int i = 10; i >= 0; i--) //10부터 0까지 감소
		//for(int i = 0; i <= 10; i++) //이렇게도 만들 수 있다. 0부터 10까지 증가
		{
			try 
			{
				Thread.sleep(1000);
			}
			catch(Exception e) //catch에 매개변수 주는 것 잊으면 안 된다.
			{
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
