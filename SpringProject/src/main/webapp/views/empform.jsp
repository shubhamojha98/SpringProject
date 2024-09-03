<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Add</title>
</head>
<body>
<fieldset>
<legend>Add Employee Data Here</legend>

<pre>
<form action="empdata" method="post" >

   <b style="color:blue">Enter  Name Here:</b>
   <input type="text" name="name" placeholder="Enter Name Here"  required/>
   
   <b style="color:blue">Enter Age Here:</b>
   <input type="text" name="age" placeholder="Enter Age Here"  required/>
   
      <b style="color:blue">Enter Post Here:</b>
   <input type="text" name="post" placeholder="Enter post Here"  required/>
   
   <b style="color:blue">Enter City Here:</b>
   <input type="text" name="city" placeholder="Enter city Here" required"/>
   
   <b style="color:blue">Enter salary Here:</b>
   <input type="text" name="salary" placeholder="Enter salary Here" required"/>
   
   <input type="submit" value="Login" style="background:blue; color:white"/>      
       
     
</form>
</pre>

</fieldset>
</body>
</html>