import java.util.Arrays;
class SortingAlgorithms 
{
    
// Bubble Sort
public static void bubbleSort(int[] arr) 
{
int n = arr.length;
int c=0,s=0;
for (int i = 0; i < n - 1; i++) 
{
for (int j = 0; j < n - i - 1; j++) 
{
c++;
if (arr[j] > arr[j + 1]) 
{
s++;
int temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
}
}
}
System.out.println("Bubble Sort - Comparisons: " + c+ ", Swaps: " + s);
}

// Insertion Sort
public static void insertionSort(int[] arr) 
{
int c= 0,s= 0;
int n = arr.length;
for (int i = 1; i < n; i++) 
{
int key = arr[i];
int j = i - 1;
while (j >= 0 && arr[j] > key) 
{
c++;
s++;
arr[j + 1] = arr[j];
j--;
}
arr[j + 1] = key;
}
System.out.println("Insertion Sort - Comparisons: " + c + ", Swaps: " + s);
}

// selection Sort
public static void selectionsort(int arr[],int n)
{
int temp=0,c=0,s=0;
for(int i=0;i<=n-1;i++)
{
int min = i;
for(int j=i+1;j<=n-1;j++)
{
if(arr[i]<arr[min])
{
min=j;
c++;
}
}
temp=arr[i];
arr[i]=arr[min];
arr[min]=temp;
s++;

}
System.out.println("Selection sort - Comparisons: " +c+" "+ s);
}

public static void main(String[] args) 
{
int[] inputSizes = {100, 1000, 10000};
for (int size : inputSizes) 
{
int[] testArray = new int[size];
for (int i = 0; i < size; i++) 
{
testArray[i] = size - i;
}

//bubble sort
int[] bubbleArray = Arrays.copyOf(testArray, testArray.length);
long bubbleStartTime = System.nanoTime();
bubbleSort(bubbleArray);
long bubbleEndTime = System.nanoTime();
double bubbleTime = (bubbleEndTime - bubbleStartTime) / 1e6; // Convert to milliseconds


//insertion sort
int[] insertionArray = Arrays.copyOf(testArray, testArray.length);  
long insertionStartTime = System.nanoTime();
insertionSort(insertionArray);
long insertionEndTime = System.nanoTime();
double insertionTime = (insertionEndTime - insertionStartTime) / 1e6; // Convert to milliseconds


//selection sort
int[] selectionArray = Arrays.copyOf(testArray, testArray.length);
long selectionStartTime = System.nanoTime();
selectionsort(selectionArray, selectionArray.length - 1);
long selectionEndTime = System.nanoTime();
double selectionTime = (selectionEndTime - selectionStartTime) / 1e6; // Convert to milliseconds


//printing area
System.out.println("Input Size: " + size);
System.out.println("Bubble Sort - Time: " + bubbleTime + " ms");
System.out.println("Insertion Sort - Time: " + insertionTime + " ms");
System.out.println("Selection Sort - Time: " + selectionTime + " ms");
System.out.println("==============================");
}
}
}