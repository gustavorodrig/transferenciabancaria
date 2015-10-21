# Projeto Transferência Bancária ReservaFacil

### Sobre

Projeto para agendamento de transferências bancárias que efetua o cálculo de taxas de acordo com o tipo escolhido.

### Arquitetura do Projeto

A arquitetura usada tem como objetivo resolver as questões apontadas na documentação de forma simples, 
com um design limpo de baixo acomplamento, alta coesão, facilitiando o entendimento e manutenção.

Foi aplicado o design pattern "Strategy" que possibilitará a alteração e inclusão de novos tipos de taxas sem alterar as funcionalidades que as utilizam. 
Pensando também em uma expansão da aplicação, novas funcionalidades podem implementar o cálculo de taxa sem que haja uma manutenção no código existente.

O Framework Spring foi usado para uma melhor experiência e facilidade no input de dados, validações e visualizações dos cadastros.

O armazenamento e manipulação de datas foi feito através da biblioteca Joda-Time devido a sua simplicidade comparado a Date ou Calendar.

#Instalação

Importar o projeto na IDE como Maven Project e subir no servidor de aplicação Tomcat 7

O Build, controle de dependências e execução dos testes unitários devem ser feitos através da ferramenta Maven

Contexto: /transferenciabancaria/

# Ferramentas Utilizadas:

### Linguagem de Programação
- Java 7

### Servidor de Aplicação
- Apache Tomcat 7

### Gestão de dependências e Build
- Maven 3.1

### Framework
- Spring 4.1.4

### Teste Unitários
- Junit 4.11

### Ferramenta IDE
- Eclipse MARS

## Bibliotecas:
### Manipulação de Datas
- Joda-Time 2.8.2
