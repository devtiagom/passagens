import dao.DestinoDAO;
import dao.ProdutoDAO;
import dao.ProdutoDestinoDAO;
import domain.Destino;
import domain.Produto;
import domain.ProdutoDestino;

public class App {

    public static void main(String[] args) {

        DestinoDAO destinoDAO = new DestinoDAO();
        Destino destino = new Destino("Porto velho");
        destinoDAO.save(destino);
        destino = destinoDAO.findById(destino);
        System.out.println(destino);

        ProdutoDAO produtoDAO = new ProdutoDAO();
        Produto produto = new Produto("combo");
        produtoDAO.save(produto);
        produto = produtoDAO.findById(produto);
        System.out.println(produto);

        ProdutoDestinoDAO produtoDestinoDAO = new ProdutoDestinoDAO();
        ProdutoDestino produtoDestino = new ProdutoDestino(produto, destino);
        produtoDestinoDAO.save(produtoDestino);
        produtoDestino = produtoDestinoDAO.findById(produtoDestino);
        System.out.println(produtoDestino);
    }
}
