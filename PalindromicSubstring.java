package DSA;

public class PalindromicSubstring {

    public static boolean isPalindrome(String s){
        int i=0;
        int j = s.length()-1;

        while (i<j){
            if (s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;
    }

    public static int countSubStrings(String s){
        int i=0;
        int j=0;
        int counter = 0;

        while (i<s.length() && j<s.length()){
            if (i==j){
                counter++;
                j++;
            }else {
                if (isPalindrome(s.substring(i,j+1))){
                    counter++;
                }
                if (j==s.length()-1){
                    i++;
                    j = i;
                }else {
                    j++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(countSubStrings("aaa"));
    }
}
