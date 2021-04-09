public class TestDuck {
    public static void main (String[] args) {
        int intWeight = 8;
        float fltDensity = 2.3F;
        String strName = "Donald";
        long[] lngFeathers = { 1, 2, 3, 4, 5, 6 };
        boolean blnCanFly = true;
        int intAirSpeed = 22;

        Duck[] myDucks = new Duck[] {
            new Duck(),
            new Duck(fltDensity, intWeight),
            new Duck(strName, lngFeathers),
            new Duck(blnCanFly),
            new Duck(3.3F, intAirSpeed),
            new Duck(false),
            new Duck(intAirSpeed, fltDensity)
        };

        for (Duck myDuck : myDucks) {
            myDuck.DuckInfo();
        }
    }
}