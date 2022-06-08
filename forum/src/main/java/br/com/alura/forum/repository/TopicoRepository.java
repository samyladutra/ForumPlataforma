package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	// TODO: implementando com essa nomenclatura o Spring ja vai reconhecer o id
	// para fazer o select
	// List<Topico> findByTitulo(String nomeCurso);

	// TODO: o underscore é para o framework identificar que é dentro do
	// relacionamento no atributo X para ser mapeado
	List<Topico> findByCurso_Nome(String nomeCurso);

	// caso queira renomear pelo nome diferente do padrão JPA [e necess[ario
	// escrever o select com o JPQL:
	/*
	 * @Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso") List<Topico>
	 * carregarPorNomeDoCurso(@Param("nomeCurso") String nomeCurso);
	 */
}
