package com.example.acreditacion.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "Usuario", uniqueConstraints = @UniqueConstraint(columnNames = { "email", "codigo" }))
public class Usuario {

	@Id
	@PrimaryKeyJoinColumn
	private Long documento;
	@Column(name = "nombre", nullable = false, length = 50)
	private String codigo;
	@Column(name = "email", nullable = false, length = 50, unique = true)
	private String email;
	@Column(name = "password", length = 60)
	private String password;
	
	public Usuario() {
		super();
	}

	public Usuario(Long documento, String codigo, String email, String password) {
		super();
		this.documento = documento;
		this.codigo = codigo;
		this.email = email;
		this.password = password;
	}
	
	public Long getDocumento() {
		return documento;
	}
	public void setDocumento(Long documento) {
		this.documento = documento;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
