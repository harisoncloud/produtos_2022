package br.edu.unoesc.ads.pessoas.dto;

import java.math.BigDecimal;

import br.edu.unoesc.ads.pessoas.entities.Pessoa;
public class PessoaDTO {
private Long id;
private String nome;
private BigDecimal idade;
private BigDecimal altura;
public PessoaDTO() { }
public PessoaDTO(Long id, String nome, BigDecimal idade, BigDecimal altura) {
this.id = id;
this.nome = nome;
this.idade = idade;
this.altura = altura;
}
public PessoaDTO(Pessoa pessoa) {
this.id = pessoa.getId();
this.nome = pessoa.getNome();
this.idade = pessoa.getIdade();
this.altura = pessoa.getAltura();
}
public Long getId() { return id; }
public void setId(Long id) { this.id = id; }
public String getNome() { return nome; }
public void setNome(String nome) { this.nome = nome; }
public BigDecimal getIdade() { return idade; }
public void setIdade(BigDecimal idade) { this.idade = idade; }
public BigDecimal getAltura() { return altura; }
public void setAltura(BigDecimal altura) { this.altura = altura; }
}