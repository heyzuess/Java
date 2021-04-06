import java.util.*;

public class DotCom {
    private ArrayList<String> LocationCells;
    private String Name;

    public void SetLocationCells (ArrayList<String> strLoc) {
        this.LocationCells = strLoc;
    }

    public void SetName (String strName) {
        this.Name = strName;
    }

    public String GetName () {
        return this.Name;
    }

    public String CheckYourself (String strUserInput) {
        String strResult = "miss";
        int intIndex = this.LocationCells.indexOf(strUserInput);

        if (intIndex >= 0) {
            this.LocationCells.remove(intIndex);

            if (this.LocationCells.isEmpty()) {
                strResult = "kill";
                System.out.println("Ouch! You sunk " + this.Name + "   :( ");
            } else {
                strResult = "hit";
            }
        }

        return strResult;
    }
}
