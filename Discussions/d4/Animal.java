public class Animal {
    protected String name, noise;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.noise = "Huh?";
    }

    public String makeNoise() {
        if (this.age < 5) {
            return this.noise.toUpperCase();
        } else {
            return this.noise;
        }
    }

    public void greet() {
        System.out.println("Animal " + name + " says: " + this.makeNoise());
    }
}
