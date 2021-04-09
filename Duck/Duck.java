public class Duck {
    int pounds = 6;
    float floatability = 2.1F;
    String name = "Generic";
    long[] feathers = { 1, 2, 3, 4, 5, 6, 7 };
    boolean canFly = true;
    int maxSpeed = 25;

    public Duck () {
        this(true, "Generic", new long[] { 1, 2, 3, 4, 5, 6, 7 },
             6, 2.1F, 25);
    }

    public Duck (boolean fly) {
        this(fly, "Generic", new long[] { 1, 2, 3, 4, 5, 6, 7 },
             6, 2.1F, 25);
    }

    public Duck (String n, long[] f) {
        this(true, n, f, 6, 2.1F, 25);
    }

    public Duck (int w, float f) {
        this(true, "Generic", new long[] { 1, 2, 3, 4, 5, 6, 7 },
             w, f, 25);
    }

    public Duck (float density, int max) {
        this(true, "Generic", new long[] { 1, 2, 3, 4, 5, 6, 7 },
             6, density, max);
    }

    public Duck (boolean fly, String n, long[] f,
                 int w, float floatVal, int max) {
        this.canFly = fly;
        this.name = n;
        this.feathers = f;
        this.pounds = w;
        this.floatability = floatVal;
        this.maxSpeed = max;
    }

    public String FeathersToText () {
        String strReturn = "";

        for (long l : this.feathers) {
            strReturn += Long.toString(l) + " ";
        }

        return strReturn.trim();
    }

    public void DuckInfo() {
        String strTemp = null;

        if (this.canFly) {
            strTemp = "can";
        } else {
            strTemp = "cant";
        }

        System.out.println();
        System.out.println("-- Duck Info --");
        System.out.println("Duck " + strTemp + " fly");
        System.out.println("Duck's name is " + this.name);
        System.out.println("Duck's feathers: " + this.FeathersToText());
        System.out.println("Duck weighs " + Integer.toString(this.pounds) + " pounds");
        System.out.println("Duck's floatability is " + Float.toString(this.floatability));
        System.out.println("Duck's max speed is " + Integer.toString(this.maxSpeed));
    }
}