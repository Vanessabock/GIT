public class Main {
    public static void main(String[] args) {
        System.out.println("Hallo Git von Paul");
        System.out.println(checkPalindrome("ABBA"));
    }
    public static boolean checkPalindrome(String value){
        return new StringBuilder(value).reverse().toString().equals(value);
    }
}
