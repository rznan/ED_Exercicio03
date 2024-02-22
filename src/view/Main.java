package view;

import controller.FatorialController;


//    3. Crie uma função recursiva que exiba o resultado do fatorial de um número (Pela limitação da
//    recursividade, o número de entrada deverá ser baixo para não dar estouro(limite de entrada = 12)):
//    O código deve trazer como comentários:
//    A condição de parada
//    Como escrever a função para o termo n em função do termo anterior


public class Main {
    public static void main(String[] args) {
        int value = 12;
        var fatController = new FatorialController();

        System.out.println(fatController.calculate(value));
    }
}