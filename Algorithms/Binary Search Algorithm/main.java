public class main{
    public static void main(String[] args){
            int[] nums = {1,2,3,4,5,6,7,8,9,12,17,19,22};
            System.out.println("Test the program iteratively:");
            System.out.println("Element 1 is located at index: "+binarySearchIter(nums, 1));
            System.out.println("Element 22 is located at index: "+binarySearchIter(nums, 22));
            System.out.println("Element 17 is located at index: "+binarySearchIter(nums, 17));
            System.out.println("Element 16 is located at index: "+binarySearchIter(nums, 16));
            int last = nums.length-1;

            System.out.println("\nTest the program recursively");
            System.out.println("Element 1 is located at index: "+binarySearchRecur(nums,1,0,last));
            System.out.println("Element 12 is located at index: "+binarySearchRecur(nums,12,0,last));
            System.out.println("Element 3 is located at index: "+binarySearchRecur(nums,3,0,last));
            System.out.println("Element 199 is located at index: "+binarySearchRecur(nums,199,0,last));

    }
    public static int binarySearchIter(int[] array, int item){
            int first = 0;
            int last = array.length -1;
            while(first<=last){
                int midpoint_index = (first+last) /2;
                int midpoint_value = array[midpoint_index];
                if(midpoint_value==item){
                    return midpoint_index;
                }else if(midpoint_value> item){
                    last = midpoint_index - 1;
                }else{
                    first = midpoint_index +1;
                }
            }
            return -1;
    }
    public static int binarySearchRecur(int[] array, int item,int first, int last){
        if(first>last){
            return -1;
        }else{
            int mid_index = (first+last)/2;
            int mid_value =  array[mid_index];
            if(mid_value==item){
                return mid_index;
            }else if(mid_value>item){
                return binarySearchRecur(array, item,first,mid_index-1);
            }else{
                return binarySearchRecur(array, item,mid_index+1,last);
            }
        }
    }
}
