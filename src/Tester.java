public class Tester
{
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Avi", "Dado", 123);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p1.equals(p2));
    }
}