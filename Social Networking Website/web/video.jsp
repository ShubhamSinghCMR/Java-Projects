<%-- 
    Document   : home
    Created on : Apr 4, 2014, 6:28:01 PM
    Author     : hyE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        
        String str1=(String)session.getAttribute("sob");
        if(str1==null)
            {
                    response.sendRedirect("index.jsp");
            }   
        else
            {
     %>
    <head>
       <link rel="stylesheet" type="text/css" href="hstyle.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>sNs.iN</title>
        
        <script>
        var x;    
        function loadit(str)
            {
                x= new XMLHttpRequest();
                x.open("GET",str,true);
                x.onreadystatechange=work;
                x.send(null);
            }
      function work()
            {
          if(x.readyState==4)
              document.getElementById('mydiv1').innerHTML=x.responseText;
          else
              document.getElementById('mydiv1').innerHTML="<img src='pics/load.gif'/>";
           }
          function log()
          {
              location="logout.jsp";
          }
         function hisfor()
         {
                Window.history.forward();
         }
         
         var y;    
        function find()
            { var val=document.getElementById('search').value;
                y= new XMLHttpRequest();
                y.open("GET","searchserv?val="+val,true);
                y.onreadystatechange=fod;
                y.send(null);
            }
      function fod()
            {
          if(y.readyState==4)
              document.getElementById('mydiv1').innerHTML=y.responseText;
          else
              document.getElementById('mydiv1').innerHTML="<img src='pics/load.gif'/>";
           }
        var z;    
        function help()
            { var val=document.getElementById('search').value;
                z= new XMLHttpRequest();
                z.open("GET","helpserv?val="+val,true);
                z.onreadystatechange=helpfun;
                z.send(null);
            }
      function helpfun()
            {
          if(z.readyState==4)
          {document.getElementById('helpdiv').innerHTML="";
              document.getElementById('helpdiv').innerHTML=z.responseText;
          }
          else
              document.getElementById('helpdiv').innerHTML="<img src='pics/load1.gif'/>";
           }
           function set()
           {
               location="home.jsp";
           }
         
         </script>
    </head>
    
    
    <body onload="loadit('users.jsp'),hisfor()">
        <table id="noop" width="1328" height="62" border="0">
          <tr>
              <td height="58" ><br><b><a onclick="set()">hOme</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a onclick="loadit('about.jsp')">abOuT</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a onclick="loadit('stuff.jsp')">stufF</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a onclick="log()">lOgOuT</a>
                                             </b>
            <img src="pics/line.jpg" width="1204" height="1"></td>
          </tr>
        </table>
        <table id="noop" width="1352" height="450" border="0">
          <tr>
            <td><div id="mydiv1">
              <FORM  ENCTYPE="multipart/form-data" ACTION="fileupload.jsp" METHOD=POST>
      		  To Change Profile Pic Upload New Image<br>
	        <input type="file" name="f1"><br><br>
	        <input type="submit">
	        </FORM>
            
            
            
            
            
            </div></td>
          </tr>
        </table>
        <table width="1355" id="noop1" height="52" border="0">
          <tr>
            <td>
                <form name="form1" method="post" action="">
              <input name="search" type="text" id="search" size="40" placeholder="                            Enter email" onkeyup="help()">
              
              <input type="button" name="searchbut" id="searchbut" value="     Search     " onclick="find()">
            <div id="helpdiv"></div>
                </form></td>
          </tr>
          <tr>
            <td>sNs.iN &copy; 2014</td>
          </tr>
        </table>
    </body>
        <%
            }
     %>
</html>
