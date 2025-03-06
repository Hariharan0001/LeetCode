class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> map = new HashMap<>();
        boolean[] arr =new boolean[128];
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))!=t.charAt(i))
            {
                return false;
            }
            else if(!map.containsKey(s.charAt(i)) && arr[t.charAt(i)]) return false;
            else{
                map.put(s.charAt(i),t.charAt(i));
                arr[t.charAt(i)] = true;
            }
        }
        return true;
    }
}