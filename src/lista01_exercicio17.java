import java.util.Scanner;

public class lista01_exercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double area;
        int qtdLatas, qtdGaloes, qtdLatasResto;
        double precoLatas, precoGaloes, totalLatas, totalGaloes, totalLatasResto;

        System.out.print("Informe o tamanho da área em metros quadrados: ");
        area = input.nextDouble();

        // Quantidade de tinta necessária, considerando 10% de folga
        double qtdTinta = area / 6.0 * 1.1;

        // Quantidade de latas de tinta necessárias, arredondando para cima
        qtdLatas = (int) Math.ceil(qtdTinta / 18.0);

        // Quantidade de galões de tinta necessários, arredondando para cima
        qtdGaloes = (int) Math.ceil(qtdTinta / 3.6);

        // Quantidade de latas de tinta restantes após comprar apenas latas de 18 litros
        qtdLatasResto = qtdLatas % 18;

        // Preço total comprando apenas latas de 18 litros
        precoLatas = qtdLatas * 80.0;

        // Preço total comprando apenas galões de 3,6 litros
        precoGaloes = qtdGaloes * 25.0;

        // Quantidade de latas de tinta necessárias para misturar com galões
        qtdLatas = (int) (qtdTinta / 18.0);

        // Quantidade de latas de tinta restantes após comprar apenas latas de 18 litros ou misturar com galões
        qtdLatasResto = (int) Math.ceil((qtdTinta % 18.0) / 3.6);

        // Quantidade total de latas e galões
        totalLatas = qtdLatas * 80.0;
        totalGaloes = qtdGaloes * 25.0;
        totalLatasResto = qtdLatasResto * 80.0;

        double precoTotal = totalLatas + totalGaloes + totalLatasResto;

        System.out.printf("Quantidade de tinta a ser comprada: %.2f litros\n", qtdTinta);
        System.out.printf("Preço comprando apenas latas de 18 litros: R$ %.2f\n", precoLatas);
        System.out.printf("Preço comprando apenas galões de 3,6 litros: R$ %.2f\n", precoGaloes);
        System.out.printf("Preço misturando latas de 18 litros com galões de 3,6 litros: R$ %.2f\n", precoTotal);
    }
}
