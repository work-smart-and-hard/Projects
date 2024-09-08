public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalindrome(s) == true) {
                System.out.println("Строка " + s + " - палиндром");
            }
            else {
                System.out.println("Cтрока " + s + " - не палиндром");
            }
        }
    }
    public static String reverseString(String s) {
        String str = "";
        for (int j = s.length() - 1; j >= 0; j--) {
            str += s.charAt(j);
        }
        return str;
    }
    public static boolean isPalindrome(String s) {
        if (s.equals(reverseString(s))) {
            return true;
        }
        return false;
    }
}