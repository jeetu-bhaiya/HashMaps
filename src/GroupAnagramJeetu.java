public class GroupAnagramJeetu {
    boolean comp(String s,String t){
        if(s.length()!=t.length()) return false;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!map.containsKey(ch)) map.put(ch,1);
            else map.put(ch,map.get(ch)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!map.containsKey(ch)) return false;
            else{
                map.put(ch,map.get(ch)-1);
            }
        }
        for(Integer i: map.values()){
            if(i!=0) return false;
        }
        return true;

    }
    public List<List<String>> groupAnagrams(String[] s) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<Character,Character> map;
        int n=s.length;
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                vis[i]=true;
                List<String> l=new ArrayList<>();
                l.add(s[i]);
                for(int j=i+1;j<n;j++){
                    if(comp(s[i],s[j])){
                        l.add(s[j]);
                        vis[j]=true;
                    }
                }
                ans.add(l);

            }


        }

        return ans;
    }
}
