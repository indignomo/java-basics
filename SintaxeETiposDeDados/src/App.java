public class App {
    public static void main(String[] args) throws Exception {

        CalculadoraAreaCirculo calculadora = new CalculadoraAreaCirculo();
        Cumprimentar bemVindo = new Cumprimentar();

        bemVindo.cumprimentarVoce();
        calculadora.calcularArea();
    }
}
