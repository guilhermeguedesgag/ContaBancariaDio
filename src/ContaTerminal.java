import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scannerDaPagina = new Scanner(System.in);
        System.out.println("Por favor, digite o número de sua agência:");
        int numero = scannerDaPagina.nextInt();

        scannerDaPagina.nextLine();// este aqui está limpando o buffer, se não colocar ele quebra a linha

        System.out.println("Por favor, digite o nome da sua agência:");
        String agencia = scannerDaPagina.nextLine();

        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scannerDaPagina.nextLine();


        System.out.println("Por favor, digite seu saldo(inclusive centavos):");
        double decimal = scannerDaPagina.nextDouble();


    System.out.println("Olá "+nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência"+
                " é "+ agencia + ", conta "+numero+ " e seu saldo R$"+decimal+" ,já está disponível para saque.");


    }
}
