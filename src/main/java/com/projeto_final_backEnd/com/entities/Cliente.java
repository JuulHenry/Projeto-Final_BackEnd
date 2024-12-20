package com.projeto_final_backEnd.com.entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cliente;
	
	@Column(unique = true)
	private String nome_completo;
	
	@JsonFormat(pattern ="yyyy-MM-dd")
	private LocalDate data_nascimento;
	
	private String contato_nome;
	private String contato_telefone;
	
	public Cliente() {}
	
	public Cliente(Long id_cliente , String nome_completo ,LocalDate data_nascimento , String contato_nome , String contato_telefone) {
		this.id_cliente = id_cliente;
		this.nome_completo = nome_completo;
		this.data_nascimento = data_nascimento;
		this.contato_nome = contato_nome;
		this.contato_telefone = contato_telefone;
	}

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNome_completo() {
		return nome_completo;
	}

	public void setNome_completo(String nome_completo) {
		this.nome_completo = nome_completo;
	}

	public LocalDate getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(LocalDate data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getContato_nome() {
		return contato_nome;
	}

	public void setContato_nome(String contato_nome) {
		this.contato_nome = contato_nome;
	}

	public String getContato_telefone() {
		return contato_telefone;
	}

	public void setContato_telefone(String contato_telefone) {
		this.contato_telefone = contato_telefone;
	}
	
	
	
}
