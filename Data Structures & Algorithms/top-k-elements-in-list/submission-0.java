
class Solution {
    public int[] topKFrequent(int[] nums, int k) {


//Arrays.sort(nums);
        Map<Integer,Integer> map =new HashMap<>();


        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
List<Integer>[] bucket =new ArrayList[nums.length+1];

for(Map.Entry <Integer,Integer> entry: map.entrySet() ){
    int fre = entry.getValue();

    if(bucket[fre]==null){
        bucket[fre]=new ArrayList<>();
    }
    bucket[fre].add(entry.getKey());
}
int[] arr=new int[k];
int count=0;

for(int i=bucket.length -1 ; i>=0 && count <k;i--){
    if(bucket[i] !=  null){

for(int n : bucket[i]){
    arr[count]=n;
    count++;

    if(count==k){
        break;
    }
}
    } 


}
return arr;
        }
}
