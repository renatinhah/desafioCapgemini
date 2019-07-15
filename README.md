# Api rest - desafio Capgemini
Tecnologias usadas
* h2
* spring boot
* postman (ou programa semelhante)

## Executar a aplicação 

Em uma pasta do seu computador faça o clone do repositório com os seguintes comandos:

* git init
* git clone https://github.com/renatinhah/desafioCapgemini.git

No terminal dentro da pasta onde o projeto foi clonado faça o build da aplicação:

* mvn clean install

Agora execute a aplicação:
* mvn spring-boot:run

## Acessando os breaking points

Serviço para verificar o saldo de uma conta corrente
POST
http://localhost:9090/account/balance
Retorno:
Valor do saldo
Entrada:
```sh
{
	"agency": 2525,
  "account": 2020,
  "password": "1234"
}
```

Serviço para realizar um depósito em uma determinada conta corrente;
POST
http://localhost:9090/account/deposit
Retorno:
Dados da conta com valor do saldo atualizado
Entrada:
```sh
{
	"agency": 2525,
    "account": 2020,
    "value": 100
}
```

Serviço para realizar um saque de uma determinada conta corrente.
POST
http://localhost:9090/account/cashOut
Retorno:
Dados da conta com valor do saldo atualizado
Entrada:
```sh
{
	"agency": 2525,
    "account": 2020,
    "value": 1100,
    "password": "1234"
}
```
Serviço adicional para inserir dados no banco. Não precisa ser utilizado pois ao rodar a aplicação dados de teste já são inseridos no banco.
POST
http://localhost:9090/account
Retorno:
Dados da conta criada
Entrada:
```sh
{
	"accountId": {
			"agency": 2525,
			"account": 2067
	},
	"balance": 50,
	"password": "12345"
}
```

## Verificando os dados no banco
Digite no browser o seguinte endereço: 
http://localhost:9090/h2/
a senha para acesso é root. 
Demais dados podem ser conferidos no arquivo application.properties da aplicação.
