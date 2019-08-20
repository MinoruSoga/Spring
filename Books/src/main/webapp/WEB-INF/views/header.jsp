<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<head>
<meta charset="UTF-8">
   <!-- BMD -->
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Material+Icons">
<link rel="stylesheet" href="https://unpkg.com/bootstrap-material-design@4.1.1/dist/css/bootstrap-material-design.min.css" integrity="sha384-wXznGJNEXNG1NFsbm0ugrLFMQPWswR3lds2VeinahP8N0zJw9VWSopbjv2x7WCvX" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://unpkg.com/popper.js@1.12.6/dist/umd/popper.js" integrity="sha384-fA23ZRQ3G/J53mElWqVJEGJzU0sTs+SvzG8fXVWP+kJQ1lwFAOkcUOysnlKJC33U" crossorigin="anonymous"></script>
<script src="https://unpkg.com/bootstrap-material-design@4.1.1/dist/js/bootstrap-material-design.js" integrity="sha384-CauSuKpEqAFajSpkdjv3z9t8E7RlpJ1UP0lKM/+NdtSarroVKu069AlsRPKkFBz9" crossorigin="anonymous"></script>
<link rel="stylesheet" href="../css/main.css">
</head>


<nav id="navbar-example2" class="navbar navbar-light bg-white">
    <a class="navbar-brand" href="./">Books</a>
    <ul class="nav nav-pills">
        <li class="nav-item">
			<form class="form-inline mt-3">
			    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
			    <button class="btn btn-outline-success my-sm-0" type="submit">Search</button>
			</form>
			<form:form modelAttribute="SearchBook">
				名前<form:input path="b_name"/>
					<form:errors path="b_name" cssStyle="color:red"/>
				<input type="submit" value="送信"> 
			</form:form>
            
        </li>
        
        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">UserName</a>
            <div class="dropdown-menu">
                <!-- <span id="view_clock"></span> -->
                <a class="dropdown-item" id="view_clock1">one</a>
                <a class="dropdown-item" id="view_clock2">two</a>
                <div role="separator" class="dropdown-divider"></div>
                <a class="dropdown-item" href="./logout">Logout</a>
            </div>
        </li>
    </ul>
</nav>
    <script type="text/javascript">
timerID = setInterval('clock()',500); //0.5秒毎にclock()を実行

function clock() {
	document.getElementById("view_clock1").innerHTML = getNow1();
	document.getElementById("view_clock2").innerHTML = getNow2();
}

function getNow1() {
	var now = new Date();
	var year = now.getFullYear();
	var mon = now.getMonth()+1; //１を足すこと
	var day = now.getDate();
	var hour = now.getHours();
	var min = now.getMinutes();
	var sec = now.getSeconds();
	//出力用
	var s = year + "/" + mon + "/" + day; 
	return s;
}
function getNow2() {
	var now = new Date();
	var year = now.getFullYear();
	var mon = now.getMonth()+1; //１を足すこと
	var day = now.getDate();
	var hour = now.getHours();
	var min = now.getMinutes();
	var sec = now.getSeconds();
	//出力用
	var m = hour + ":" + min + ":" + sec; 
	return m;
}
</script>
