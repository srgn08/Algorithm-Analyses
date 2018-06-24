import java.util.Arrays;


public class Sort {
	
	
	public void HeapSort(String input[][], int n,int index)
	{

        for (int i = n / 2 - 1; i >= 1; i--) {
          heapify(input, n, i,index);
        }

        for (int i=n-1; i>=1; i--)
        {
            String temp[] = input[0];
            input[0] = input[i];
            input[i] = temp;
 

            heapify(input, i, 0,index);
        }
    }
 
	public void heapify(String input[][], int n, int i,int index)
    {
        int largest = i; 
        int l = 2*i + 1; 
        int r = 2*i + 2;  
 
        if (l < n && Float.parseFloat(input[l][index])>(Float.parseFloat(input[largest][index])))
            largest = l;
 
        if (r < n && Float.parseFloat(input[r][index])>(Float.parseFloat(input[largest][index])))
            largest = r;
 

        if (largest != i)
        {
            String swap[] = input[i];
            input[i] = input[largest];
            input[largest] = swap;
 
            heapify(input, n, largest,index);
        }
    }
	
	
	
    public void BubbleSort(String input[][], int n, int index)
    {
        int i, j;
        String[] temp;
        boolean swapped;
        for (i = 1; i < n - 1; i++) 
        {
            swapped = false;
            for (j = 1; j < n - i - 1; j++) 
            {
                if (Float.parseFloat(input[j][index])>Float.parseFloat(input[j + 1][index])) 
                {
                    temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false)
                break;
        }
    }
	
	
	
   
    public void merge(String input[][], int l, int m, int r,int index)
    {

        int n1 = m - l + 1;
        int n2 = r - m;
 
        String L[][] = new String [n1][84];
        String R[][] = new String [n2][84];
 

        for (int i=1; i<n1; ++i)
            L[i] = input[l + i];
        for (int j=1; j<n2; ++j)
            R[j] = input[m + 1+ j];
 

        int i = 1, j = 1;
 
        int k = l;
        while (i < n1 && j < n2)
        {
            if (Float.parseFloat(L[i][index])<=Float.parseFloat((R[j][index])))
            {
                input[k] = L[i];
                i++;
            }
            else
            {
                input[k] = R[j];
                j++;
            }
            k++;
        }
 

        while (i < n1)
        {
            input[k] = L[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            input[k] = R[j];
            j++;
            k++;
        }
    }
 

    void MergeSort(String input[][], int l, int r,int index)
    {
        if (l < r)
        {
            int m = (l+r)/2;

            MergeSort(input, l, m,index);
            MergeSort(input , m+1, r,index);
            merge(input, l, m, r,index);
            
        }
    }
}



