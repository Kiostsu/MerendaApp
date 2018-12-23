package br.kinimodev.com.repository;

import br.kinimodev.com.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository  extends JpaRepository<Aluno,Long> {
	/*Essa classe extende de JpaRepository, que significa
	*que ela lida diretamente com conexão ao banco de dados
	*a gente usa ela pra facilitar busca de um objeto no
	*banco.
	*/
	
	/*Esse metodo equivale a
	 * Select a.* from aluno a 
	 * where matricula.id = ?
	 * inner join 
	 * matricula on matricula.id = a.idMatricula
	 */
    public Aluno findAlunoByMatriculaId(Long id);
    
}
