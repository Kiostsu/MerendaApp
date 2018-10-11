package br.kinimodev.com.repository;

import br.kinimodev.com.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository  extends JpaRepository<Aluno,Long> {

    public Aluno findAlunoByMatriculaId(Long id);

}
