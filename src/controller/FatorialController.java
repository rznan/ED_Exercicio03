package controller;
public class FatorialController {
    public FatorialController() {}

    public int calculate(int value) {
        // Para calcular o fatorial de um número natural qualquer N, onde N > 0, devemos multiplicar todos os números de
        // 1 até N para obter o resultado de N!. Outra maneira de pensar neste problema é notar que o fatorial de N é
        // N * (N-1)!. Se lembrarmos da definição anterior, notaremos que desta forma teremos multiplicado todos os valores
        // de 1 até N. Assim como N, o fatorial de (N-1) pode ser definido como (N-1)*((N-1)-1), e assim por diante.

        // Utilizando esse conceito, você pode criar uma função que calcula o fatorial de um número recursivamente,
        // multiplicando o valor de N pelo fatorial de N-1, até encontrar um valor com resultado definido (CONDIÇÃO DE
        // PARADA). Nesse caso, a condição de parada é 0, uma vez que o fatorial de 0 sempre é 1.

        if(value <= 0) return 1;
        return value * calculate(--value);
    }
}
