import java.util.ArrayList;
import java.util.List;

public class LojaApp {

    static List<Produto> produtoList = new ArrayList<>();
    static Produto carro;
    static Produto moto;

    public static void main(String[] args) {
        carro = new Produto("Ferrari", 2000000.45, 2);
        moto = new Produto("Fazer 250", 12000, 4);

        produtoList.add(carro);
        produtoList.add(moto);

        exibirInformacoes();

        vender();

        reporEstoque();

        exibirInformacoes();

    }

    public static void exibirInformacoes() {
        System.out.println("Informações");
        for (int i = 0; i < produtoList.size(); i++) {
            System.out.println("Poduto: " + produtoList.get(i).getNome());
            System.out.println("Valor R$: " + produtoList.get(i).getPreco());
            System.out.println("Quantidade: " + produtoList.get(i).getQuantidadeEstoque());
            System.out.println("\n#################################################");
        }
    }

    public static void vender() {
        System.out.println("Venda");
        int quantidade = 2;
        if (quantidade > carro.getQuantidadeEstoque()) {
            System.out.println("Estoque insuficiente!!!");
            return;
        }
        carro.setQuantidadeEstoque(carro.getQuantidadeEstoque() - quantidade);
        produtoList.set(0, carro);
    }

    public static void reporEstoque() {
        System.out.println("Repor");
        carro.setQuantidadeEstoque(carro.getQuantidadeEstoque() + 1);
        produtoList.add(carro);
    }

}
