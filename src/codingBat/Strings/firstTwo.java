package codingBat.Strings;

public class firstTwo {


    public static void main(String[] args) {

        String text = "DevX School coding task";
        text.substring(text.indexOf('t'), text.length());

        boolean result = text.equals("task");
        System.out.println(result);


    }

}
