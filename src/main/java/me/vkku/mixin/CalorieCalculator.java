package me.vkku.mixin;

import java.util.List;
import me.vkku.mixin.IngredientList.Ingredient;
/*
    Core : Add additional functionality to existing type(interface). Can also be described as optional interface to implement
    from the POV of concrete class, as the class(concrete) would have an option to implement existing or mixin type.
    Mixin is a optional interface which allows one to use alternatives in implementation, mixins are abstract and often
    implemented using multiple inheritance. Java does not support multiple inheritance hence I used the following approach
    to use a library collection List with an additional method getElements. so ideally getElements is mixed to default implementation,
    hence mixin
    1. Create a interface extending list, add new method getElements
    2. Create an abstract class, IngredientList which implements getElements
    3. Use the IngredientList's custom getElements in main class - CalorieCalculator

 */

public class CalorieCalculator {

    public static void main(String[] args) {
        List<Ingredient> list = List.of(new Ingredient("Glucose", "20%"));

        IngredientList ingredientList = new IngredientList();
        ingredientList.ingredientList = list;
        System.out.println(ingredientList.getElements()); //[Ingredient[name=Glucose, composure=20%]]
    }
}
