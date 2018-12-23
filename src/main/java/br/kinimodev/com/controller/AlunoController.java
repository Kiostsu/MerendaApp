package br.kinimodev.com.controller;

import org.springframework.beans.factory.annotation.Autowired;

import br.kinimodev.com.model.Merenda;
import br.kinimodev.com.model.Matricula;
import br.kinimodev.com.model.Aluno;
import br.kinimodev.com.repository.AlunoRepository;
import br.kinimodev.com.repository.MerendaRepository;
import br.kinimodev.com.repository.MatriculaRepository;

public class AlunoController {
	
		@Autowired
		MatriculaRepository matriculaRepository;
	public Merenda retornoMerenda(String numero){
		
	
		Matricula matricula = matriculaRepository.findMatriculaByNumeroEquals(numero);
		Aluno aluno = alunoRepository.findAlunoByMatriculaId(id);
		matricula.getId();
		 
		 return null;
		
	}
	
}