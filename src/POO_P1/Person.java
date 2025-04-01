package POO_P1;

public class Person {
    String name;
    int age;
    String dni;
    double height;
    double weight;

    public Person() {}

    public Person(String name, int edad, String dni) {
        this.name = name;
        this.age = edad;
        this.dni = dni;
    }

    public Person(String name, int edad, String dni, double height, double weight) {
        this.name = name;
        this.age = edad;
        this.dni = dni;
        this.height = height;
        this.weight = weight;
    }

    public int calcularIMC() {
        double imc = weight/Math.pow(height, 2);

        if (imc < 20 ){
            return -1;
        }
        else if (imc >= 20 && imc <= 25){
            return 0;
        }
        else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        return age >= 18;
    }

    public String toString() {
        return "name: " + name +
                ", age: " + age +
                ", dni: " + dni +
                ", height: " + height +
                ", weight: " + weight +
                ", imc: " + calcularIMC() +
                ", EsMayor: " + esMayorDeEdad();
    }
}
