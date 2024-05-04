# Vollmed

Projeto feito com base nos cursos da Alura Spring Boot 3.

## Sumário

- [Sobre](#sobre)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Como Usar](#como-usar)
- [Pré-requisitos](#Pré-requisitos)
- [Instalação](#Instalação)

## Sobre

A API foi desenvolvida com o objetivo de simular um sistema de gestão de uma clínica médica. Seu propósito é permitir que os usuários possam agendar consultas, cadastrar médicos e pacientes, proporcionando uma experiência prática e eficiente. Este projeto visa aprimorar minhas habilidades como desenvolvedor Java, fornecendo uma aplicação robusta e de fácil utilização para os usuários finais.

## Tecnologias Utilizadas

- Spring Boot
- Spring Data JPA
- Spring Security
- JWT (JSON Web Tokens)
- MySQL
- Flyway
- Lombok
- SpringDoc OpenAPI (para documentação da API)
- Swagger UI

## Como Usar

- Importe o projeto em sua IDE favorita (ex: IntelliJ, Eclipse).
- Configure as propriedades do banco de dados no arquivo `application.properties`.
- Execute a aplicação Spring Boot.

- Acesse a documentação da API gerada automaticamente pelo Swagger UI em [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui/index.html#/) para acessar os endpoint.
- Realize requisições HTTP para a API conforme documentado.

### Pré-requisitos

- Java 17 ou superior;

### Instalação

1. Clone este repositório.
   ```bash
   git clone https://github.com/theVytch/API-Rest-em-Java-1.git

2. adicione essa script no seu banco de dados para gerar um usuario e gerar um token para fazer as requisições.
   ```bash
   insert into vollmed_api.usuarios values (1, 'usuario.test@voll.med', '$2a$10$Y50UaMFOxteibQEYLrwuHeehHYfcoafCopUazP12.rqB41bsolF5.')
