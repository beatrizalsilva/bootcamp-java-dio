## Conta Bancária através do Terminal
Desafio proposto pelo mentor [Gleyson Sampaio](https://www.linkedin.com/in/glysns/).

## Desafio
Cenário:
- Crie o projeto `ContaBanco` que receberá dados via terminal contendo as características de uma conta bancária.

- Dentro do projeto, crie a classe `ContaTerminal.java` para realizar toda a codificação do programa.
- Declarando variáveis:

| Atributo  | Tipo     | Exemplo   
| --------- | ---------| ------- 
| Numero    | Inteiro  | 1021 
| Agencia   | Texto    | 067-8
| Nome Cliente | Texto    | MARIO ANDRADE
| Saldo | Decimal |237.48

- Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:

Programa: Por favor, digite o número da Agência !
Usuário: 1021 (depois ENTER para o próximo campo)


- Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:

Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque.
