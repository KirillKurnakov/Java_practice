public class Owl extends Pet{
    String name;
    public Owl (String n) {
        name = n;
    }

    @Override
    public String ret () {
        return name;
    }
}
