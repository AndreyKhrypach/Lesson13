public class Book implements Printable{
    String name;
    String author;

    Book(String name, String author){

        this.name = name;
        this.author = author;
    }

    public void print() {

        System.out.printf("%s (%s) \n", name, author);
    }

//    @Override
//    public void paint() {
//        System.out.println("I am book");
//    }
}
