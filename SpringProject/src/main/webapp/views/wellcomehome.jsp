<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Wellcome to Page</h1>

  <form action="searchemployee" method="post">
      <input type="text"  name="id" placeholder="Enter Employee Id">
      <input type="submit" value="search">
  </form>
  

  <a href="getemployee">show all Employee</a><br>
  <a href="empform">Add Employee</a><br><br><br><br>

<a href="home">Home</a><br>
<a href="contactus">contact us</a><br>
<a href="userform">User Form</a><br>
<a href="userdata?user=Alok">Go To User With RequestParam</a><br>
<a href="user/Alok">Go To User With path Variable</a>

${msg}
</body>
</html>