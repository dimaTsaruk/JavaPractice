package thenewboston;

public class test {
    public static void main(String[] args) {
        TimeConstructor time = new TimeConstructor();
        TimeConstructor time1 = new TimeConstructor(7);
        TimeConstructor time2 = new TimeConstructor(18, 8);
        TimeConstructor time3 = new TimeConstructor(2, 17, 54);

        System.out.printf("%s\n", time.toMilitary());
        System.out.printf("%s\n", time1.toMilitary());
        System.out.printf("%s\n", time2.toMilitary());
        System.out.printf("%s\n", time3.toMilitary());


        Time t = new Time();
        System.out.println("Default time: ");
        System.out.println(t.toMilitary());
        System.out.println(t.toRegular());

        System.out.println("\nAfter setting time: ");
        t.setTime(5, 22, 54);
        System.out.println(t.toMilitary());
        System.out.println(t.toRegular());



    }
}
