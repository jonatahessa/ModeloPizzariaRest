/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entity.Produto;
import Service.ProdutoService;
import com.google.gson.Gson;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author joliveira
 */
@Path("produtos")
public class RestProdutos {
    private ProdutoService produtoService;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public RestProdutos() {
    }

    /**
     * Retrieves representation of an instance of com.mycompany.restfulapp.RestProdutos
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    @Path("listarTodos")
    public String listarTodos() throws Exception {
        Gson gson = new Gson();
        List<Produto> produtos = produtoService.listarTudo();
        System.out.println(gson.toJson(produtos));
        return gson.toJson(produtos);
    }

    /**
     * PUT method for updating or creating an instance of RestProdutos
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_HTML)
    public void putHtml(String content) {
    }
}
