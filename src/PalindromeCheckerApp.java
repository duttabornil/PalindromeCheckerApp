import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input="radar";
        char[] chars=input.toCharArray();
        int start=0;
        int end=chars.length-1;
        boolean isPalindrome=true;
        while(start<end){
            if(chars[start]==chars[end]){
                start++;
                end--;
            }
            else{
                isPalindrome=false;
            }
        }
        System.out.println("Input : "+ input);
        if(isPalindrome){
            System.out.println("Is Palindrome? : "+isPalindrome);
        }
        else{
            System.out.println("Is Palindrome? : "+isPalindrome);
        }
    }
}
        
