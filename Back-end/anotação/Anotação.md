# ☕ Spring Boot - Anotações

Este documento reúne conceitos essenciais sobre **Spring Boot**, um dos frameworks Java mais usados para desenvolvimento de aplicações web e APIs.

---

## 📌 O que é o Spring Boot?
- Framework baseado no **Spring Framework**.
- Facilita o desenvolvimento de aplicações **Java modernas**.
- Tem foco em **produtividade** e **configuração mínima**.
- Muito usado para **APIs REST**, **microserviços** e **aplicações web**.

---

## ⚙️ Como o Spring Boot Funciona?
1. **Inversão de Controle (IoC) e Injeção de Dependências (DI)**  
   - O Spring gerencia objetos da aplicação (beans).  
   - Em vez de o programador instanciar, o **container Spring** cuida disso.  

   ```java
   @Service
   public class ProdutoService {
       private final ProdutoRepository repository;

       // Injeção de dependência via construtor
       public ProdutoService(ProdutoRepository repository) {
           this.repository = repository;
       }
   }
Configuração Automática (Auto Configuration)

O Spring Boot detecta dependências no projeto (ex.: Spring Web, JPA).

Configura automaticamente o ambiente (ex.: Tomcat embutido, DataSource, etc.).

Servidor Embutido

Não é necessário instalar servidor (Tomcat, Jetty, Undertow já vêm prontos).

Basta rodar o main da aplicação.

java
Copiar código
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
Convenção sobre Configuração

Usa configurações padrão inteligentes.

Arquivo central: application.properties ou application.yml.

properties
Copiar código
spring.datasource.url=jdbc:mysql://localhost:3306/meubanco
spring.datasource.username=root
spring.datasource.password=1234
🏗️ Estrutura Básica de um Projeto
Controller → recebe requisições HTTP.

Service → contém a lógica de negócio.

Repository → comunicação com o banco de dados.

Model/Entity → classes que representam tabelas.

Exemplo de API REST simples:

java
Copiar código
@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    
    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Produto> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return service.salvar(produto);
    }
}
📊 Principais Dependências
spring-boot-starter-web → cria APIs REST com Tomcat embutido.

spring-boot-starter-data-jpa → integração com bancos de dados.

spring-boot-starter-security → autenticação e autorização.

spring-boot-starter-test → testes com JUnit e Mockito.

🚀 Como Criar um Projeto Spring Boot?
Usar o Spring Initializr: https://start.spring.io

Escolher dependências, versão do Java e gerar projeto.

Importar no IDE (IntelliJ, Eclipse, VS Code).

Rodar a aplicação com mvn spring-boot:run ou pelo método main.

📚 Vantagens
Produtividade alta (menos configuração manual).

Comunidade grande e muita documentação.

Escalável (ótimo para microserviços).

Integração com bancos SQL e NoSQL.

Deploy facilitado (JAR executável com servidor embutido).

🧠 Dicas de Estudo
Comece com projetos simples (CRUD REST API).

Entenda bem as camadas (Controller, Service, Repository).

Explore Spring Data JPA para banco de dados.

Depois avance para Spring Security e Microserviços.

Use sempre o Postman/Insomnia para testar APIs.