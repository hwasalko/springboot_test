<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
    <title>비밀번호 변경화면</title>
    
    <!-- Bootstrap core CSS -->
	<link href="/vendor/bootstrap-4.3.1-dist/css/bootstrap.min.css" rel="stylesheet">
	
  </head>
  
  
  	<body>
  	
  		<div class="container">
  		
  			<div class="row">
  		
			    <form class="form-signin" action="/sc/change-password" method="post">
			    
			      <hr/>
				  
				  <h1 class="h3 mb-3 font-weight-normal">${sessionScope.user_name} 님의 비밀번호 변경화면입니다.</h1>
				  
				  <hr/>
				  
				  <label for="inputEmail" class="sr-only">Email address</label>
				  <span>${sessionScope.user_id}</span>
				  
				  <label for="inputPassword" class="sr-only">현재 password</label>
				  <input type="password" id="user_password" name="current_user_password" class="form-control" placeholder="Password" required>
				  
				  
				  <button class="btn btn-lg btn-primary btn-block" type="submit">변경하기</button>
				  
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
