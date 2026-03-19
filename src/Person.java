public class Person
{
    private int id;
    private String name;
    private String familyName;

    // Default constructor
    public Person() {
    }

    public Person(String n, String fn, int id) {
        name = n;
        familyName = fn;
        this.id = id;
    }

    public String toString() {
        String s = "";
        s += name + " " + familyName + " " + id;
        return s;
    }
}