package java_connected_with_git;

import java.io.*;
public class File_IO {
	
	public static void main(String[] args) throws IOException {
		//파일 복사 프로그램
		FileInputStream fis = null;
		FileOutputStream fos = null;
									//절대경로
		fis = new FileInputStream("C:\\prac.txt");
		fos = new FileOutputStream("C:\\Users\\김민지\\result.txt"); //여기까지가 참조변수
		
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos); //객체 생성
		
		int data;
		
		while((data = fis.read())!=-1)
		{
			bos.write(data);
		}
		
		bos.close();
		bis.close(); //사용한 스트림은 닫아주기
		
	}

}
