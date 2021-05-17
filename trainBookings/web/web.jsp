<%--
  Created by IntelliJ IDEA.
  User: Sithum
  Date: 2020-08-24
  Time: 12.43
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="model.train" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>


<table border="1" >
    <tr>
        <th>
            Time
        </th>
        <th>
            Train Name
        </th>
        <th>
            Depature
        </th>
        <th>
      Destination
        </th>
    </tr>

<%
    ArrayList<train> results = (ArrayList<train>)(request.getAttribute("results"));

    for (int i = 0; i < results.size(); i++)
    {
        out.print("<form action='showItem.jsp' method='post'>");
        out.print("<tr>");
        out.print("<td> <input name='flight_name' readonly value='" +  results.get(i).getTrainName() +  "'/></td>");
        out.print("<td> <input name='depart_city' readonly value='" +  results.get(i).getDepature() +  "'/></td>");
        out.print("<td> <input name='arrival_city' readonly value='" +  results.get(i).getDestination() +  "'/></td>");
       // out.print("<td> <input name='depart_date' readonly value='" +  results.get(i).getDepartureDate() +  "'/></td>");
        // out.print("<td> <input name='arrival_date' readonly value='" +  results.get(i).getArrivalDate() +  "'/></td>");
        out.print("<td> <input name='class_name' readonly value='" +  request.getParameter("class") +  "'/></td>");
        out.print("<td><input type='submit' class='btn btn-primary flex-row-reverse' value ='Select'></td>");
        out.print("</tr>");
        out.print("</form>");
    }
%>

</table>
</body>
</html>
