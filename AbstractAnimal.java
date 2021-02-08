abstract class AbstractAnimal implements Animal {
    private double weight;
    private final String name;
    public AbstractAnimal(final String name, final double weight) {
        this.name = name;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public abstract double getDailyFoodPercentage();
    public void doDailyFeeding() {
        // TODO increase weight according to daily %
    }
    public void doDailyExercise() {
        // TODO decrease weight according to daily %
    }
}