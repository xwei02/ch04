import java.util.ArrayList;
import java.util.Collections;

public class List {
    public static void main(String[] args) {
        ArrayList<String> manyHeroes = new ArrayList<>();
        manyHeroes.add("Iron man");
        manyHeroes.add("Ant man");
        manyHeroes.add("Spider man");
        System.out.println(manyHeroes.size());
        System.out.println(manyHeroes.get(2));

        Collections.sort(manyHeroes);
        System.out.println(manyHeroes);

    }
}
