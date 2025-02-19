package com.example.GerenciadorProdutos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    List<Produto> produtos = new ArrayList<>();
    String message;

    public List<Produto> listar(){
        for (Produto produto : produtos) {
            return produtos;
        }
        return null;
    }
    public Produto adicionarProduto(Produto produto) {
        produtos.add(produto);
        return produto;
    }

}
