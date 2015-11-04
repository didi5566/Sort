

public class SelectinSort
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

		selection(input);

		System.out.println("\nafter sort");

		for (int i = 0; i < input.length; i++)
		{
			System.out.print(input[i] + " ");
		}
	}

	public static void selection(double[] array)
	{
		int size = input.length;
		for(int i=0;i<size;i++)
		{
			int minIndex = i;
			for(int j=i+1;j<size;j++)
			{
				if(array[minIndex]>array[j])
				{
					minIndex=j;
				}
			}
			double tmp = array[i];
			array[i]=array[minIndex];
			array[minIndex]=tmp;
		}

	}

}