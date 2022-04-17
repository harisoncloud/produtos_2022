package br.edu.unoesc.ads.pessoas.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private BigDecimal idade;
	private BigDecimal altura;
	
	public Pessoa() {}

	public Pessoa(Long id, String nome, BigDecimal idade, BigDecimal altura) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public Long getId() {return id;	}

	public void setId(Long id) {this.id = id;	}

	public String getNome() {return nome;	}

	public void setNome(String nome) {this.nome = nome;	}

	public BigDecimal getIdade() {return idade;	}

	public void setIdade(BigDecimal idade) {this.idade = idade;	}

	public BigDecimal getAltura() {return altura;	}

	public void setAltura(BigDecimal altura) {this.altura = altura;}
	
	
}
