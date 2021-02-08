public class Zoo {
    public static void main(final String[] args) {
        final Mammal[] zoo = new Mammal[] {
            new Elephant("Huey", 505.2),
            // TODO add more mammal instances here
        }

        System.out.println("Roll call");
        for (int i = 0; i < zoo.length; i ++) {
            System.out.println("This is " + zoo[i]);
        }

        System.out.println("Ready for feeding");
        double food = 0;
        for (int i = 0; i < zoo.length; i ++) {
            food += zoo[i].dailyFoodRequired();
            zoo[i].dailyFeeding();
        }
        System.out.println("Today we used " + food + " kg of food");

        System.out.println("Ready to check weight");
        for (int i = 0; i < zoo.length; i ++) {
            System.out.println("This is " + zoo[i]);
        }

        System.out.println("Ready to work out");
        for (int i = 0; i < zoo.length; i ++) {
            zoo[i].dailyExercise();
        }

        System.out.println("Ready to check weight");
        for (int i = 0; i < zoo.length; i ++) {
            System.out.println("This is " + zoo[i]);
        }
    }
}