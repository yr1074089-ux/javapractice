public class Sring {
    public static String toUppercase(String str) {
        StringBuilder sb = new StringBuilder();
        
        // Capitalize first character
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(' ');
                i++;
                sb.append(Character.toUpperCase(str.charAt(i))); // capitalize next character
            } else {
                sb.append(str.charAt(i)); // normal character
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi i am rishabh";
        System.out.println("Here is uppercase : " + toUppercase(str));
    }
}
