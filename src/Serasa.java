import java.util.Scanner;

public class Serasa {
    public static int parcela;
    public static String nome;
    public static Double cpf;
    public static Scanner teclado = new Scanner(System.in);

    public static void parcelamento(int parcelaMAX, double valorTotal){
        while ((parcela > parcelaMAX) || (parcela < 1)){
            System.out.print("Deseja pagar em quantas vezes? Até " + parcelaMAX + "x: ");
            parcela = teclado.nextInt();
        }

        System.out.println("");
        System.out.printf("%s, você irá pagar %d vezes de %.2f reais.", nome, parcela, valorTotal/parcela);
        System.out.println("");
        System.out.print("Deseja fazer a contratação?[S] ou [N]: ");
        var contratacao = teclado.next();
        if (contratacao.toUpperCase().equals("S")){
            System.out.println("Contratação concluída com sucesso. Obrigado pela preferência!");
        } else {
            System.out.println("Contratação não efetuada.");
        }

    }

    public static void main(String[] args) {

        System.out.print("Informe seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Informe seu CPF: ");
        cpf = teclado.nextDouble();
        System.out.print("Seu CPF está negativado?[S] ou [N]: ");
        var negativado = teclado.next();

        if (negativado.toUpperCase().equals("S")){
            System.out.println("(1) Caixa - 1.000 em até 8x");
            System.out.println("(2) Caixa - 2.000 em até 10x");
            System.out.println("(3) Caixa - 5.000 em até 12x");
            System.out.println("");
            System.out.print("Escolha uma opção de crédito para você: ");
            var opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você optou pelo empréstimo de 1.000");
                    parcelamento(8, 1000);
                    break;
                case 2:
                    System.out.println("Você optou pelo empréstimo de 2.000");
                    parcelamento(10, 2000);
                    break;
                case 3:
                    System.out.println("Você optou pelo empréstimo de 5.000");
                    parcelamento(12, 5000);
                    break;
            }
        } else if (negativado.toUpperCase().equals("N")){
            System.out.println("(1) Caixa - 1.000 em até 12x");
            System.out.println("(2) Caixa - 2.000 em até 12x");
            System.out.println("(3) Caixa - 5.000 em até 24x");
            System.out.println("(4) Santander - 10.000 em até 24x");
            System.out.println("(5) Santander - 15.000 em até 24x");
            System.out.println("(6) Santander - 20.000 em até 48x");
            System.out.println("(7) Banco do Brasil - 25.000 em até 48x");
            System.out.println("(8) Banco do Brasil - 30.000 em até 48x");
            System.out.println("(9) Banco do Brasil - 35.000 em até 60x");
            System.out.println("(10) Safra - 40.000 em até 72x");
            System.out.println("(11) Safra - 45.000 em até 72x");
            System.out.println("(12) Safra - 50.000 em até 84x");
            System.out.println("");
            System.out.print("Escolha um opção de crédito para você: ");
            var opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você optou pelo empréstimo de 1.000");
                    parcelamento(12, 1000);
                    break;
                case 2:
                    System.out.println("Você optou pelo empréstimo de 2.000");
                    parcelamento(12, 2000);
                    break;
                case 3:
                    System.out.println("Você optou pelo empréstimo de 5.000");
                    parcelamento(24, 5000);
                    break;
                case 4:
                    System.out.println("Você optou pelo empréstimo de 10.000");
                    parcelamento(24, 10000);
                    break;
                case 5:
                    System.out.println("Você optou pelo empréstimo de 15.000");
                    parcelamento(24, 15000);
                    break;
                case 6:
                    System.out.println("Você optou pelo empréstimo de 20.000");
                    parcelamento(48, 20000);
                    break;
                case 7:
                    System.out.println("Você optou pelo empréstimo de 25.000");
                    parcelamento(48, 25000);
                    break;
                case 8:
                    System.out.println("Você optou pelo empréstimo de 30.000");
                    parcelamento(48, 30000);
                    break;
                case 9:
                    System.out.println("Você optou pelo empréstimo de 35.000");
                    parcelamento(60, 35000);
                    break;
                case 10:
                    System.out.println("Você optou pelo empréstimo de 40.000");
                    parcelamento(72, 40000);
                    break;
                case 11:
                    System.out.println("Você optou pelo empréstimo de 45.000");
                    parcelamento(72, 45000);
                    break;
                case 12:
                    System.out.println("Você optou pelo empréstimo de 50.000");
                    parcelamento(84, 50000);
                    break;
            }

        }

    }

}
