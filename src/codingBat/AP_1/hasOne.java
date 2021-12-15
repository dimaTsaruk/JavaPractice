package codingBat.AP_1;

public class hasOne {
    /**
     * Given a positive int n, return true if it contains a 1 digit.
     * Note: use % to get the rightmost digit, and / to discard the rightmost digit.
     * <p>
     * <p>
     * hasOne(10) → true
     * hasOne(22) → false
     * hasOne(220) → false
     */
    public static void main(String[] args) {
        //convert num to string example
        int n = 1024;
        String num = String.valueOf(n);
        for (int i = 0; i < num.length(); i++) {
            System.out.println(num.charAt(i));
        }
    }

    public boolean hasOne(int n) {
        String num = String.valueOf(n);
        return num.contains("1");

        //  return (n / 10 == 1 || n % 10 == 1);

    }

}
