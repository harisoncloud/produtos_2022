package br.edu.unoesc.ads.produtos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.unoesc.ads.produtos.dto.ProdutoDTO;
import br.edu.unoesc.ads.produtos.entities.Produto;
import br.edu.unoesc.ads.produtos.repositories.ProdutoRepository;
@Service
public class ProdutoService {
@Autowired
private ProdutoRepository repositorio;
@Transactional(readOnly = true)
public Page<ProdutoDTO> findAll(Pageable pageable) {
Page<Produto> resultado = repositorio.findAll(pageable);
Page<ProdutoDTO> pagina = resultado.map(x -> new ProdutoDTO(x));
return pagina;
}
@Transactional(readOnly = true)
public ProdutoDTO findById(Long id) {
Produto resultado = repositorio.findById(id).get();
ProdutoDTO dto = new ProdutoDTO(resultado);
return dto;
}
}