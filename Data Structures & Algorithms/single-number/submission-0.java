class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map =new HashMap<>();

        for(int n : nums){
              map.put(n,map.getOrDefault(n,0)+1);

        }

        for(int k : map.keySet()){
              if(map.get(k) ==1){
                     return k;
              }
        }
        return -1;
    }
}
