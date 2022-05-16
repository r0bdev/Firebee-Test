Projeto para Teste de Estágio da FIREBEE

Resumo Para Teste:

Assim que a API é executada, é executado junto um runner que roda o Arquivo.json para carregar todos os dados no banco de dados MySQL
Também pode ser adicionado mais dados utilizando a url localhost:8080/api/usuario/salvar com o POST do aplicativo Postman.

Para checar se a aplicação está realmente aberta, fiz uma página de status, que pode ser acessada pela url abaixo.
http://localhost:8080/api/status

Para fazer consultas individuais, deve-se utilizar o link abaixo, onde o "ID" é um inteiro, altera conforme usuario pretendido.
http://localhost:8080/api/usuario/"id"

Para fazer uma consulta geral, utilize a url abaixo que a api retornara os dados ordenados, lembrando que se for feita no navegador os dados ficaram juntos, e se for feita utilizanddo o GET pelo Postman, ficaram mais organizadas e faceis de entender.
http://localhost:8080/api/usuario/

-----------

Observações e Considerações:

*Foi utilizado para realizar esse projeto, o Java com a ferramenta SpringBoot, primeiramente tentei no C++ mas perecebi que a linguagem acadêmica está um pouco ultrapassada para trabalhar com API's. Foi meu primeiro contato com SpringBoot e percebi que é uma ferramenta moderna que garante maior independencia da API e muito eficiente para desenvolvimento. 
*A plataforma utilizada para desenvolvimento foi o Intelij, oferece bastante facilidade e suporte.
*O Banco de dados utilizado foi o MySQL, observe que no arquivo application.properties na pasta resources, está o script de acesso ao BD de acordo com a minha máquina, o meu usuario e senha, para realizar essa aplicação em outra máquina é necessário adaptação
*Para visualizar esse banco de dados pelo mysql utilizei o DBVisualizer
*Utilizei o postman para testar a aplicação, realizar GET e POST, mas não é necessário, pois pode ser feito o get pelo navegador normal e também já deixei na aplicação uma inserção de arquivo .json que realiza a função do POST.

Foi o meu primeiro contato com arquivos JSON, percebi que são muito faceis de serem escritos, e também entendi o porque de sua utilização, também é muito fácil e rápida seu processamento para envio de dados.

Essa Api de Teste de Estágio é simples, envolvendo apenas alguns métodos REST, não sendo então, tão perfeita como uma API RestFul, mas pode ser melhorada se solicitado. Mas podemos dizer que ela já garante a separação de Cliente-server. O Stateless, a devolução correta das informações necessárias. Layered System, que deixa a interface do usuário simplificada, ele não precisa saber do que ocorre por trás e como isso ocorre. 
