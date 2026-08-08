class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>  minHeap = new PriorityQueue<>();

        for(int i : nums){
            minHeap.offer(-i);
        }
        int min=0;
        while(k!=0){
            min = minHeap.poll();
            k--;
        }
        return -(min);
    }
}
