package br.com.capgemini.desafio.renata.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Account")
@Getter @Setter 
@NoArgsConstructor @AllArgsConstructor
public class Account {
	
	@Id
	private Long agency;
	
	@Id
	private Long account;
	
	private String balance;
	
	private String password;
	
	

}
