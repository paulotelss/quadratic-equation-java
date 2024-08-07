import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //criacao de um objeto Scanner para ler a entrada do usuario
        // Entrada de dados
        System.out.print("Digite o valor de A: ");
        double a = scanner.nextDouble(); //leitura do valor de A 
        System.out.print("Digite o valor de B: ");
        double b = scanner.nextDouble(); //leitura do valor de B
        System.out.print("Digite o valor de C: ");
        double c = scanner.nextDouble(); //leitura do valor de C
        // Criacao do objeto QuadraticEquation com os coeficientes lidos
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        // Cálculo das raízes
        QuadraticRoots roots = equation.calculateRoots(); //calcula as raizes da equacao
        roots.displayRoots(); //exibe as raizes calculadas e o valor de delta
        scanner.close(); //fecha o Scanner
    }
}