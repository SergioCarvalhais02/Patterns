import java.util.List;

public class StringRecipe {
    List<StringTransformer> l;
    public StringRecipe(List<StringTransformer> a)
    {
        l = a;
    }
    public void mix(StringDrink s) {
        for(StringTransformer b:l) {
            b.execute(s);
        }
    }
}
