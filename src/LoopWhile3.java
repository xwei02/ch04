public class LoopWhile3 {
    public static void main(String[] args) {
        //break
        int i=0;
        while (true){
            if (i==6){
                break;
            }
            System.out.println(i);
            i++;
        }
        int j=0;
        while (j<10){
            j++;
            if(j % 2 ==0){
                continue;
            }
            System.out.println(j);
        }
    }
}
