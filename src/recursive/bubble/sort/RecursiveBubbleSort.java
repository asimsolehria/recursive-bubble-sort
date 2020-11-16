
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
        if(i<n)
            bubbleSort(arr, n, i+1);
    }
}
