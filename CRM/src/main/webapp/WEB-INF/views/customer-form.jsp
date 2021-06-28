<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
    <head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <title>CUstomer form</title>
    </head>
    <body>
    <div id="wrapper">
        <div id="header">
            <h2>CRM - CUstomer Relationship Manager</h2>

        </div>
    </div>

    <div class="container">
        <div id="content">
            <h2>Show Form</h2>
            <form:form action="saveCustomer" modelAttribute="customer" method="POST">

                <form:hidden path="id"/>
                <table>
                    <tr>
                        <td><form:label path="firstName">First Name</form:label></td><br>
                        <td><form:input path="firstName"/></td>
                    </tr>
                    <tr>
                         <td><form:label path="lastName">Last Name</form:label></td><br>
                         <td><form:input path="lastName"/></td>
                    </tr>
                    <tr>
                         <td><form:label path="email">Email Address</form:label></td><br>
                         <td><form:input path="email"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Submit" class="Save"/></td>
                    </tr>
                </table>
            </form:form>
            <div style="clear; both;">
            </div>

            <p>
                <a href="/Customer/list"> Back to list </a>
            </p>

        </div>
    </div>

    </body>
</html>
