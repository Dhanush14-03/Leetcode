class Solution {
    public boolean rotateString(String s, String goal) {
        String s1=s+s;
        if(s1.contains(goal)&&(goal.length()==s.length())){
            return true;
        }
        return false;
    }
}