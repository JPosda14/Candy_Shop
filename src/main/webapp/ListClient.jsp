<%@ page import="com.example.candyshop.models.Client" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>List Clients</title>
</head>
<body>
<h1>
    ListClients
</h1>
<%
    List<Client> clientList = (List)request.getSession().getAttribute("clientLists");
    int cont=1;
    for(Client client : clientList)

%>
<p><b>User <%cont%></b></p>
<p Name<%UserName%>
<P Id <%ClietId


</body>
</html>