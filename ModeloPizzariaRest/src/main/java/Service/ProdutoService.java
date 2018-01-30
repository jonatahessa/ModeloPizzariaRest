package Service;

import Daos.DaoProduto;
import Entity.Produto;
import java.util.List;

/**
 *
 * @author joliveira
 */
public class ProdutoService {
    
    private DaoProduto daoProduto;
    
    public List<Produto> listarTudo() throws Exception {
        
        return daoProduto.listarManutencao();
    }
    
    public List<Produto> listarPorTipo(String tipo) throws Exception {
        
        return daoProduto.listarPaginaInicial(tipo);
    }
    
    public void AdicionarProduto(Produto produto) throws Exception {
        daoProduto.adicionar(produto);
    }
}
