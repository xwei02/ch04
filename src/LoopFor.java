public class LoopFor {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        String[] heroes = {"Iron man", "Captain America", "Hulk", "Thor"};
       /*
        for (int i = 0; i < 5; i++) {
            System.out.println(heroes[i]);
        }*/
        for (String alterHeroes: heroes){
            System.out.println(alterHeroes);
        }




    }

}
