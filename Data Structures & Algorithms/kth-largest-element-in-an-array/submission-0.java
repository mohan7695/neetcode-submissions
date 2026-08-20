class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());


       for(int i : nums){
            pq.add(i);
       }
       int count=0;
int ke=pq.size();
       for(int i=0;i<ke;i++){
           int y=pq.remove();
            count++;

            if(count==k){
                return y;
            } 
       }
       return -1;
    }
}
