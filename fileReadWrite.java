import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class fileReadWrite {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try
		{
		String filereadpath = "C:/FilesPractice/fileread.txt";
		String filewritepath = "C:/FilesPractice/fileWrite.txt";
		
		File fileRead = new File(filereadpath);		
		File fileWrite = new File(filewritepath);
		
		if(fileRead.exists()==true)
		{
		
		FileInputStream fin = new FileInputStream(fileRead);
		FileOutputStream fout = new FileOutputStream(fileWrite);
		
		//fin.read()
		int c=0;
		
		while((c=fin.read())!=-1)
		{
			Character ci = (char)c;
			fout.write(ci);
			
		}
				
		fin.close();
		fout.close();
		}
		}
	
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
	

	}

}
