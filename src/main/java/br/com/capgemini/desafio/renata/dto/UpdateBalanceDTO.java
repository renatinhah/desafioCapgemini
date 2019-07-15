package br.com.capgemini.desafio.renata.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(of= {"password"})
public class UpdateBalanceDTO {
	private Long agency;
	private Long account;
	private String password;
	private Double value;
}
