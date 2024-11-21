## Getting Started

## Projeto: Sistema de Empréstimo de Livros
Este projeto implementa um sistema de empréstimo de livros com cálculo de frete, utilizando padrões de projeto e classes em Java.

# Descrição
O sistema permite:

- Registrar empréstimos de livros.
- Calcular frete com base nas dimensões e peso dos livros.
- Integrar com diferentes empresas de frete (A, B, C, e D).
- Simular e testar funcionalidades relacionadas a empréstimos e cálculo de frete.

# Arquitetura do Projeto
O projeto utiliza o padrão de projeto Strategy para integrar diferentes empresas de frete e permite fácil extensão para novas integrações.


# Como Configurar e Executar

- Instale o Java JDK 17+ (ou versão compatível).
- Configure a variável de ambiente JAVA_HOME no sistema.
- Use o terminal ou um IDE como VSCode para rodar o projeto.


1. Compilar o Projeto
Navegue até o diretório do projeto no terminal:

```
cd book-java
```


2. Compile as classes do projeto:

```
javac -d out src/*.java
```


3. Executar o Projeto

Execute a classe de teste com o método main:

```
java -cp out TesteFrete
```


O terminal exibirá os resultados do teste, como o valor do frete calculado.


3. Limpar os Arquivos Compilados

Para limpar os arquivos .class gerados, execute:

```
rm -rf out/*
```

# Tecnologias Utilizadas

- Java 17: Linguagem principal do projeto.
- Padrão Strategy: Para integrar diferentes empresas de frete.
- VSCode: IDE recomendada para desenvolvimento e execução.