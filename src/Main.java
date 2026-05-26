import javax.xml.transform.Source;

public class Main {
    public static void main(String[] args) {

        String fraza = "J@va the be$t !123";
        int start = 0;
        int end = fraza.length() - 1;
        char[] charFrazy = fraza.toCharArray();
        String hello = "Zdarova";
        while (start < end) {    // <--здесь помогла нейронка у меня было  for (char c : charFrazy)
            if (!Character.isLetter(charFrazy[start])) {
                start++;
                continue;
            }
            if (!Character.isLetter(charFrazy[end])) {
                end--;
                continue;
            }

            char temp = charFrazy[start];
            charFrazy[start] = charFrazy[end];
            charFrazy[end] = temp;

            start++;
            end--;
        }

        String reverseFraza = new String(charFrazy);
        System.out.println(reverseFraza);
        System.out.println(fraza);
        System.out.println(hello);
    }
}