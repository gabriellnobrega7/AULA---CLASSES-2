import java.util.Scanner;

public class Exemplo03 {
    
    public static Scanner input = new Scanner(System.in);

    public static void preencher(Produto arroz){

        System.out.println("Digite o Título/Marca para o produto: ");
        arroz.titulo = input.nextLine();
        System.out.println("Digite uma descrição: ");
        arroz.descricao = input.nextLine();
        System.out.println("Digite o preço unitário do produto: ");
        arroz.preco = input.nextDouble();
        System.out.println("Digite a quantidade que  ainda resta no estoque: ");
        arroz.qtdEstoque = input.nextInt();
        input.nextLine();
    }
    public static void imprimir(Produto arroz){

        System.out.println("Título: " + arroz.titulo);
        System.out.println("Descrição: " + arroz.descricao);
        System.out.println("Preço unitário: " + arroz.preco);
        System.out.println("Quantidade disponível: " + arroz.qtdEstoque);

    }
    public static void main(String[] args) {

        Produto[] produto = new Produto[5];

         for(int i = 0; i < produto.length; i++){
            produto[i] = new Produto();
            System.out.println("\n----DIGITAÇÃO DOS PRODUTOS ----");
            System.out.println(" --- Digite o produto: " + (i + 1)+ "---");
            preencher(produto[i]);

         }
        
         System.out.println("\n---- IMPRESSÃO DOS PRODUTOS----");
         for(int i = 0; i < produto.length; i++){
            System.out.println("Produto  " + (i + 1)+ " :");
            imprimir(produto[i]);

         }
  }
}