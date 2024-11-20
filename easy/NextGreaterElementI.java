class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[nums1.length];

        for(int i=nums2.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<nums2[i]){
                s.pop();
            }
            if(s.size()>0){
                map.put(nums2[i],s.peek());
            }else{
                map.put(nums2[i],-1);
            }
            s.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}
