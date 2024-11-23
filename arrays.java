public class arrays {
    public static void main(String[] args) {
        String[] cars = { "Toyota", "Tesla", "Camry" };

        cars[1] = "Lexus";

        System.out.println(cars[1]);

        String[] animals = new String[4];

        animals[0] = "Cat";
        animals[1] = "Goat";
        animals[2] = "Dog";
        animals[3] = "Spider";

        System.out.println(animals[3]);

        for (int i = 0; i <= animals.length; i++) {
            System.out.println(animals[i]);
        }


    }
}
