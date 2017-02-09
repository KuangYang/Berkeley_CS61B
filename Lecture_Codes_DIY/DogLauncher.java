public class DogLauncher {
    public static void main(String args[]) {
        //Dog maya = new Dog(15);
        //maya.size = 1000;

        Dog[] someDogs = new Dog[2];
        someDogs[0] = new Dog(10);
        someDogs[1] = new Dog(105);

        someDogs[0].makeNoise();

        Dog max1 = Dog.maxDog(someDogs[0], someDogs[1]);
        max1.makeNoise();

        Dog max2 =someDogs[1].maxDogComparedToMe(someDogs[0]);
        max2.makeNoise();
        //maya.makeNoise();
    }
}
