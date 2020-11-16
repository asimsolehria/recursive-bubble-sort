
package recursive.bubble.sort;

/**
 *
 * @author asim
 */
public class main {
    
    public static void main(String[] args) {
        
//        
//        obj.halfRecursiveBubble(arr, arr.length-1);
//        
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        int arr[]={9,8,7,6,5,4,3,2,1};
        
        RecursiveBubbleSort obj=new RecursiveBubbleSort();
        
        obj.bubbleSort(arr, arr.length-1,0);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
