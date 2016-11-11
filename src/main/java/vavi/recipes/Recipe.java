package vavi.recipes;

/**
 * Created by donbosco on 26.10.16.
 */
public class Recipe {

    protected Ingridients ingridients;


    protected int numCooked;

    protected String name;

    public enum MealType  {
        VEGETARIAN,
        MEAT,
        FISH
    }

    public MealType mealType;

    public int getNumCooked() {
        return numCooked;
    }

    public void setNumCooked(int numCooked) {
        this.numCooked = numCooked;
    }

    public Recipe(String name) {

        this.name = name;
        this.ingridients = new Ingridients();
    }

    public void setMealType(MealType mealType)
    {
        this.mealType = mealType;
    }

    public void addIngridient(Ingridient ingridient) {
        this.ingridients.add(ingridient);
    }

    public Ingridients getIngridients() {
        return this.ingridients;
    }

    /**
     * Only cookable if we have recipes
     *
     * @return
     */
    public boolean isCookable()
    {
        return true;
    }

    public double getTotalCost() {
        double price = 0.00;
        for (int i = 0; i < this.ingridients.size(); i++) {
            price += ((Ingridient) this.ingridients.elementAt(i)).getPrice();
        }

        return price;
    }
}
