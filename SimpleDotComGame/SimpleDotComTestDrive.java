import javax.naming.spi.DirStateFactory.Result;

public class SimpleDotComTestDrive {
    public static void main (String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        int[] intLocations = {2, 3, 4};
        dot.SetLocationCells(intLocations);

        String strUserGuess = "2";
        String strResult = dot.CheckYourself(strUserGuess);

        String strTestResult = "failed";

        if (strResult.equals("hit")) {
            strTestResult = "passed";
        }

        System.out.println(strTestResult);
    }
}