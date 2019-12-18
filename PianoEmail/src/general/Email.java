package general;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Email {
	public static void main(String[] args)
	{
		try  
		{  
			File file=new File("/Users/lliang/Desktop/PianoEmail/Commands.txt");    //creates a new file instance  
			FileReader fr=new FileReader(file);   //reads the file  
			
			BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream 
			
			StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  
			
			ArrayList<String> ar = new ArrayList<String>();
			
			String line; 
			
			while((line=br.readLine())!=null)  
			{  
				ar.add(line);      //appends line to string buffer   
			} 
			
			fr.close();    //closes the stream and release the resources  
			
			for(int i = 0; i < (ar.size()); i++)
			{
				if(ar.get(i).contains("-0N0-"))
				{	
					for(int j = i; j < (ar.size()); j++)
					{
						if(ar.get(j).contains(";"))
						{
							for(int k = (i + 1); k < j; k++)
							{
								String x = ar.get(k);
								return x;
							}
							break;.
						}
					}
					break;
				}
				else
				{
					System.out.println("Error");
				}
			}
			
			
		}  
		
		catch(IOException e)  
		{  
			e.printStackTrace();  
		}  
	}
}
