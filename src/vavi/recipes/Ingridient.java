package vavi.recipes;

import java.text.DecimalFormat;

/**
 * Created by donbosco on 26.10.16.
 */
public class Ingridient {

    protected String name;

    protected double price;

    protected double protein;

    protected double carbs;

    public Ingridient(String name)
    {
        this.setName(name);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
}
