public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
        this.noise = "Meow";
    }

    @Override
    public void greet() {
        System.out.println("Cat: " + this.name + " says: " + this.makeNoise());
    }

    public static void main(String[] args) {
        Animal a_cat = new Cat("kuangyang", 4);
        a_cat.greet();
    }
}
