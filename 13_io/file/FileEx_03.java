package java13_io.file;

import java.io.File;

public class FileEx_03 {

	public static void main(String[] args) {
		
		
		//class File 의 생성자
		
		//	File( String path, String filename) 
		
		//	File( File path, String filename)
		
		//	File( String filepath )
		
		
		File file1= new File("./src/java13_io/file","hello");
		
		File file2= new File("./src/java13_io/file/hello");
		
		System.out.println("디렉토리인가? "+file2.isDirectory());
		
		
	
	}

}
