import java.util.List;

public class StringTransformerGroup implements StringTransformer {
    List<StringTransformer> l;
    public StringTransformerGroup(List<StringTransformer> a)
    {
        l = a;
    }

    @Override
    public void execute(StringDrink drink) {
        for(StringTransformer b:l) {b.execute(drink);}
    }
}
