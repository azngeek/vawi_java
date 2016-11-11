package vavi;

import vavi.recipes.CookBook;
import vavi.recipes.Ingridient;
import vavi.recipes.Ingridients;
import vavi.recipes.Recipe;
import java.io.File;
import java.util.Map;

import java.io.InputStream;

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

        File resourcesDirectory = new File("src/test/resources");

        String in = resourcesDirectory.getAbsolutePath() + "/recipes.csv";

        try {
            CookBook cookBook = new CookBook(in);

            for (Map.Entry<String, Recipe> entry : cookBook.getRecipes().entrySet()) {

                System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
                System.out.println("Cost = " + entry.getValue().getTotalCost());
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // get total price
	    // write your code here
    }
}
