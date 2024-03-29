package br.com.capgemini.desafio.renata.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
@Embeddable
@EqualsAndHashCode(of= {"agency","account"})
public class AccountId implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Long agency;
	private Long account;
}
