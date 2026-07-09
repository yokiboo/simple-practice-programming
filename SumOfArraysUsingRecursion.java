

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        
        int[] arr = {2,3,4};
        System.out.println(sum(arr));
    }
    
    public static int sum(int[] arr){
        
        if(arr.length == 0){
            return -1;
        }
        
        if(arr.length < 2)
            return arr[0];
            
        int size = arr.length;
        int value = arr[size-1];
        
        return value + sum(Arrays.copyOfRange(arr, 0, size-1));
    }
}