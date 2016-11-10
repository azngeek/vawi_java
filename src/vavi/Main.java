package vavi;

import vavi.recipes.CookBook;
import vavi.recipes.Ingridient;
import vavi.recipes.Ingridients;
import vavi.recipes.Recipe;

public class Main {

    public static void main(String[] args) {

        /*Ingridient sugar = new Ingridient("zucker", 0.99);
        Ingridient salt = new Ingridient("salz", 3.99);
        Recipe recipe = new Recipe();
        recipe.addIngridient(sugar);
        recipe.addIngridient(salt);

        Ingridients ingridients = recipe.getIngridients();

        for(int i =0; i < ingridients.size(); i++)
        {
            System.out.println(((Ingridient) ingridients.elementAt(i)).getName());
            System.out.println(((Ingridient) ingridients.elementAt(i)).getPrice());
        }

        System.out.println(recipe.getTotalCost());*/

        try {
            CookBook cookBook = new CookBook("/Users/donbosco/Projekte/vawi_java/files/recipes/recipes.csv");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // get total price
	    // write your code here
    }
}
