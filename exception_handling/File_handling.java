package exception_handling;

import java.io.File;
import java.io.FileReader;

public class File_handling {
	public static void main(String[] args) throws Exception{
       File file=new File("‪C:\\Users\\HP\\Desktop\\css");
       FileReader fr = new FileReader(file);
       System.out.println(fr);
	}
}
