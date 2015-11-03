# Sort
This repository is for sort algorithms 
1.Selection Sort是每次都在陣列中挑最小的出來，插在陣列的最前面，也因為每回合一定要做動作，所以最好、平均、最壞的複雜度都是O(n^2)

2.Insection Sort是從陣列的第二個元素開始往前看，每次都檢查陣列前面的元素，把目前這個元素插到最佳的位置(前面的陣列元素都是排序好的)
，在最好的情況下可能都不用做動作所以複雜度為O(n)，平均和最壞則是O(n^2)

3.Bubble Sort是陣列相鄰元素兩兩比較，從陣列的最前面開始，每次都會把目前陣列元素中最大的值排到陣列的最後面
，在最好的情況下可能都不用做動作所以複雜度為O(n)，平均和最壞則是O(n^2)

4.Merge Sort則是利用divide and conquer的概念進行求解，每次都把陣列切成一半，切到只剩一個元素時，則回頭做合併(排序))
，一步一步的合併回去，也因為一定都切成2半，所以最好、平均、最壞的複雜度為O(n*logn)(可用recursive)

5.Quick Sort會選一個pivot元素，每個回合都把陣列分成2堆，一堆比pivot元素大，一堆比pivot元素小，接下來再把這2堆進行排序，
最好與平均的狀況時間複雜度為O(n*logn)，最壞則是O(n^2)(可用recursive)(也是用divide and conquer的概念)

Java呼叫方法時，因為是call by value，所以沒有原生的swap函式，目前看到比較簡潔的swap方法為下
1.不用透過array
int swap(int a, int b) 
{
  return a;
}
y = swap(x, x=y);

2.透過array
int swap(int indexA, int indexB, double[] array)
{
  double tmp = array[indexA];
  array[indexA] = array[indexB];
  array[indexB] = tmp;
}
