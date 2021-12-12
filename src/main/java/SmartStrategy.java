import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy {
    List<StringDrink> l1 = new ArrayList<StringDrink>();
    List<StringRecipe> l2 = new ArrayList<StringRecipe>();
    List<StringBar> l3 = new ArrayList<StringBar>();
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if(!bar.isHappyHour()) {
            l1.add(drink);
            l2.add(recipe);
            l3.add(bar);
        }
        else {
            bar.order(drink,recipe);
        }
    }
    @Override
    public void happyHourStarted(StringBar bar) {
        for(int i = 0; i < l1.size() ; i++) {
            bar.order(l1.get(i),l2.get(i));
        }
        l1.clear();
        l2.clear();
    }
    @Override
    public void happyHourEnded(StringBar bar) {
    }
}
