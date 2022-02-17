package Hello2;

public class Ksu2 {
    public static void main(String[] args) {
        System.out.println(ksu1(1, 9));
        ksu2(10);
        System.out.println(ksu3(-23));
        ksu4("Ksu", 6);

    }

    public static boolean ksu1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <=20) {
            return true;
        }
        return false;
    }

    public static void ksu2(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отприцательное");
        }
    }

    public static boolean ksu3(int x) {
        if (x >= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void ksu4(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }

}

