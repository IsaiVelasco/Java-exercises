package metodos_listas;

public class Sobrecarga {

    Double calcularArea(int radio, double pi){
        return pi*(radio*radio);
    }
    int calcularArea(int lado){
        return (lado*lado);
    }

    int calcularArea(int lado, int alto){
        return (lado*alto);
    }

}
