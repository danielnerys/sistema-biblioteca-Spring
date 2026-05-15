# 📚 Biblioteca API

Projeto desenvolvido em Java utilizando Spring Boot para gerenciamento de usuários e livros de uma biblioteca.

## 🚀 Tecnologias utilizadas

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- IntelliJ IDEA

---

## 📌 Funcionalidades

### 👤 Usuários
- Cadastrar usuário
- Listar usuários
- Buscar usuário por ID
- Deletar usuário

### 📖 Livros *(em desenvolvimento)*
- Cadastrar livros
- Listar livros
- Buscar livros por ID
- Deletar livros
- Associar livros a usuários

---

## 🗂 Estrutura do projeto

```bash
src/main/java/com/daniel/biblioteca
│
├── controller
├── model
├── repository
├── service
└── BibliotecaApplication
```

---

## ⚙️ Configuração do banco de dados

Crie um banco MySQL:

```sql
CREATE DATABASE biblioteca_db;
```

Configure o arquivo:

```properties
src/main/resources/application.properties
```

Com suas credenciais:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/biblioteca_db
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ▶️ Como executar o projeto

1. Clone o repositório

```bash
git clone <url-do-repositorio>
```

2. Abra no IntelliJ IDEA

3. Execute a classe:

```text
BibliotecaApplication
```

4. A API ficará disponível em:

```text
http://localhost:8080
```

---

## 📡 Endpoints atuais

### Listar usuários

```http
GET /usuarios
```

### Buscar usuário por ID

```http
GET /usuarios/{id}
```

### Cadastrar usuário

```http
POST /usuarios
```

Exemplo JSON:

```json
{
  "nome": "Daniel",
  "endereco": "Santo Andre",
  "telefone": "11999999999"
}
```

---

## 📚 Objetivo do projeto

Projeto acadêmico criado para praticar:

- API REST
- Spring Boot
- JPA/Hibernate
- Banco de dados relacional
- Estrutura em camadas
- CRUD completo

---

## 👨‍💻 Autor

Daniel Nery Oliveira

- GitHub: [danielnerys](https://github.com/danielnerys?utm_source=chatgpt.com)
- LinkedIn: [Daniel Nery Oliveira](https://www.linkedin.com/in/danielnerys/?utm_source=chatgpt.com)
