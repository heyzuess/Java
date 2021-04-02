public class MyFirstApp {
    public MyFirstApp () {
        System.out.println("\nRunning tests from MyFirstApp\n");
    }

    public static void main (String[] args) {
        System.out.println("I Rule!");
        System.out.println("The World\n");

        MyFirstApp myApp = new MyFirstApp();
        myApp.DoSomething();
        myApp.DoSomethingAgainAndAgain();
        myApp.DoSomethingUnderThisCondition();
        myApp.SimpleBooleanTest();
    }

    public void DoSomething () {
        int x = 3;
        x = x * 17;

        System.out.println("-Do Something-");

        System.out.println("x is " + x);

        double d = Math.random();
        
        System.out.println("d is " + d);
        System.out.println();
    }

    public void DoSomethingAgainAndAgain () {
        int y = 0;

        System.out.println("-Do Something Again & Again-");

        while (y > 12) {
            System.out.println("y is now " + y);
            y -= 1;
        }

        for (int x = 0; x < 10; x++) {
            System.out.println("x is now " + x);
        }

        System.out.println();
    }

    public void DoSomethingUnderThisCondition () {
        int x = 0;

        System.out.println("-Do Something Under This Condition-");

        if (x == 10) {
            System.out.println("x must be 10");
        } else {
            System.out.println("x isn't 10");
        }

        String name = "Dirk";

        if (x < 3 & name.equals("Dirk")) {
            System.out.println("Gently");
        }

        System.out.println("this line runs no matter what");
        System.out.println();
    }

    public void SimpleBooleanTest () {
        int x = 4;

        System.out.println("-Simple Boolean Test-");

        while (x > 3) {
            System.out.println("x is " + x);
            x -= 1;
        }

        int z = 27;

        while (z == 17) {
            System.out.println("z is " + z);
            z -= 1;
        }

        System.out.println();
    }
}