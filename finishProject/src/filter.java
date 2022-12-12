import java.util.HashSet;
import java.util.Set;

public class filter {
    public static void main(String[] args) {
        Set<Notebook> laptops = new HashSet<Notebook>();
        laptops.add(new Notebook("Asus", "pavilion 326", 8,
                512, "Mac", "white"));
        laptops.add(new Notebook("Asus", "pavilion 329", 16,
                512, "Win10", "black"));
        laptops.add(new Notebook("HP", "426", 8,
                1024, "Win10", "black"));
        laptops.add(new Notebook("Aser", "JPQ 876", 32,
                1024, "Mac", "white"));
        laptops.add(new Notebook("Aser", "HDl 586", 8,
                512, "Linux", "black"));

    }
}
