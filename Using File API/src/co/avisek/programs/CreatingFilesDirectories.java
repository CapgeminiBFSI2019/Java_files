package co.avisek.programs;

import java.io.File;

public class CreatingFilesDirectories {
	
	
	public static void main(String[] args) {
		
		
		
		String path ="/Users/abhisekkumar/Desktop/a/b/c";
		File file = new File(path);
		file.mkdirs();//this will creates folders in the mac
		
		
		
	}

}
