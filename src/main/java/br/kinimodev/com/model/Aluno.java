package br.kinimodev.com.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GeneratorType;

import br.kinimodev.com.model.Matricula;


@Entity 
public class Aluno implements Serializable{ 
		
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @Column(name="Nome", nullable=false)
    private String nome;
    
    @JoinColumn(name = "idMatricula", referencedColumnName = "id",nullable = false)
    @OneToOne
    private Matricula matricula;
    
    @Column(name="Cpf",unique=true, nullable=false)
    private String cpf;
    
    @Temporal(TemporalType.DATE)
    @Column(name="DataNascimento", nullable=false)
    private Date dataNascimento;
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Long getId(){
        return this.id;

    }




}
