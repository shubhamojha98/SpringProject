<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<legend>Login Here</legend>

<pre>
<form action="userdata" method="post" >

   <b style="color:blue">Enter  Name Here:</b>
   <input type="text" name="name" placeholder="Enter Name Here"  required/>
   
   <b style="color:blue">Enter Age Here:</b>
   <input type="text" name="Age" placeholder="Enter Age Here"  required/>
   
      <b style="color:blue">Enter Course Here:</b>
   <input type="text" name="course" placeholder="Enter course Here"  required/>
   
   <b style="color:blue">Enter Address Here:</b>
   <input type="text" name="address" placeholder="Enter address Here" required"/>
   
   <input type="submit" value="Login" style="background:blue; color:white"/>      
       
     
</form>
</pre>

</fieldset>
</body>
</html>