

public class QuickSort
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

		quick(0, (input.length - 1), input);

		System.out.println("\nafter sort");

		for (int i = 0; i < input.length; i++)
		{
			System.out.print(input[i] + " ");
		}
	}

	public static void quick(int left, int right, double[] array)
	{
		if (left < right)
		{
			int middle = (left + right) / 2;
			swap(middle, right, array);
			int leftIndex = left;

			for (int i = left; i < right; i++)
			{

				if (array[i] < array[right])
				{
					swap(i, leftIndex, array);
					leftIndex++;
				}
			}
			swap(leftIndex, right, array);

			quick(left, leftIndex - 1, array);
			quick(leftIndex + 1, right, array);
		}
	}

	public static void swap(int a, int b, double[] array)
	{
		double tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}

}