# Plataforma Colaborativa de Gerenciamento de Requisitos

## Descrição do Projeto

A Plataforma Colaborativa de Gerenciamento de Requisitos é uma aplicação desenvolvida em Java utilizando Programação Orientada a Objetos (POO) e banco de dados MySQL.

O sistema permite que usuários autenticados realizem o gerenciamento de projetos, requisitos, documentos, comentários e histórico de alterações, auxiliando equipes de desenvolvimento no controle dos requisitos de software durante todo o ciclo do projeto.

Este projeto foi desenvolvido como atividade da disciplina Desenvolvimento da Solução de Software (AV5), aplicando conceitos de Arquitetura de Software, Persistência de Dados, Programação Orientada a Objetos e Controle de Versão.

---

# Tecnologias Utilizadas

- Java JDK 26
- MySQL Server 8+
- MySQL Connector/J 9.6.0
- JDBC
- Git
- GitHub
- Visual Studio Code

---

# Arquitetura do Projeto

O projeto foi desenvolvido seguindo uma arquitetura em camadas.

## Camada Model

Responsável pelas entidades do sistema.

Classes:

- Pessoa
- Usuario
- Projeto
- Requisito
- Documento
- Comentario
- HistoricoAlteracao

---

## Camada DAO

Responsável pela comunicação com o banco de dados.

Classes:

- Conexao
- UsuarioDAO
- ProjetoDAO
- RequisitoDAO
- DocumentoDAO
- ComentarioDAO
- HistoricoDAO

---

## Camada Service

Responsável pelas regras de negócio.

Classes:

- LoginService
- ProjetoService
- RequisitoService
- DocumentoService
- ComentarioService
- HistoricoService

---

## Camada Controller

Responsável pela comunicação entre a interface e os serviços.

Classes:

- LoginController
- ProjetoController
- RequisitoController
- DocumentoController
- ComentarioController

---

# Estrutura de Pastas

```text
PlataformaRequisitos2/

├── src/
│
├── controller/
│   ├── LoginController.java
│   ├── ProjetoController.java
│   ├── RequisitoController.java
│   ├── DocumentoController.java
│   └── ComentarioController.java
│
├── dao/
│   ├── Conexao.java
│   ├── UsuarioDAO.java
│   ├── ProjetoDAO.java
│   ├── RequisitoDAO.java
│   ├── DocumentoDAO.java
│   ├── ComentarioDAO.java
│   └── HistoricoDAO.java
│
├── model/
│   ├── Pessoa.java
│   ├── Usuario.java
│   ├── Projeto.java
│   ├── Requisito.java
│   ├── Documento.java
│   ├── Comentario.java
│   └── HistoricoAlteracao.java
│
├── service/
│   ├── LoginService.java
│   ├── ProjetoService.java
│   ├── RequisitoService.java
│   ├── DocumentoService.java
│   ├── ComentarioService.java
│   └── HistoricoService.java
│
├── lib/
│   └── mysql-connector-j-9.6.0.jar
│
└── Main.java
```

---

# Configuração do Banco de Dados

## 1 - Criar o Banco

Execute o script abaixo no MySQL:

```sql
CREATE DATABASE plataforma_requisitos;
USE plataforma_requisitos;
```

---

## 2 - Criar as Tabelas

### Usuários

```sql
CREATE TABLE usuarios(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100),
    login VARCHAR(50),
    senha VARCHAR(100)
);
```

### Projetos

```sql
CREATE TABLE projetos(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    descricao TEXT
);
```

### Requisitos

```sql
CREATE TABLE requisitos(
    id INT AUTO_INCREMENT PRIMARY KEY,
    descricao TEXT,
    status VARCHAR(30)
);
```

### Documentos

```sql
CREATE TABLE documentos(
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100),
    conteudo TEXT
);
```

### Comentários

```sql
CREATE TABLE comentarios(
    id INT AUTO_INCREMENT PRIMARY KEY,
    texto TEXT
);
```

### Histórico de Alterações

```sql
CREATE TABLE historico_alteracoes(
    id INT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(255),
    data_alteracao DATETIME
);
```

---

# Usuário de Teste

Execute:

```sql
INSERT INTO usuarios(
nome,
email,
login,
senha
)
VALUES(
'Administrador',
'admin@email.com',
'admin',
'admin123'
);
```

---

# Configuração da Conexão

## IMPORTANTE

Antes de executar o projeto, configure o usuário e a senha do seu MySQL.

Abra o arquivo:

```text
src/dao/Conexao.java
```

Localize:

```java
private static final String URL =
    "jdbc:mysql://localhost:3306/plataforma_requisitos";

private static final String USER =
    "root";

private static final String PASSWORD =
    "SUA_SENHA";
```

Altere para os dados do seu ambiente.

Exemplo:

```java
private static final String URL =
    "jdbc:mysql://localhost:3306/plataforma_requisitos";

private static final String USER =
    "root";

private static final String PASSWORD =
    "123456";
```

Caso utilize outro usuário ou outra porta, ajuste os valores conforme sua instalação.

---

# Configuração do Driver JDBC

O projeto utiliza o MySQL Connector/J.

Baixe o driver:

mysql-connector-j-9.6.0.jar

e coloque dentro da pasta:

```text
lib/
```

---

## VS Code

Após adicionar o arquivo:

```text
mysql-connector-j-9.6.0.jar
```

Adicione-o às bibliotecas referenciadas.

### Passos

1. Abrir o projeto no VS Code
2. Expandir JAVA PROJECTS
3. Expandir Referenced Libraries
4. Clicar em +

Selecionar:

```text
lib/mysql-connector-j-9.6.0.jar
```

---

# Como Executar o Projeto

## Compilar

No terminal:

```bash
javac -cp "lib/mysql-connector-j-9.6.0.jar" -d bin src/model/*.java src/dao/*.java src/service/*.java src/controller/*.java src/Main.java
```

---

## Executar

Windows:

```bash
java -cp "bin;lib/mysql-connector-j-9.6.0.jar" Main
```

Linux:

```bash
java -cp "bin:lib/mysql-connector-j-9.6.0.jar" Main
```

---

# Credenciais de Teste

Usuário:

```text
admin
```

Senha:

```text
admin123
```

---

# Funcionalidades Implementadas

✅ Autenticação de Usuários

✅ Cadastro de Projetos

✅ Listagem de Projetos

✅ Atualização de Projetos

✅ Exclusão de Projetos

✅ Cadastro de Requisitos

✅ Listagem de Requisitos

✅ Atualização de Requisitos

✅ Exclusão de Requisitos

✅ Cadastro de Documentos

✅ Listagem de Documentos

✅ Atualização de Documentos

✅ Exclusão de Documentos

✅ Cadastro de Comentários

✅ Histórico de Alterações

✅ Integração com Banco de Dados MySQL

---

# Conceitos de POO Aplicados

## Encapsulamento

Os atributos das classes foram declarados privados ou protegidos, sendo acessados por métodos getters e setters.

---

## Herança

A classe Usuario herda da classe abstrata Pessoa.

```java
public class Usuario extends Pessoa
```

---

## Abstração

A classe Pessoa foi criada como abstrata, representando características comuns aos usuários.

```java
public abstract class Pessoa
```

---

## Polimorfismo

Aplicado através da sobrescrita do método toString() nas entidades do sistema.

```java
@Override
public String toString()
```

---

# Estratégia de Versionamento

O projeto utilizou Git e GitHub como ferramentas de controle de versão. Durante o desenvolvimento foram realizados commits frequentes para registrar a evolução do software e garantir a rastreabilidade das alterações. Cada funcionalidade implementada foi desenvolvida de forma incremental, permitindo identificar facilmente mudanças realizadas em diferentes etapas do projeto. O uso do versionamento contribuiu para evitar perda de código, facilitar correções de erros e manter um histórico organizado do desenvolvimento. Além disso, o GitHub permitiu o compartilhamento do projeto entre os integrantes da equipe e serviu como repositório central para armazenamento do código-fonte.

---

# Integrantes

- Guilherme Antônio Pereira Dornelles

---

# Professor

Prof. MSc. Hugo Menezes Barra

---

# Disciplina

Desenvolvimento da Solução de Software

---

# Avaliação

AV5 – Desenvolvimento da Solução de Software

---

# Licença

Projeto acadêmico desenvolvido exclusivamente para fins educacionais.
