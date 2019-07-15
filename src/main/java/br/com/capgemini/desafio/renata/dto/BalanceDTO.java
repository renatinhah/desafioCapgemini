package br.com.capgemini.desafio.renata.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
public class BalanceDTO {
	private Long agency;
	private Long account;
	private String password;
}
