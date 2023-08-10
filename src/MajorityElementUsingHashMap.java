public class MajorityElementUsingHashMap {
    public int majorityElement(int[] a) {
        int n=a.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int x=a[i];
            if(!map.containsKey(x)) map.put(x,1);
            else map.put(x,map.get(x)+1);
        }
        int rep=n/2;
        int ans=Integer.MIN_VALUE;
        for(var e: map.keySet()){
            if(map.get(e)>rep){
                ans=e;
            }

        }
        return ans;

    }
}
