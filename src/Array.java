public class Array {
    public static void main(String[] args) {
        /*String superhero1 = "Iron man";
        String superhero2 = "Captain America";
        String superhero3 = "Hulk";

        System.out.println(superhero1);
        System.out.println(superhero2);
        System.out.println(superhero3);*/

        String[] heroes ={"Iron man", "Captain America", "Hulk", "Thor", "X-man"};
        System.out.println(heroes[1]);
        System.out.println(heroes.length);
        System.out.println(heroes[heroes.length-1]);

        String[] anotherHeroes = new String[3];
        anotherHeroes[0] = "Black Widow";
        System.out.println(anotherHeroes[0]);
        anotherHeroes[1] = "Haukeye";
        System.out.println(anotherHeroes[1]);
        anotherHeroes[2] = "SpiderMan";
    }



}
