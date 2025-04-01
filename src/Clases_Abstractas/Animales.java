package Clases_Abstractas;

public class Animales {
    public static void main(String[] args) {
        Animal perro = new Perro();
        Animal gato = new Gato();
        Animal vaca = new Vaca();

        perro.emitirSonido();
        gato.emitirSonido();
        vaca.emitirSonido();

        ((Carnivoro) perro).comerCarne();
        ((Carnivoro) gato).comerCarne();
        ((Herviboro) vaca).comerHierba();
    }
}

abstract class Animal {
    abstract void emitirSonido();
}

interface Carnivoro {
    void comerCarne();
}

interface Herviboro {
    void comerHierba();
}

class Perro extends Animal implements Carnivoro {
    void emitirSonido() {
        System.out.println("Guau");
    }

    public void comerCarne() {
        System.out.println("El perro está comiendo carne.");
    }
}

class Gato extends Animal implements Carnivoro {
    void emitirSonido() {
        System.out.println("Miau");
    }

    public void comerCarne() {
        System.out.println("El gato está comiendo carne.");
    }
}

class Vaca extends Animal implements Herviboro {
    void emitirSonido() {
        System.out.println("Muuu");
    }

    public void comerHierba() {
        System.out.println("La vaca está comiendo hierba.");
    }
}
