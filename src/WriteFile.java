import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class WriteFile {
	public void writeFile(String filename,String array[][],int size) throws IOException
	{
		BufferedWriter bw = null;
		FileWriter fw = null;

			

			fw = new FileWriter(filename);
			bw = new BufferedWriter(fw);
			for(int i=0; i<size; i++)
			{
				for(int j=0;j<84;j++)
				{
					bw.write(array[i][j]);
					if(j!=83)
						bw.write(",");
				}
				bw.write("\n");
			}
			


					bw.close();
					fw.close();
	}

}
