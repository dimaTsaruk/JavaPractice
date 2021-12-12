package codingBat.Warmup_2;

public class stringSplosion {
    /**
     * Given a non-empty string like "Code" return a string like "CCoCodCode".
     * <p>
     * stringSplosion("Code") → "CCoCodCode"
     * stringSplosion("abc") → "aababc"
     * stringSplosion("ab") → "aab"
     */


    public String stringSplosion(String str) {
        String nStr = "";
        for(int i = 0; i < str.length(); i++) {
            nStr += str.substring(0, i + 1);
        }
        return nStr;
    }

}
