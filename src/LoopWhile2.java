public class LoopWhile2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j > 0; j--) {
                System.out.println(i+","+j);
            }
            System.out.println("-------");

        }
    }
}
