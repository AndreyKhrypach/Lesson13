public class Fax implements Device{

    private String name;

    public Fax(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printDevice() {
        System.out.println(name);
    }

    @Override
    public void showDeviceName() {
        System.out.println(this.getClass().getName());
    }
}
