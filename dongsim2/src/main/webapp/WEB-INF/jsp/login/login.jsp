<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
    <title>로그인</title>
    
    <!-- Bootstrap core CSS -->
	<link href="/vendor/bootstrap-4.3.1-dist/css/bootstrap.min.css" rel="stylesheet">
	
  </head>
  
  
  	<body>
  	
  		<div class="container">
  		
  			<div class="row">
  		
			    <form class="form-signin" action="/login" method="post">
			    
			      <hr/>
				  
				  <h1 class="h3 mb-3 font-weight-normal">ID , PW를 입력하세요.</h1>
				  
				  <hr/>
				  
				  <label for="inputEmail" class="sr-only">Email address</label>
				  <input type="email" id="user_id" name="user_id" class="form-control" placeholder="Email address" required autofocus>
				  
				  <label for="inputPassword" class="sr-only">Password</label>
				  <input type="password" id="user_password" name="user_password" class="form-control" placeholder="Password" required>
				  
				  <div class="checkbox mb-3">
				    <label>
				      <input type="checkbox" value="remember-me"> Remember me
				    </label>
				  </div>
				  <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>
				  
				</form>
			
			</div>
		
		</div>
		
		
			
			
		<!-- Optional JavaScript -->
	    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
	    <script src="/vendor/jquery/jquery-3.4.1.min.js"></script>
	    <script src="/vendor/proper/popper.min.js"></script>
		<script src="/vendor/bootstrap-4.3.1-dist/js/bootstrap.min.js"></script>
	
	</body>

</html>
