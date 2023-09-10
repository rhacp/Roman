import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        // IV = 4
        // IX = 9
        // XL = 40
        // XC = 90
        // CD = 400
        // CM = 900
        String s;
        int b = 0;
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();

        String a;
        a = s.replace("IV", " 4 ");
        a = a.replace("IX", " 9 ");
        a = a.replace("XL", " 40 ");
        a = a.replace("XC", " 90 ");
        a = a.replace("CD", " 400 ");
        a = a.replace("CM", " 900 ");
        a = a.replace("MMM", " 3000 ");
        a = a.replace("CCC", " 300 ");
        a = a.replace("XXX", " 30 ");
        a = a.replace("III", " 3 ");
        a = a.replace("MM", " 2000 ");
        a = a.replace("CC", " 200 ");
        a = a.replace("XX", " 20 ");
        a = a.replace("II", " 2 ");
        a = a.replace("M", " 1000 ");
        a = a.replace("D", " 500 ");
        a = a.replace("C", " 100 ");
        a = a.replace("L", " 50 ");
        a = a.replace("X", " 10 ");
        a = a.replace("V", " 5 ");
        a = a.replace("I", " 1 ");


        String s1 = a;
        s1 = s1.replaceAll("\\s", "");
        double s2 = Double.parseDouble(s1);
        double r = 0;
        // "\\s" is empty space.

        for (int i = 0; i < a.length(); ++i) {
            if (Character.isWhitespace(a.charAt(a.length() - 1 - i))) {
                //numbers[i] = help2 % Math.pow(10, a); In caz de array care nu ma ajuta pt ca are size definit din start si eu nu stiu cat e la inceput.
                r = r + s2 % Math.pow(10, b);
                s2 = (s2 - s2 % Math.pow(10, b)) / Math.pow(10, b);
                b = 0;
            } else {
                ++b;
            }
        }
        int r1 = (int) r;
        System.out.println(r1);
    }
}