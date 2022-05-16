Projeto para Teste de Estágio da FIREBEE

Resumo:

Assim que a API é executada, é executado junto um runner que roda o Arquivo.json para carregar todos os dados no banco de dados MySQL
Também pode ser adicionado mais dados utilizando a url localhost:8080/api/usuario/salvar com o POST do aplicativo Postman.

Para checar se a aplicação está realmente aberta, fiz uma página de status, que pode ser acessada pela url abaixo.
http://localhost:8080/api/status

Para fazer consultas individuais, deve-se utilizar o link abaixo, onde o "ID" é um inteiro, altera conforme usuario pretendido.
http://localhost:8080/api/usuario/"id"

Para fazer uma consulta geral, utilize a url abaixo que a api retornara os dados ordenados, lembrando que se for feita no navegador os dados ficaram juntos, e se for feita utilizanddo o GET pelo Postman, ficaram mais organizadas e faceis de entender.
http://localhost:8080/api/usuario/

