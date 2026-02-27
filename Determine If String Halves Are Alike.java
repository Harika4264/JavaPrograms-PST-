class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                if(i<n/2)
                count++;
                else
                count--;
            }
        }
        return count==0;
    }
    private boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}