

public class MergeSort
{
	static double[] input =
	{ 1, 5, 8, 3, 4, 9, 10, 7, 2, 6 };

	public static void main(String args[])
	{
		System.out.println("before sort");

		for (int i = 0; i < input.length; i++)
		{
			System.out.print(input[i] + " ");
		}

		mergeSort(0, (input.length-1), input);

		System.out.println("\nafter sort");

		for (int i = 0; i < input.length; i++)
		{
			System.out.print(input[i] + " ");
		}
	}

	public static void mergeSort(int low, int high, double[] array)
	{

		if (low<high)
		{
			int middle = (low + high) / 2;
			mergeSort(low, middle, array);
			mergeSort(middle + 1, high, array);
			merge(low, high, array);
		}
	}

	public static void merge(int low, int high, double[] array)
	{
		
		int middle = (low + high) / 2;
		
		double array2[] = new double[high-low+1];
		int k = -1;
		int i = low;
		int j = middle + 1;
		for (; (i <= middle && j <= high);)
		{
			
				double a = array[i];
				double b = array[j];
				if (a < b)
				{
					array2[++k] = a;
					i++;
				}
				else
				{
					array2[++k] = b;
					j++;
				}
		}

		for (; i <= middle; i++)
		{
			array2[++k] = array[i];
		}
		for (; j <= high; j++)
		{
			array2[++k] = array[j];
		}

		k=0;
		for (i = low; i <= high ; i++)
		{
			array[i]=array2[k++];
		}
		

	}
	
	

}
