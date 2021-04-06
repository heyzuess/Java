public class SimpleDotCom {
    public int[] LocationCells;
    public int NumOfHits = 0;

    public void SetLocationCells (int[] intLocations) {
        this.LocationCells = intLocations;
    }

    public String CheckYourself (String strGuess) {
        int intGuess = Integer.parseInt(strGuess);

        String strResult = "miss";

        for (int intCell : this.LocationCells) {
            if (intGuess == intCell) {
                strResult = "hit";
                this.NumOfHits++;
                break;
            }
        }

        if (this.NumOfHits == this.LocationCells.length) {
            strResult = "kill";
        }

        System.out.println(strResult);

        return strResult;
    }
}
