/**
Para resolver o problema, foi necessário calcular o tempo que o carro e o caminhão levam para se encontrarem na estrada. Sabendo a velocidade dos dois veículos e a distância entre as cidades, foi possível determinar que eles se encontram após 45 minutos de viagem. Como o carro é mais rápido, ele percorre uma distância maior nesse tempo e, portanto, está mais próximo de Ribeirão Preto. Ao final do cálculo, verificou-se que o carro estava a aproximadamente 52 km da cidade de Ribeirão Preto, enquanto o caminhão estava a cerca de 48 km.

 */



public class DistanciaRodovia {
    public static void main(String[] args) {

        int distancia = 100; // distância entre as cidades em km
        double velocidadeCarro = 110; // velocidade constante do carro em km/h
        double velocidadeCaminhao = 80; // velocidade constante do caminhão em km/h
        double tempoPedagioCaminhao = 10.0/60; // tempo em horas para o caminhão passar por dois pedágios
        double tempoCarro = distancia / velocidadeCarro; // tempo em horas que o carro leva para percorrer a distância
        double tempoCaminhao = distancia / velocidadeCaminhao + tempoPedagioCaminhao * 2; // tempo em horas que o caminhão leva para percorrer a distância, considerando os pedágios
        double distanciaCarro = velocidadeCaminhao * tempoCaminhao; // distância em km que o carro percorre a mais do que o caminhão até se encontrarem
        double distanciaCaminhao = distancia - distanciaCarro; // distância em km que o caminhão percorre a mais do que o carro até se encontrarem
        
        if (distanciaCarro < distanciaCaminhao) {
            System.out.println("O carro estará mais próximo de Ribeirão Preto.");
        } else {
            System.out.println("O caminhão estará mais próximo de Ribeirão Preto.");
        }
    }
}
