import java.util.Scanner;

public class DemoMain03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();

        int count = 0;

        // 遍历区间内的数字
        for (int i = L; i <= R; i++) {
            if (!contains101(i)) {
                count++;
            }
        }

        System.out.println(count);

    }

    // 此数字的二进制是否包含101
    private static boolean contains101(int number) {
        String s = Integer.toBinaryString(number);
        if (s.contains("101")) {
            return true;
        }
        return false;
    }

    private static boolean contains101(int number) {
        int last = 0;
        while (number > 0) {
            int res = number & 1;
            if (res == 1 && last == 2) {
                return true;
            }
            last = (last << 1) | res;
            number >>= 1;
        }
        return false;
    }

}
