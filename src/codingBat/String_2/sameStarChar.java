package codingBat.String_2;

public class sameStarChar {
    /**
     * Returns true if for every '*' (star) in the string,
     * if there are chars both immediately before and after the star,
     * they are the same.
     * <p>
     * sameStarChar("xy*yzz") → true
     * sameStarChar("xy*zzz") → false
     * sameStarChar("*xa*az") → true
     */
    public boolean sameStarChar(String str) {

        String cutStr = str.substring(1, str.length() - 1);
        if (cutStr.contains("*")) {
            int starIndex = cutStr.indexOf('*');
            if (cutStr.charAt(starIndex - 1) == cutStr.charAt(starIndex + 1)) return true;
        } else return false;
        return false;
    }

}
