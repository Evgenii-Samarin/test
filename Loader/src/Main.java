//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Loader {
    public static void main(String[] args) {
        String str = "Hi!";
        Dog Dog1 = new Dog();
        System.out.printf("Вес кошки N1: %.2f %n", Dog1.getWeight());
        Dog1.feed(200.0);
        Dog1.woof();
        System.out.printf("Вес кошки N1 после кормежки: %.2f %n", Dog1.getWeight());
    }
    public static class Dog {

        private final double originWeight;
        private double weight;

        public Dog() {
            this(1500.0 + 3000.0 * Math.random());
        }

        public Dog(double weight) {
            this.weight = weight;
            this.originWeight = weight;
        }

        public void woof() {
            weight = weight - 1;
            System.out.println("woof!");
        }

        public void feed(Double amount) {
            weight = weight + amount;
        }

        public void drink(Double amount) {
            weight = weight + amount;
        }

        public void pee() {
            weight = weight - 10;
            System.out.println("Clean it, man!");
        }

        public double getWeight() {
            return weight;
        }
    }}

