import java.util.ArrayList;
import java.util.List;

public class Tehtavienhallinta {

    private ArrayList<String> tehtavat;

    public Tehtavienhallinta() {
        this.tehtavat = new ArrayList<>();
    }

    public List<String> tehtavalista() {
        return this.tehtavat;
    }

    public void lisaa(String tehtava) {
        this.tehtavat.add(tehtava);
    }
}
