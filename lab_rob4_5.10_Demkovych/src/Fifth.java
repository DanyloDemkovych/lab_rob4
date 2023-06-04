public class Fifth {
    public static void main(String[] arg) {
        int count = 0;
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                if (i/10%10 == j%10 && i%10 == j/10%10) {
                    System.out.printf("%02d:%02d\n", i, j);
                    count++;
                }
            }
        }
        System.out.println("\nКількість співпадінь симетричних комбінацій цифр на електронному годиннику: " + count);
    }
}