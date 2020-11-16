
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
            arr[n]=arr[n-1]-arr[n];
            arr[n-1]=arr[n]-arr[n-1];
        }
            
    }
}
