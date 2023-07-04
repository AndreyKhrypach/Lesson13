public class Dog extends Animal{
    private String name;

    public Dog(String ANimalType, int age, String name) {
        super(ANimalType, age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", animaltype='" + animaltype + '\'' +
                ", age=" + age +
                '}';
    }
}
