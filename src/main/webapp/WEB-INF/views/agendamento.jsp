<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<html>
   <head>
      <title>Agendar Transferência Bancária</title>
   </head>
   <body>
      <h2>Agendar Transferência Bancária</h2>
      <form:form method="POST" action="adiciona">
         <table>
            <tr>
               <td>
                  <form:label path="contaOrigem">Conta Origem</form:label>
               </td>
               <td>
                   <input type="text" class="form-control" name="contaOrigem" placeholder="XXXXX-XX" required/>
               </td>
            </tr>
            <tr>
               <td>
                  <form:label path="contaDestino">Conta Destino</form:label>
               </td>
               <td>
                  <input type="text" class="form-control" name="contaDestino" placeholder="XXXXX-XX" required/>
               </td>
            </tr>
            <tr>
               <td>
                  <form:label path="valorTransferencia">Valor:</form:label>
               </td>
               <td>
                  <form:input type="number" step="any" min="0" path="valorTransferencia" required='required'/>
               </td>
           </tr>
           <tr>
               <td>
                  <form:label path="dataAgendada">Data do agendamento:</form:label>
               </td>
               <td>
                 <input type="text" class="form-control" name="dataAgendada" placeholder="DD/MM/AAAA" required/>
               </td>
            </tr>
            <tr>
            	<td>
                  <form:label path="tipoTaxa">Tipo de Taxa:</form:label>
               </td>
               <td>
               <form:radiobuttons path="tipoTaxa" items="${tipoDeTaxas}" required='required'/>
               </td>
            </tr>
            <tr>
               <td colspan="2"> <input type="submit" value="Agendar"/> </td>
            </tr>
         </table>
      </form:form>
      <b><a href="lista">Lista de agendamentos cadastrados</a></b>
   </body>
</html>
