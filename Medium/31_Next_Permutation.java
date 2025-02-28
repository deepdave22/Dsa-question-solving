class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1, n = nums.length;

        // 1st step: Find the pivot (first decreasing element from right)
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // If no pivot is found, reverse the array (last permutation case)
        if (pivot == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // 2nd step: Find the next larger element than nums[pivot] and swap
        for (int i = n - 1; i > pivot; i--) { // Start from the last element
            if (nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }

        // 3rd step: Reverse the part after pivot to get the next lexicographic order
        reverse(nums, pivot + 1, n - 1);
    }

    // Helper function to swap two elements
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Helper function to reverse an array from start to end
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }
}
