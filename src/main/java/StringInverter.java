import java.util.*;
public class StringInverter implements StringTransformer {
    StringBuilder s = new StringBuilder();
    @Override
    public void execute(StringDrink drink) {
        s.append(drink.getText());
        s.reverse();
        drink.setText(s.toString());
    }
}
