<html>
    <head>
        <title> Página JSP - Alura</title>
    </head>
    <body>        
        <h1>
            <%
				String nomeEmpresa = (String)request.getAttribute("empresa");
				
                out.println("Empresa " + nomeEmpresa + " cadastrada com sucesso!");
            %> 
        </h1>
    </body>
</html>