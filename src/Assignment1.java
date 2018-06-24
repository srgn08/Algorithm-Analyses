import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;



public class Assignment1 {
	public static void main(String[] args) throws IOException {		
		String filename=args[0];
		int index=Integer.parseInt(args[1]);
		String save=args[2];
		ReadFile read=new ReadFile();
		String[][] array=read.readfile(filename);
		String[][] array2=read.readfile(filename);
		String[][] array3=read.readfile(filename);
		Sort sort=new Sort();

		
		double startTime = System.nanoTime();
		sort.MergeSort(array3,0,array3.length-1, index);
		double endTime = System.nanoTime();
		double duration = (endTime - startTime)/1000000000 ;
		System.out.println("Merge"+""+duration);
		
		startTime = System.nanoTime();
		sort.BubbleSort(array,array.length,index);
		endTime = System.nanoTime();
		duration = (endTime - startTime)/1000000000 ;
		System.out.println("Bubble"+""+duration);

		
		startTime = System.nanoTime();
		sort.HeapSort(array2, array2.length, index);
		endTime = System.nanoTime();
		duration = (endTime - startTime)/1000000000 ;
		System.out.println("Heap"+""+duration);

		

		if(save.equals("T"))
		{
			WriteFile wf=new WriteFile();
			wf.writeFile(filename, array, array.length);
		}
	





		
	}	
	

}
