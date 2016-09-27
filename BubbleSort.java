package pinedaaldrin;
import java.util.*;
public class BubbleSort {

	public static void main (String[] args) 
	{
		
		int size, a, i, swap, array[];
		
		Scanner drin = new Scanner (System.in); 
		Random din = new Random ();

		System.out.print("Enter array size to sort: ");
		size = drin.nextInt();
	
		array = new int [size];
		for (int c = 0; c < array.length; c++ ) 
		
		{

		array [c] = din.nextInt(1000);
		
		}

		System.out.println();
		System.out.println(size + " random numbers generated ");
		
		for (a = 0; a < size; a++) {
			array [a] = din.nextInt(1000);
			System.out.print(array[a] + " ");
			
		}
		
		System.out.println();
		for (a=0; a < size -1; a++) 
		{
			for (i = 0; i< size -i -1; i++) 
			{
				
				if (array[i] > array[i+1]) 
				{
					swap = array [i];
					array[i] = array [i+1];
					array[i+1] = swap;
				}
			}
		}
		System.out.println();
		System.out.println("Bubble Sorting... Done! ");
		for (a = 0; a < size ; a++){
			System.out.print(array [a] + " ");
		}
	}
	
}
