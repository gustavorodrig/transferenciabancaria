<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<html>
   <head>
      <title>Agendamentos</title>
   </head>
   <body>
      <h2>Agendamentos Cadastrados</h2>
      <c:if test="${not empty agendamentos}">
         <table BORDER="1">
            <tr>
               <th>Conta Origem</th>
               <th>Conta Destino</th>
               <th>Valor</th>
               <th>Taxa</th>
               <th>Tipo de Taxa</th>
               <th>Data Cadastro</th>
               <th>Data Agendada</th>
            </tr>
            <c:forEach var="listValue" items="${agendamentos}">
               <tr>
                  <td>${listValue.contaOrigem}</td>
                  <td>${listValue.contaDestino}</td>
                  <td>${listValue.valorTransferencia}</td>
                  <td>${listValue.taxa}</td>
                  <td>${listValue.tipoTaxa}</td>
                  <td>
                     <fmt:formatDate pattern="dd/MM/yyyy" value="${listValue.dataCadastro}" />
                  </td>
                  <td>
                     <fmt:formatDate pattern="dd/MM/yyyy" value="${listValue.dataAgendada}" />
                  </td>
               </tr>
            </c:forEach>
         </table>
      </c:if>
      <br>
      <b><a href="/transferenciabancaria/">Agendar nova transferência</a></b>
   </body>
</html>