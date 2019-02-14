package exercise1_7;

public class CesarCode {
    public static void main(String[] args) {
        String words = "NIEPRZYJACIEL JEST BARDZO BLISKO";
        int shift = 3;

        cesarCodeMethod(words, shift);
    }
    private static void cesarCodeMethod(String message, int shift) {
        String space = "";
        for(int i = 0; i < message.length(); i++){
            char changeValue = (char)(message.charAt(i) + shift);
            if(changeValue > 'Z'){
                space += (char)(message.charAt(i) - (26 - shift) );
            }
            else {
                space += (char)(message.charAt(i) + shift);
            }
        }
        System.out.println("NIEPRZYJACIEL JEST BARDZO BLISKO");
        System.out.println(space.replace("#", " "));
        System.out.println("QLHSUCBMDFLHO MHVW EDUGCR EOLVNR wklejony");
    }
}
