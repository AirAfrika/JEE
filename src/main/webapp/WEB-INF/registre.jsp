<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
  <title>Airafrika</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap" rel="stylesheet">

  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

  <link rel="stylesheet" href="../CSS/css/style.css">

</head>
<body class="img js-fullheight" style="background-image: url(../CSS/images/photo-1606768666853-403c90a981ad.avif);">
<section class="ftco-section">
  <div class="container">
    <div class="row justify-content-center">
      <div class="col-md-6 text-center mb-5">
        <h2 class="heading-section">Airafrika</h2>
      </div>
    </div>
    <div class="row justify-content-center">
      <div class="col-md-6 col-lg-4 ">
        <div class="login-wrap p-0">
          <h3 class="mb-4 text-center">Vous n'avez pas un compte? créer un maintenant!</h3>
          <h2>Vous avez un compte? <a href="">Connectez vous!</a></h2>
          <form action="Register" method="post" class="signin-form">
            <div class="form-group">
              <input name="prenom" type="text" style="width: 400px; height:40px;" class="form-control" placeholder="Email ou nom d'utilisateur" required>
            </div>
            <div class="form-group">
              <input name="nom" type="text" style="width: 400px; height:40px;" class="form-control" placeholder="Nom de famille" required>
            </div>
            <div class="form-group">
              <input name="email" type="text" style="width: 400px; height:40px;" class="form-control" placeholder="email" required>
            </div>
            <div class="form-group">
              <input name="telephone" style="width: 400px; height:40px;" type="tel" class="form-control" placeholder="telephone" required>
            </div>
            <div class="form-group">
              <input name="password" style="width: 400px; height:40px;" type="password" class="form-control" placeholder="Mot de passe" required>
            </div>
            <div class="form-group">
              <button type="submit" class="form-control btn btn-primary submit px-3">Inscription</button>
            </div>
          </form>

        </div>
      </div>
    </div>
  </div>
</section>

<script src="../CSS/js/jquery.min.js"></script>
<script src="../CSS/js/popper.js"></script>
<script src="../CSS/js/bootstrap.min.js"></script>
<script src="../CSS/js/main.js"></script>

</body>
</html>


