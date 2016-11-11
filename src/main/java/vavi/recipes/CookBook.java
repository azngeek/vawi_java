package vavi.recipes;

import java.io.IOException;
import java.util.Stack;
import java.io.FileReader;
import com.opencsv.CSVReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by donbosco on 27.10.16.
 */
public class CookBook extends Stack {

    Map<String, Recipe> recipes = new HashMap<String, Recipe>();

    /**
     *
     * @param recipePath absolute path to the recipes
     */
    public CookBook(String recipePath) throws IOException
    {
        CSVReader reader = new CSVReader(new FileReader(recipePath));

        String [] nextLine;
        while ((nextLine = reader.readNext()) != null) {

            String key = nextLine[0];

            Recipe recipe = new Recipe(nextLine[0]);
            recipe.setMealType(Recipe.MealType.FISH);

            /**
             * explode the ingridiens
             */
            for (String ingridient: nextLine[2].split("\\|")) {
                Ingridient ingr = new Ingridient(ingridient);
                ingr.setName(ingridient);
                ingr.setPrice(20);
                recipe.addIngridient(ingr);
            }


            if (this.recipes.get(key) != null) {

            } else {
                this.recipes.put(nextLine[0], recipe);
            }

           // System.out.println(Arrays.toString(nextLine));
          //  System.out.println(nextLine[0] + nextLine[1]);
        }

        String t = "";
    }

    /**
     * Get all recipes which are available
     *
     * @return Map<String, Recipe>
     */
    public Map<String, Recipe> getRecipes()
    {
        return this.recipes;
    }
}
