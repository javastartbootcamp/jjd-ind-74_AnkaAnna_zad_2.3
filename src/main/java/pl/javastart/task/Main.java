package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Drink drink = new Drink();
        drink.drinkName = "Mojito";
        drink.drinkPrice = 13.0;
        drink.drinkAlcohol = true;

        System.out.println("Drink: " + drink.drinkName);
        System.out.println("Cena: " + drink.drinkPrice + "zł");
        System.out.println("Czy zawiera alkohol? " + drink.drinkAlcohol);

        Component component1 = new Component();
        Component component2 = new Component();
        Component component3 = new Component();
        component1.name = "woda";
        component2.name = "sok cytrynowy";
        component3.name = "wódka";
        component1.amount = 70;
        component2.amount = 70;
        component3.amount = 70;

        int drinkAmount = component1.amount + component2.amount + component3.amount;

        System.out.println("Składniki: ");
        System.out.println(component1.name);
        System.out.println(component2.name);
        System.out.println(component3.name);
        System.out.println("Pojemność: " + drinkAmount + "ml");
    }
}
