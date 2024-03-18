Sistema de Cadastro de Usuários
Este projeto consiste em um sistema web para cadastro, edição e exclusão de usuários. 
Foi desenvolvido utilizando as seguintes tecnologias: Java, JPA (Java Persistence API), JSF (JavaServer Faces), NetBeans e PrimeFaces.

Funcionalidades
Cadastro de Usuários
Ao acessar a página, é possível visualizar um formulário de cadastro contendo campos para inserção de dados pessoais e de endereço de um usuário. 
O formulário possui os seguintes campos:

ID (gerado automaticamente)
Nome
Sexo
Data de Nascimento
Estado
Cidade
Logradouro
Número
CEP
Para adicionar um novo usuário, preencha os campos desejados e clique no botão "Salvar". Ao fazer isso, os dados informados serão persistidos no banco de dados, 
e a tabela de usuários será atualizada automaticamente.

Edição de Usuários
Na tabela de dados, é possível visualizar todos os usuários cadastrados, juntamente com opções para editar e excluir cada entrada. 
Ao clicar no botão "Editar" correspondente a um usuário na tabela, os dados desse usuário serão carregados de volta para o formulário de cadastro, 
permitindo que sejam modificados. Após as edições desejadas, basta clicar novamente no botão "Salvar" para atualizar as informações do usuário no banco de dados.

Exclusão de Usuários
Ao clicar no botão "Excluir" de um usuário na tabela, o registro correspondente será removido do sistema, excluindo-o definitivamente do banco de dados.

Tecnologias Utilizadas
Java
A linguagem de programação principal utilizada para desenvolver a lógica do sistema.

JPA (Java Persistence API)
Uma API do Java que permite o mapeamento objeto-relacional (ORM) e o gerenciamento de entidades em um banco de dados relacional.

JSF (JavaServer Faces)
Um framework Java para construção de interfaces de usuário baseadas em componentes. Facilita a criação de aplicativos web baseados em Java.

NetBeans
Uma IDE (Integrated Development Environment) de código aberto para desenvolvimento de aplicativos em Java. Oferece ferramentas para escrever, compilar, 
depurar e implantar aplicativos Java.

PrimeFaces
Uma biblioteca de componentes de interface de usuário para JSF. Oferece uma ampla gama de componentes interativos e responsivos, 
facilitando a criação de interfaces de usuário modernas e agradáveis.

Como Executar
Certifique-se de ter o Java e o servidor de aplicativos configurados em sua máquina.
Clone ou baixe o repositório do projeto.
Abra o projeto no NetBeans.
Configure o servidor de aplicativos em que deseja implantar o projeto.
Execute o projeto no NetBeans.
Acesse o sistema através do navegador utilizando o endereço fornecido pelo servidor de aplicativos.