package codingBat.Logic1;

public class fizzString {
    public static void main(String[] args) {
        /**
         *
         Given a string str, if the string starts with "f" return "Fizz".
         If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true,
         return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code)

         fizzString("fig") → "Fizz"
         fizzString("dib") → "Buzz"
         fizzString("fib") → "FizzBuzz"
         */
    }

    public String fizzString(String str) {
        return (str.startsWith("f") && str.endsWith("b")) ? "FizzBuzz" : str.startsWith("f") ? "Fizz" :
                str.endsWith("b") ? "Buzz" : str;

    }

}
