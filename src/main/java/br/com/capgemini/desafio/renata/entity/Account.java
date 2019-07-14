package br.com.capgemini.desafio.renata.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Account")
@IdClass(Account.class)
@Getter @Setter 
@NoArgsConstructor @AllArgsConstructor
public class Account implements Serializable {
	
	@Id
	private Long agency;
	
	@Id
	private Long account;
	
	private String balance;
	
	private String password;
	
	

}
