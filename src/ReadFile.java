import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;



public class ReadFile 
{
	public String[][]readfile(String filename) throws IOException
	{
		
		File file =new File(filename);
		Scanner sc = new Scanner(file);
		int row=0;
			 
		while (sc.hasNextLine())
		{
			row++;
			sc.nextLine();
		}

		sc.close();
		String[][] array=new String[row][84];
				
		String csvFile = filename;
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        int k=0;


        br = new BufferedReader(new FileReader(csvFile));
        while ((line = br.readLine()) != null)
        {

        		String[] temp = line.split(cvsSplitBy);
        		array[k]=temp;
        		k++;
        }
        	 	
     
        
        br.close();
        
        return array;
	}
	
}
