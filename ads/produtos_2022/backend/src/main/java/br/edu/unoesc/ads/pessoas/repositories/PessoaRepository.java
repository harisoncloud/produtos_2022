package br.edu.unoesc.ads.pessoas.repositories;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.edu.unoesc.ads.pessoas.entities.Pessoa;
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
@Query("select p from Pessoa p where p.idade >= :idade")
List<Pessoa> porQuantidade(@Param("idade") BigDecimal idade);
}