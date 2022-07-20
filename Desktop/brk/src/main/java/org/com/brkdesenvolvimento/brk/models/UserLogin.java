package org.com.brkdesenvolvimento.brk.models;

public class UserLogin {
	
	private Long id;
	
//	private String nome;
//	
//	private String login;
	
	private String senha;
	
	private String token;
	
	private String usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}
	
//	private String sobrenome;
//	
//	private String dataNasc;
//
//	private String email;
