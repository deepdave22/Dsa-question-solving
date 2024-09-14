//Approach (Two pointer)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lp =0;
        int rp=numbers.length-1;
        int[] arr = new int[2]; //creating new array for saving the index of the solution

        while(lp != rp){
            int sum = numbers[lp] + numbers[rp];
            if( sum == target){
                arr[0] = lp + 1;
                arr[1] = rp + 1;
                return arr;
            }
            if(sum > target){
                rp--;
            }else{
                lp++;
            }
        }
        return arr;
    }
}
