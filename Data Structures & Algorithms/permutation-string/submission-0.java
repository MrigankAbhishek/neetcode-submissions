class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        
        HashMap<Character,Integer> set1=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            set1.put(s1.charAt(i), set1.getOrDefault(s1.charAt(i), 0) + 1);
        }

        for(int i=0;i<=s2.length()-s1.length();i++){
            HashMap<Character,Integer> set2=new HashMap<>();
            for(int j=i;j<i+s1.length();j++){
                set2.put(s2.charAt(j),set2.getOrDefault(s2.charAt(j),0)+1);
            }
            if(set1.equals(set2)){
                return true;
            }
        }
        return false;
    }
}
