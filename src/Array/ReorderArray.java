package Array;

import java.util.Arrays;

/*
*   Your input is an array of integers and you have to re order its entries so that the even entries appear first.
* you are required to solve it without allocating additional storage

 */

/*
Solution approach: use two pointer
nextEven pointer at index =0 and nextOdd pointer at last index
if the current index is even then nextEven ++
else swap with nextEven and nextOdd place and decrease the nextOdd value by 1
 */
public class ReorderArray {
    public static void oddEven(int[] arr)
    {
        int nextEven =0, nextOdd= arr.length-1;
        while(nextEven < nextOdd)
        {
            if(arr[nextEven] % 2 ==0)
            {
                nextEven = nextEven+1;
            }
            else {
                int temp = arr[nextEven];
                arr[nextEven]= arr[nextOdd];
                arr[nextOdd] = temp;
                nextOdd--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        oddEven(arr);
        System.out.println(Arrays.toString(arr));
    }

}
