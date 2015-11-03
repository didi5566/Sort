
public class BubbleSort
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

		bubble(input);

		System.out.println("\nafter sort");

		for (int i = 0; i < input.length; i++)
		{
			System.out.print(input[i] + " ");
		}
	}

	public static void bubble(double[] array)
	{
		int size = array.length;
		for (int i = size - 1; i > 0; i--)
		{
			for (int j = 0; j < i; j++)
			{
				if (array[j] > array[j + 1])
				{
					double tmp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = tmp;
				}
			}

		}
	}

}
