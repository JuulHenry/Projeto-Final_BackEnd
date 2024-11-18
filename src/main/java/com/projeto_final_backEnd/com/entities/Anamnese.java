package com.projeto_final_backEnd.com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Anamnese {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_anamnese;
	
	private boolean tem_lesao;
	private String fator_limitante;
	private boolean cirugia;
	private String desconforto_diario;
	private String desconforto_exercicio;
	private String alimentacao;
	private boolean dieta;
	private boolean orientacao_nutricional;
	private boolean uso_ergogenico;
	private Integer horas_sono;
	
	public Anamnese() {}

	public Long getId_anamnese() {
		return id_anamnese;
	}

	public void setId_anamnese(Long id_anamnese) {
		this.id_anamnese = id_anamnese;
	}

	public boolean isTem_lesao() {
		return tem_lesao;
	}

	public void setTem_lesao(boolean tem_lesao) {
		this.tem_lesao = tem_lesao;
	}

	public String getFator_limitante() {
		return fator_limitante;
	}

	public void setFator_limitante(String fator_limitante) {
		this.fator_limitante = fator_limitante;
	}

	public boolean isCirugia() {
		return cirugia;
	}

	public void setCirugia(boolean cirugia) {
		this.cirugia = cirugia;
	}

	public String getDesconforto_diario() {
		return desconforto_diario;
	}

	public void setDesconforto_diario(String desconforto_diario) {
		this.desconforto_diario = desconforto_diario;
	}

	public String getDesconforto_exercicio() {
		return desconforto_exercicio;
	}

	public void setDesconforto_exercicio(String desconforto_exercicio) {
		this.desconforto_exercicio = desconforto_exercicio;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}

	public boolean isDieta() {
		return dieta;
	}

	public void setDieta(boolean dieta) {
		this.dieta = dieta;
	}

	public boolean isOrientacao_nutricional() {
		return orientacao_nutricional;
	}

	public void setOrientacao_nutricional(boolean orientacao_nutricional) {
		this.orientacao_nutricional = orientacao_nutricional;
	}

	public boolean isUso_ergogenico() {
		return uso_ergogenico;
	}

	public void setUso_ergogenico(boolean uso_ergogenico) {
		this.uso_ergogenico = uso_ergogenico;
	}

	public Integer getHoras_sono() {
		return horas_sono;
	}

	public void setHoras_sono(Integer horas_sono) {
		this.horas_sono = horas_sono;
	}
	
	

}
