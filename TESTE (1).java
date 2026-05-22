class Carro {

    String marca;
    String modelo;
    int ano;
    String cor;

    Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    void apresentar() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("Programa iniciado!");

        Carro c1 = new Carro("Toyota", "Corolla", 2020, "Prata");
        Carro c2 = new Carro("Honda", "Civic", 2022, "Preto");

        c1.apresentar();

        System.out.println();

        c2.apresentar();
    }
}