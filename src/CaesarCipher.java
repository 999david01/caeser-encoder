public class CaesarCipher {

    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        shift = shift % 26;  // def wieviel verschoben wird

        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                char encrypted = (char) ((c - 'A' + shift) % 26 + 'A');
                result.append(encrypted);
            }
            else if (Character.isLowerCase(c)) {
                char encrypted = (char) ((c - 'a' + shift) % 26 + 'a');
                result.append(encrypted);
            }
            else {
                // sonderzeichen bleibt
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String text = "servus??"; //auswahl was encoded wird
        int shift = 3;

        String encrypted = encrypt(text, shift);
        System.out.println(encrypted);
    }
}
