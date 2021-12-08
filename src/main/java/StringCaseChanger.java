public class StringCaseChanger implements StringTransformer {
    String ns;
    @Override
    public void execute(StringDrink drink) {
        ns="";
        for(int i=0; i< drink.getText().length(); i++) {
                if (Character.isLowerCase(drink.getText().charAt(i))) {
                    ns+=Character.toUpperCase(drink.getText().charAt(i));
                } else{
                    ns+=Character.toLowerCase(drink.getText().charAt(i));
                }
        }
        drink.setText(ns);
    }
}
