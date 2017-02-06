public class Dog {

    public int size;

    public Dog(int s) {
        this.size = s;
    }

    public void makeNoise() {
        if (size < 20) {
            System.out.println("hideous yapping");
        } else if (size < 50) {
            System.out.println("bark!");
        } else {
            System.out.println("arooooooooooooo!");
        }
    }

    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.size > d2.size) {
            return d1;
        }
        return d2;
    }

    public Dog maxDogComparedToMe(Dog anotherDog) {
        if (size > anotherDog.size) {
            return this;
        }
        return anotherDog;
    }
}
