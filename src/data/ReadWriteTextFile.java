package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File f=new File("C:\\Ripal\\QA\\XLSfile.txt");
		f.createNewFile();

		
		FileWriter f1=new FileWriter(f);
		BufferedWriter out=new BufferedWriter(f1);
		
		out.write("line 1");
		out.newLine();
		out.write("line 2");
		out.flush();
		
		
		
		FileReader f2=new FileReader(f);
		BufferedReader in=new BufferedReader(f2);
		
//		System.out.println(in.readLine());
//		System.out.println(in.readLine());
		
		
		String x;
		while((x=in.readLine())!=null){
			System.out.println(x);
			
		}
		
	}

}
