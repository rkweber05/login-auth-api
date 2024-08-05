# Projeto de Login e Cadastro de Usuários

## Este projeto é uma implementação de um sistema de login e cadastro de usuários utilizando Java com Spring Boot e Spring Security. O objetivo principal é demonstrar a aplicação de conceitos de segurança em uma aplicação web.

## Funcionalidades
* Cadastro de novos usuários
* Login de usuários registrados
* Proteção de rotas com autenticação
* Validação de dados de entrada
* Hashing de senhas para armazenamento seguro

## Tecnologias Utilizadas
* Java 11
* Spring Boot
* Spring Security
* H2 Database (para ambiente de desenvolvimento)
* Maven (para gerenciamento de dependências)

## Instalação e Execução

**Clone o repositório:**
  * git clone https://github.com/seu-usuario/nome-do-repositorio.git
  * cd nome-do-repositorio

**Compile e execute a aplicação usando Maven:**
  * mvn spring-boot:run

**Acesse a aplicação no seu navegador:**
  * http://localhost:8080/**

## Configuração de Banco de Dados
  * O projeto está configurado para usar o banco de dados H2 em memória para facilitar o desenvolvimento. Você pode acessar o console do H2 para visualizar os dados:
  **Use as seguintes credenciais:**
  JDBC URL: jdbc:h2:mem:testdb
  User Name: sa
  Password:

## Contribuição
  * Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e enviar pull requests.

  * Faça um fork do projeto
  * Crie uma branch para a sua feature (git checkout -b minha-feature)
  * Commit suas mudanças (git commit -m 'Adicionar minha feature')
  * Push para a branch (git push origin minha-feature)
  * Abra um Pull Request

## Licença
  * Este projeto está licenciado sob a Licença MIT. Veja o arquivo LICENSE para mais detalhes.

