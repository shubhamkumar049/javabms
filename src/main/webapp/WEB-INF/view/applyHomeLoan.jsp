<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Apply Home Loan</title>
</head>
<body>
<p><strong>Please Fill Home Loan Detail: </strong></p>

    <form:form method = "POST" action = "/BankManagementSystem/applyeduloan">
         <table>
            <tr>
               <td><form:label path = "accNo">Account Number</form:label></td>
               <td><form:input path = "accNo" /></td>
            </tr>
            <tr>
               <td><form:label path = "loanAmount">Loan Amount</form:label></td>
               <td><form:input path = "loanAmount" /></td>
            </tr>
            <tr>
               <td><form:label path = "loanApplyDt">Loan Apply Date</form:label></td>
               <td><form:input path = "loanApplyDt" /></td>
            </tr>
            <tr>
               <td><form:label path = "duration">Duration</form:label></td>
               <td><form:input path = "duration" /></td>
            </tr>
            <tr>
               <td><form:label path = "courseFee">Course Fee</form:label></td>
               <td><form:input path = "courseFee" /></td>
            </tr>
            <tr>
               <td><form:label path = "courseName">Course Name</form:label></td>
               <td><form:input path = "courseName" /></td>
            </tr>
            <tr>
               <td><form:label path = "fatherName">Father Name</form:label></td>
               <td><form:input path = "fatherName" /></td>
            </tr>
            <tr>
               <td><form:label path = "idCardNumber">Id Number</form:label></td>
               <td><form:input path = "idCardNumber" /></td>
            </tr>
            <tr>
               <td><form:label path = "annualIncome">Annual Income</form:label></td>
               <td><form:input path = "annualIncome" /></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
               <td colspan = "2">
                  <input type = "reset" value = "Reset"/>
               </td>
            </tr>
         </table>  
 </form:form>
 
 <div><a href="welcome.jsp">HOME PAGE</a></div>
</body>
</html>