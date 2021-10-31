public class Cat extends Pet{
    String name;
    public Cat (String n) {
        name = n;
    }

    @Override
    public String ret () {
        return name;
    }
}
