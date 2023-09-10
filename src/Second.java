import java.util.Scanner;

public class Second {

    static int romanToInt(String s) {
        int nowVal = 0;
        int lastVal = 0;
        int total = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            switch(s.charAt(i)) {
                case 'I' :
                    nowVal = 1;
                    break;
                case 'V' :
                    nowVal = 5;
                    break;
                case 'X' :
                    nowVal = 10;
                    break;
                case 'L' :
                    nowVal = 50;
                    break;
                case 'C' :
                    nowVal = 100;
                    break;
                case 'D' :
                    nowVal = 500;
                    break;
                case 'M' :
                    nowVal = 1000;
                    break;
            }
            if (nowVal >= lastVal)
                total += nowVal;
            else
                total -= nowVal;
            lastVal = nowVal;
        }
        return total;
    }

    public static void main(String[] args) {
        String s;
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        System.out.println(romanToInt(s));
    }
}

