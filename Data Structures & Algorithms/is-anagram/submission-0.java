class Solution {
    public boolean isAnagram(String s, String t) {
    char[] charArray=s.toCharArray();
    Arrays.sort(charArray);
    String sortedS = new String(charArray);
    char[] kharArray=t.toCharArray();
    Arrays.sort(kharArray);
    String sorteds = new String(kharArray);
     if(s.length()==t.length()){
        if(sortedS.equals(sorteds)){
            return true;
        }else{
            return false;
        }

     }
     return false;
    }
}
