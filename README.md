# Projeto Transfer�ncia Banc�ria ReservaFacil

### Sobre

Projeto para agendamento de transfer�ncias banc�rias que efetua o c�lculo de taxas de acordo com o tipo escolhido.

### Arquitetura do Projeto

A arquitetura usada tem como objetivo resolver as quest�es apontadas na documenta��o de forma simples, 
com um design limpo de baixo acomplamento, alta coes�o, facilitiando o entendimento e manuten��o.

Foi aplicado o design pattern "Strategy" que possibilitar� a altera��o e inclus�o de novos tipos de taxas sem alterar as funcionalidades que as utilizam. 
Pensando tamb�m em uma expans�o da aplica��o, novas funcionalidades podem implementar o c�lculo de taxa sem que haja uma manuten��o no c�digo existente.

O Framework Spring foi usado para uma melhor experi�ncia e facilidade no input de dados, valida��es e visualiza��es dos cadastros.

O armazenamento e manipula��o de datas foi feito atrav�s da biblioteca Joda-Time devido a sua simplicidade comparado a Date ou Calendar.

#Instala��o

Importar o projeto na IDE como Maven Project e subir no servidor de aplica��o Tomcat 7

O Build, controle de depend�ncias e execu��o dos testes unit�rios devem ser feitos atrav�s da ferramenta Maven

Contexto: /transferenciabancaria/

# Ferramentas Utilizadas:

### Linguagem de Programa��o
- Java 7

### Servidor de Aplica��o
- Apache Tomcat 7

### Gest�o de depend�ncias e Build
- Maven 3.1

### Framework
- Spring 4.1.4

### Teste Unit�rios
- Junit 4.11

### Ferramenta IDE
- Eclipse MARS

## Bibliotecas:
### Manipula��o de Datas
- Joda-Time 2.8.2
