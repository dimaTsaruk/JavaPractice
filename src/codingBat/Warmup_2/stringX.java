package codingBat.Warmup_2;

public class stringX {
    /**
     * Given a string, return a version where
     * all the "x" have been removed.
     * Except an "x" at the very start or end should not be removed.
     * <p>
     * <p>
     * stringX("xxHxix") → "xHix"
     * stringX("abxxxcd") → "abcd"
     * stringX("xabxxxcdx") → "xabcdx"
     */
    public String stringX(String str) {
        String newSrt = str.replaceAll("x", "");
        return (str.equals("x"))? str : (str.startsWith("x") && !str.endsWith("x") ?
                "x" + newSrt : !str.startsWith("x") && str.endsWith("x") ?
                newSrt + "x" : str.startsWith("x") && str.endsWith("x") ? "x" + newSrt + "x": newSrt);


    }

}
