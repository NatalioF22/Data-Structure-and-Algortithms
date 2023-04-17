public class BubbleSort{
    private int[] array;
    public BubbleSort(int[] nums) {
        this.array = nums;
        boolean number_swapped = true;
        while (number_swapped) {
            number_swapped = false;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    number_swapped = true;
                }
            }
        }
    }
        public void printArray(){
            for(int i : this.array){
                System.out.println(i);
            }
        }


    }
