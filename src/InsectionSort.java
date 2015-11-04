

public class InsectionSort
{
	static double[] input =
	{ 1, 5, 8, 3, 4, 9, 10, 7, 2, 6 };

	public static void main(String[] args)
	{
		System.out.println("before sort");

		for (int i = 0; i < input.length; i++)
		{
			System.out.print(input[i] + " ");
		}

		insection(input);

		System.out.println("\nafter sort");

		for (int i = 0; i < input.length; i++)
		{
			System.out.print(input[i] + " ");
		}
	}

	public static void insection(double[] array)
	{
		int size = array.length;
		int j;
		if (size == 1)
			return;
		for (int i = 1; i < size; i++)
		{
			double tmp = array[i];
			for (j = (i - 1); j >= 0; j--)
			{
				if (array[j] > tmp)
				{
					array[j + 1] = array[j];
				}
				else
					break;
			}
			array[j + 1] = tmp;
		}

	}

}
