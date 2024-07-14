<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>User Form</title>
</head>
<body>
<h1>User Form</h1>
<s:form action="saveUser" method="post">
    <s:textfield name="user.firstName" label="First Name"/>
    <s:textfield name="user.lastName" label="Last Name"/>
    <s:submit value="Submit"/>
</s:form>
</body>
</html>
