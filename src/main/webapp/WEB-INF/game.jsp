<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1" charset="utf-8">
    <title>Quest Game</title>
</head>
<body span style="background-color:lightgray;">
<div>
    <h2 class="text-center" style="color:darkred;">${questionText}</h2>
    </br>

    <form class="text-center" method="get" style="font-size:110%;">
        <fieldset class="text-center" >
            <c:forEach items="${answers}" var="answer">
                <div class="text-center" class="form-group">
                    <label class="text-center" class="col-md-4 control-label" for="${answers}"></label>
                    <div class="text-center" class="col-md-4">
                        <div class="text-center" class="radio" style="font-size:120%;">
                           <label for="answer">
                                <input type="radio" name="nextQuestionId" id="${answer.getNextQuestionId()}" value="${answer.getNextQuestionId()}" checked="checked">
                                    ${answer.getAnswerText()}
                            </label>
                        </div>
                    </div>
                </div>
            </c:forEach>
            </br>

            <button type="submit" class="btn btn-info" style="font-size:120%;" class="text-center" >
                <c:if test = "${isLast == true}">Start Again</c:if>
                <c:if test = "${isLast == false}">Send</c:if>
            </button>
        </fieldset>
    </form>
</div>

<div>
    <p>Player's Name: "${name}"</div></p>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>





