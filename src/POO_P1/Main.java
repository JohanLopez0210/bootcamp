package POO_P1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Johan", 27, "1030681277");
        Person person3 = new Person("Luz", 47, "52475783", 70, 1.60);

        System.out.println(person3.toString());
    }
}
