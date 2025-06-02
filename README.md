Teste de Usuário - Seminário TDS 1/2025
Este projeto é um exemplo prático desenvolvido para o seminário da disciplina de TDS 1/2025. Ele demonstra a criação e execução de testes unitários em Java utilizando o framework JUnit e o gerenciador de dependências Maven.

🧪 Objetivo
O principal objetivo deste projeto é ilustrar como estruturar e executar testes unitários em uma aplicação Java, promovendo boas práticas de desenvolvimento e garantindo a qualidade do código.

📁 Estrutura do Projeto
css
Copiar
Editar
teste-usuario/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── exemplo/
│   │               └── UserService.java
│   └── test/
│       └── java/
│           └── com/
│               └── exemplo/
│                   └── UserServiceTest.java
├── pom.xml
⚙️ Tecnologias Utilizadas
Java 8: Linguagem de programação utilizada no desenvolvimento.

Maven: Ferramenta de automação de compilação e gerenciamento de dependências.

JUnit 5: Framework para a criação e execução de testes unitários.

🚀 Como Executar os Testes
Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/AndrielsonLTeza/TesteUsuarioTDS.git
Navegue até o diretório do projeto:

bash
Copiar
Editar
cd TesteUsuarioTDS/teste-usuario
Execute os testes com Maven:

bash
Copiar
Editar
mvn test
Os resultados dos testes serão exibidos no console. Relatórios detalhados podem ser encontrados no diretório target/surefire-reports.

⚠️ Avisos Durante a Execução
Durante a execução dos testes, alguns avisos podem ser exibidos no console, como:

Uso de métodos restritos: Avisos relacionados ao uso de métodos internos do Java que podem ser descontinuados em versões futuras.

Depreciação de opções de compilação: Recomenda-se substituir as opções -source e -target por --release para garantir compatibilidade com versões futuras do Java.

Esses avisos não impedem a execução dos testes, mas é importante estar atento para futuras atualizações.
