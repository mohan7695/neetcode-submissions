class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] arr={2, 3, 5, 7, 11, 13, 17, 19, 23, 29,31, 37, 41, 43, 47, 53, 59, 61, 67, 71,73, 79, 83, 89, 97, 101};

        Map<Long,List<String>> map =new HashMap<>();

        for(String s:strs){
long count=1;
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);

count *=arr[ch-'a'];
            }

            if(map.containsKey(count)){
                map.get(count).add(s);
            }
            else{
                map.put(count,new ArrayList<String>());
                map.get(count).add(s);
            }

        }

        List<List<String>> ans=new ArrayList<List<String>>();



        for(List<String> val :map.values()){
            ans.add(val);
        }
        return ans;
    }
}
