public class Dog {
    String Name;

    public static void main (String[] args) {
        // Make a dog object and access it
        Dog dog1 = new Dog();
        dog1.Bark();
        dog1.Name = "Bart";

        // now make a Dog array
        Dog[] myDogs = new Dog[4];

        // fill it with dogs
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        myDogs[3] = new Dog();

        // now access the Dogs using the array
        myDogs[0].Name = "Lisa";
        myDogs[1].Name = "Marge";
        myDogs[3].Name = "Homer";

        // Display dog 3's name
        System.out.println("last dog's name is ");
        System.out.println(myDogs[2].Name);

        // now loop through the array
        // and tell all the dogs to bark
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].Bark();
            x++;
        }

        // do another loop for eating
        for (int i = 0; i < myDogs.length; i++) {
            myDogs[i].Eat();
        }

        // and one more loop for cat chase
        for (int i = 0; i < myDogs.length; i++) {
            myDogs[i].SeeCat();
            myDogs[i].ChaseCat();
        }
    }

    public void Bark() {
        System.out.println(this.Name + " says Ruff!");
    }

    public void Eat() {
        System.out.println(this.Name + " is eating!");
    }

    public void SeeCat() {
        System.out.println(this.Name + " sees a cat!");
    }

    public void ChaseCat() {
        System.out.println(this.Name + " is chasing a cat!");
    }
}
