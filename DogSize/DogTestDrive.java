public class DogTestDrive {
    public static void main (String[] args) {
        Dog one = new Dog();
        one.Name = "Homer";
        one.Size = 70;

        Dog two = new Dog();
        two.Name = "Bart";
        two.Size = 8;

        Dog three = new Dog();
        three.Name = "Lisa";
        three.Size = 35;

        Dog[] myDogs = new Dog[] {
            one, two, three
        };

        for (int i = 0; i < myDogs.length; i++) {
            System.out.println(myDogs[i].toString());
            myDogs[i].Bark();
            System.out.println();
        }
    }
}
