public class Zoo {
    public static void main(final String[] args) {

        // create animal instances
        final Animal[] zoo = new Animal[] {
            new Elephant("Huey", 505.2),
            new Elephant("Dewey", 612.9)
                
            // TODO define two more animal classes
            // TODO create instances thereof here
        };
        
        System.out.println("Roll call");
        for (int i = 0; i < zoo.length; i ++) {
            final Animal current = zoo[i];
            System.out.println("This is " + current + " weighing " + current.getWeight() + " kg");
        }

        System.out.println("Ready for feeding");
        double food = 0;
        for (int i = 0; i < zoo.length; i ++) {
            final Animal current = zoo[i];
            food += current.getDailyFoodPercentage() * current.getWeight();
            current.doDailyFeeding();
        }
        System.out.println("Today we used " + food + " kg of food");

        // TODO check weight again

        // TODO exercise

        // TODO check weight one last time
    }
}