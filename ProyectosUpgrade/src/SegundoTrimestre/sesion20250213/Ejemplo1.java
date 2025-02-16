package SegundoTrimestre.sesion20250213;

class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void resumen() {
        System.out.println("El empleado " + nombre + " tiene un salario de " + salario);
    }
}

class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void resumen() {
        System.out.println("El empleado " + nombre + " tiene un salario de " + salario + " y trabaja en el departamento de " + departamento);
    }
}

class Programador extends Empleado {
    private String lenguaje;

    public Programador(String nombre, double salario, String lenguaje) {
        super(nombre, salario);
        this.lenguaje = lenguaje;
    }

    @Override
    public void resumen() {
        System.out.println("El programador " + nombre + " tiene un salario de " + salario + " y trabaja en el lenguaje de " + lenguaje);
    }
}

public class Ejemplo1 {

    public static void main(String[] args) {
        Gerente ana = new Gerente("Ana", 3000, "IT");
        Programador luis = new Programador("Luis", 2000, "Java");

        ana.resumen();
        luis.resumen();
    }
}
