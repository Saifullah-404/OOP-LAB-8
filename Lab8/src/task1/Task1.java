package task1;

public class Task1 {

    public static String reverseString(String s){
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args){
        String test = "Saif";

        test = reverseString(test);

        System.out.println(test);
    }

}
