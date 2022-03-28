<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>DangNhap_Assignment_NguyenPH17778</title>
  <link rel="stylesheet" href="/Assignment_Java4/css/bootstrap.min.css">
  <style>
    body{
      width: 600px;
      height: 500px;
      background-image: url("https://caodang.fpt.edu.vn/wp-content/uploads/FPT_Polytechnic_banner_xet_tuyen_online1.png") ;
 
    }

    .container{
      padding: 70px;
      margin-left: 470px;
      margin-top: 100px;
     
      
    }
    .row{
      padding: 10px;
      
    }

 
  </style>
</head>
<body>
  <div class="container">
      <div class="card card-default bg-light">
        <div class="row" >
          <form action="AdminServlet" method="post">
          
            <div class="row ">
              <label for="" class="">Email</label>
              <div class="col-12">
                <input class="form-control" type="email" name="email" id="email">
              </div>
              
              <label for="" class="">Password</label>
              <div class="col-12">            
                    <input  class="form-control" placeholder="" type="password" name="password" id="password">
              </div>            
            </div>
            
            <div class="button">  
              <div class="row">
                <div class="col-2"> <button class="btn border border-3 rounded-start text-secondary" >
                  Login</button></div>
                <div class="col-3"><button class="btn border border-3 rounded-start text-secondary" type="button" onclick="quay_lai_trang_truoc()" data-bs-toggle="modal" data-bs-target="#modal-delete_confirm_1">
                  Cancel</button>
                
                </div>
                 <label class="text-center mt-2"> Bạn chưa có tài khoản</label>
                <div class="text-center" style="padding-left: 3px;"> <a href="DangKy.html">Đăng ký</a></div>
              </div>
  
            </div>
          </form>
        </div>
       
      </div>
   
  </div>

  <script>
    function quay_lai_trang_truoc(){
        history.back();
    }
</script>
  <script src="/Assignment_Java4/js/bootstrap.min.js"></script>
  <script src="/Assignment_Java4/js/popper.min.js"></script>
  <script src="/Assignment_Java4/js/jquery.min.js"></script>
  
</body>
</html>