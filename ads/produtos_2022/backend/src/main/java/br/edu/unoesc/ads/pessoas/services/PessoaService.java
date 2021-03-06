package br.edu.unoesc.ads.pessoas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.unoesc.ads.pessoas.dto.PessoaDTO;
import br.edu.unoesc.ads.pessoas.entities.Pessoa;
import br.edu.unoesc.ads.pessoas.repositories.PessoaRepository;
@Service
public class PessoaService {
@Autowired
private PessoaRepository repositorio;
@Transactional(readOnly = true)
public Page<PessoaDTO> findAll(Pageable pageable) {
Page<Pessoa> resultado = repositorio.findAll(pageable);
Page<PessoaDTO> pagina = resultado.map(x -> new PessoaDTO(x));
return pagina;
}
@Transactional(readOnly = true)
public PessoaDTO findById(Long id) {
Pessoa resultado = repositorio.findById(id).get();
PessoaDTO dto = new PessoaDTO(resultado);
return dto;
}
}