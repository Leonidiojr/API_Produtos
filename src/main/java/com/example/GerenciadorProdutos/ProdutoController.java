package com.example.GerenciadorProdutos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/listarProdutos")
    public List<Produto> listarProdutos() {
        return this.produtoService.listar();
    }

    @PostMapping("/adicionarProduto")
    public void adicionarPoduto(@RequestBody Produto produto) {
        this.produtoService.adicionarProduto(produto);
    }

}
