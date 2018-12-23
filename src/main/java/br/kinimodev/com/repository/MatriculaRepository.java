package br.kinimodev.com.repository;

import br.kinimodev.com.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository  extends JpaRepository<Matricula,Long> {
	/*Essa classe extende de JpaRepository, que significa
	*que ela lida diretamente com conexão ao banco de dados
	*a gente usa ela pra facilitar busca de um objeto no
	*banco.
	*/
	
	public Matricula findMatriculaByNumeroEquals(String numero); 
    
}
