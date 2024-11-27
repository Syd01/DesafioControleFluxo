import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro Numero:");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo Numero:");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Mensagem fixa no caso de erro
            System.out.println("Erro: O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar os parâmetros
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        // Realizar o loop para imprimir os números
        System.out.println("Contando...");
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo Número " + i);
        }
    }
}
