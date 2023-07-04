public class Animal {
    protected String animaltype;
    protected int age;

    public Animal(String ANimalType, int age) {
        this.animaltype = ANimalType;
        this.age = age;
    }

    public String getAnimaltype() {
        return animaltype;
    }

    public void setAnimaltype(String animaltype) {
        this.animaltype = animaltype;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "ANimalType='" + animaltype + '\'' +
                ", age=" + age +
                '}';
    }
}
