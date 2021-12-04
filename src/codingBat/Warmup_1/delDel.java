package codingBat.Warmup_1;

public class delDel {
    public static void main(String[] args) {
        /**
         * Given a string, if the string "del" appears starting at index 1,
         * return a string where that "del" has been deleted.
         * Otherwise, return the string unchanged.
         *
         * delDel("adelbc") → "abc"
         * delDel("adelHello") → "aHello"
         * delDel("adedbc") → "adedbc"
         */
    }

    public String delDel(String str) {
        return (str.startsWith("del", 1) ? str.replace("del", "") : str);
    }

}
