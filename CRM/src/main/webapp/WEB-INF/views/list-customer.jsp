<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <title>Customer List</title>
    </head>
    <body>
    <div id="wrapper">
        <div id="header">
            <h2>CRM - CUstomer Relationship Manager</h2>
        </div>
    </div>

    <div class="container">
        <div id="content">
            <input type="button" value="Add Customer" onclick="window.location.href='showForm'; return false;"
                    class="add-button"/>
            <table>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Action </th>
                </tr>
                <c:forEach var="temp" items="${customers}">
                    <c:url var="updateLink" value="/Customer/showFormUpdate">
                        <c:param name="customerId" value="${temp.id}"/>
                    </c:url>

                    <c:url var="deleteLink" value="/Customer/delete">
                        <c:param name="customerId" value="${temp.id}"/>
                    </c:url>
                <tr>
                            <td>${temp.firstName}</td>
                            <td>${temp.lastName}</td>
                            <td>${temp.email}</td>
                            <td> <a href="${updateLink}">Update</a>
                            |
                            <a href="${deleteLink}" onclick="if(!confirm('Are you sure?'))">Delete</a></td>
                </tr>
                  </c:forEach>
            </table>
        </div>
    </div>

    </body>
</html>
