import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lesson13Program {
    public static void main(String[] args) {



        Device printer = new PrinterDevice("Hp 2020");
        Device fax = new Fax("Fax 202032");
        printer.printDevice();
        printer.showDeviceName();

        fax.printDevice();
        fax.showDeviceName();


        //functional interface for lambda expression
//
//        String[] names = new String[]{
//                "Greek", "Google", "g1", "QA", "Ground2"};
//
//        // declare the predicate type as string and use
//        // lambda expression to create object
//        Predicate<String> p = (s) -> s.startsWith("G");
//
//        // Iterate through the list
//        for (String st : names) {
//            // call the test method
//            if (p.test(st))
//                System.out.println(st);
//        }
//
//        MyPredicate myPredicate = x -> x > 0;
//        System.out.println(myPredicate.test(10));   //true
//
//        //так само, але використовується вбудований функціональний інтерфейс java.util.function.Predicate
//        Predicate<Integer> predicate = x -> x > 0;
//        System.out.println(predicate.test(-10));    //false
//
//
//
//        int a = 5;
//        // lambda expression to define the calculate method
//        Square s = (int x) -> x * x;
//
//        //anonymous class
//        Square s1 = new Square() {
//            @Override
//            public int calculate(int x) {
//                return x * x;
//            }
//        };
//
//        // parameter passed and return type must be
//        // same as defined in the prototype
//        int ans = s.calculate(a);
//        int ans1 = s1.calculate(a);
//        System.out.println(ans);
//        System.out.println(ans1);

        //виористання інтерфейсів в методах як поліморфізм.
//        Printable printable = createPrintable("Foreign Affairs",false);
//        printable.print();
//
//        read(new Book("Java for impatients", "Cay Horstmann"));
//        read(new Journal("Java Dayly News"));

        //dafault ethods in interfaces
//        Printable printable = new Book("Java", "Example");
//        printable.paint();

        //inner class interface
//        Printer.Printable p =new Journal("Foreign Affairs");
//        p.print();

        //variables in interfaces
//        WaterPipe pipe = new WaterPipe();
//        pipe.printState(12131);

        //static method
        //Printable.read();

//        Printable printable = new Book("Java. Complete Reference", "H. Shildt");
//        printable.print();      //  Java. Complete Reference (H. Shildt)
//        printable = new Journal("Foreign Policy");
//        printable.print();      // Foreign Policy
//
//        Printable printable1 =new Journal("Foreign Affairs");
//        printable1.print();
//        // інтерфейс не має метода getName, необхідне явне приведення
//
//        String name = ((Journal) printable1).getName();
//        System.out.println(name);

        //class polimorphysm
//        Animal fish = new Animal("fish", 1);
//        Dog dog = new Dog("dog", 2, "Sharik");
//        Animal dog2 = new Dog("Dog", 3, "Chiget");
//
//
//
//        System.out.println(fish);
//        System.out.println(dog);
//        System.out.println(dog2);
    }

    static void read(Printable p){

        p.print();
    }

    static Printable createPrintable(String name, boolean option){

        if(option)
            return new Book(name, "Undefined");
        else
            return new Journal(name);
    }
}
