public class MovingObject implements Flying, Moving, Square{

    @Override
    public void fly() {
        System.out.println("i moving");
    }

    @Override
    public void move() {
        System.out.println("I am flying and moving");
    }

    @Override
    public int calculate(int x) {
        return 0;
    }
}
