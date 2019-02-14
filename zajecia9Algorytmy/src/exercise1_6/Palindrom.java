package exercise1_6;

public class Palindrom {
    public static void main(String[] args) {

        String text1 = "kajak";
        String text2 = "owocowo";
        String text3 = "radar";
        String text4 = "potop";
        String text5 = "a to kanapa pana kota";
        text5 = text5.replaceAll(" ", "");
        String text6 = "witam";
        //isPalindrome(text + "\n " + text2 + "\n" + text3 +"\n" + text4);
        isPalindrome(text1);
        isPalindrome(text2);
        isPalindrome(text3);
        isPalindrome(text4);
        isPalindrome(text5);
        isPalindrome(text6);
    }

    public static void isPalindrome(String palindrom) {
        System.out.println("Czy słowo/sentencja jest palindromem?: "
                + new StringBuilder(palindrom).reverse().toString().equals(palindrom));
    }
}