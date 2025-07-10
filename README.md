# 🧠 Desafio Backend - Java + Spring Boot

API para gerenciamento de tarefas (CRUD), desenvolvida para estudo.

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring MVC
- Spring Data JPA
- MySQL
- Maven

---

## ✅ Práticas Adotadas

- Princípios SOLID, DRY, YAGNI e KISS
- Arquitetura RESTful
- Injeção de dependências (IoC/DI)
- Tratamento centralizado de erros
- Consultas com Spring Data JPA

---

## 📦 Requisitos

- Java 17 ou superior
- Maven 3.8+
- MySQL Server rodando localmente

---

## ▶️ Como Rodar o Projeto

1. Clone o repositório:

```bash
git clone https://github.com/seuusuario/seurepositorio.git
cd seurepositorio
```

2. Configure o banco de dados no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/seubanco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

3. Execute a aplicação:

```bash
./mvnw spring-boot:run
```

4. Acesse a documentação gerada:

```
http://localhost:8080/swagger-ui.html
```
