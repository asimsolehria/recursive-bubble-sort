
package recursive.bubble.sort;

/**
 *
 * @author asim
 */
public class RecursiveBubbleSort {
    
    public void bubble(int arr[], int n)
    {
        if(arr[n]<arr[n-1])
        {
            arr[n]=arr[n]+arr[n-1];
            arr[n-1]=arr[n]-arr[n-1];
            arr[n]=arr[n]-arr[n-1];
        }
        if(n>1)
            bubble(arr, n-1);
            
    }
    
    
    public void bubbleSort(int arr[],int n, int i)
    {
        bubble(arr, n);
        if(n>i)
            bubbleSort(arr, n, i+1);
    }
    
    
    public void halfRecursiveBubble(int arr[],int n)
    {
        for (int i = 0; i < arr.length-1; i++)
        {
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        
        if(n>0)
            halfRecursiveBubble(arr, n-1);
    }
}
