package task2;
import task1.Task1;

public class Task2 {
    public static boolean isPalindrome(String s){
        s = s.toLowerCase();

        if(s.equals(Task1.reverseString(s))){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Afifa";

        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));

    }
}
