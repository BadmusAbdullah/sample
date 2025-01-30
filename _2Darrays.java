import java.util.*;

public class _2Darrays {
    public static void main(String[] args) {
        
        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("Pasta");
        bakeryList.add("Sugar");
        bakeryList.add("Salt");


        ArrayList<String> veggiesList = new ArrayList();
        veggiesList.add("Tomatoes");
        veggiesList.add("Peppers");
        veggiesList.add("Onions");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("Fanta");
        drinksList.add("Sumo");
        drinksList.add("Maltina");

        groceryList.add(bakeryList);
        groceryList.add(veggiesList);
        groceryList.add(drinksList);

        System.out.println(groceryList);
        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(0).get(1));
    }
}
