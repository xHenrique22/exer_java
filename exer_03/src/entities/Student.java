package entities;

public class Student {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double total() {
        return (nota1 + nota2 + nota3);
    }
    public double missing() {
        return 60 - total();
    }
}
