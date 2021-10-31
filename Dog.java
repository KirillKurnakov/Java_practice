public class Dog extends Pet{
    String name;
    public Dog (String n) {
        name = n;
    }
    @Override
    public String ret () {
        return name;
    }
}
