public class PhraseOMatic {
    public static void main (String[] args) {
        // make three sets of words to choose from.
        String[] strList1 = {
            "24/7", "multi-tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based",
            "pervasive", "smart", "six-sigma", "critical-path", "dynamic"
        };

        String[] strList2 = {
            "empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered",
            "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged",
            "aligned", "targeted", "shared", "cooperative", "accelerated"
        };

        String[] strList3 = {
            "process", "tipping-point", "solution", "architecture", "core-competancy", "strategy",
            "mindshare", "portal", "space", "vision", "paradigm", "mission"
        };

        // find out how many words are in each list
        int intLength1 = strList1.length;
        int intLength2 = strList2.length;
        int intLength3 = strList3.length;

        // generate three random numbers
        int intRand1 = (int) (Math.random() * intLength1);
        int intRand2 = (int) (Math.random() * intLength2);
        int intRand3 = (int) (Math.random() * intLength3);

        // now build a phrase
        String strPhrase = strList1[intRand1] + " " +
                           strList2[intRand2] + " " +
                           strList3[intRand3];

        // print out the phrase
        System.out.println("What we need is a " + strPhrase + "!");
    }
}
