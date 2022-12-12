<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome to the Quest Game</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1" charset="utf-8">
</head>
<body>
<h1 id="123" style="color:darkred;" class="text-center">Пролог</h1>
<div class="text-center" style="font-size:130%;">
    <p>Let me tell you about a great man in sports.</p>
    <p>This man was born in a poor family,</p>
    <p>his parents worked several jobs just to feed all the children.</p>
    <p>he went all the way from playing barefoot in a mash made from a bull's bladder to the World Championship finals!</p>
    <p>It remains for you to decide whether you want to try to repeat his path!</p>
</div>
<h2 style="color:darkred;" class="text-center">Знакомство с экипажем</h2>
<div class="text-center" style="font-size:120%;">
    <p>You are going to have a fun adventure in a long life!</p>
    <p>Great people will meet on your way</p>
    <p>and you have to make difficult decisions</p>
    <p>sometimes you have to think carefully about how they will affect your future</p>
    <p>Go ahead</p>
    <p>What is your name and what name will you have on your T-shirt?</p>
</div>
<form method="post" action="gameServlet" class="text-center" style="font-size:130%;">
    <label>Имя:
        <input type="hidden" name="nextQuestionId" value="1">
        <input type="text" name="name"><br />
    </label>
    <button class="btn btn-primary" type="submit">Submit</button>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>