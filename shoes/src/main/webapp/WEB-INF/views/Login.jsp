<%--
  Created by IntelliJ IDEA.
  User: tfska
  Date: 3/30/2023
  Time: 7:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Tài khoản cá nhân</title>
    <!-- Font Awesome -->
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link rel="stylesheet" href="/css/style.css">
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css">
</head>
<body>
<div class="acc">
    <div class="form-box">
        <div class="button-box">
            <div id="btn"></div>
            <button type="button" class="toggle-btn" onclick="login()">
                <a href="/login">
                    Log In
                </a>
            </button>
            <button type="button" class="toggle-btn"  onclick="register()">
                <a href="/register">
                    Register
                </a>
            </button>
        </div>
        <form id="login" action="${pageContext.request.contextPath}/login" method="post" class="input-group">
            <c:if test="${not empty error}">
                <div style="color: red">${error}</div>
            </c:if>
            <div class="input-field">
                <i class="far fa-user"></i>
                <input type="text" class="form-input" name="username" placeholder="User Id" minlength="2" maxlength="12" required>
            </div>
            <div class="input-field">
                <i class="fas fa-key"></i>
                <input type="password" class="form-input" id="pass" name="password" placeholder="Enter password"
                       pattern="^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$"
                       title="Vui lòng bao gồm ít nhất 1 ký tự viết hoa, 1 ký tự viết thường và 1 số."
                       required>
                <div class="eye">
                    <i class="far fa-eye"></i>
                </div>
            </div>

            <input type="checkbox" class="check-box"><span>Remember Password</span>
            <button type="submit" class="submit-btn">Log in</button>
        </form>
<%--        <form id="register" action="/login" method="post" class="input-group">--%>
<%--            <div class="input-field">--%>
<%--                <i class="far fa-user"></i>--%>
<%--                <input type="text" class="form-input" name="username" placeholder="User Id" minlength="2" maxlength="12"--%>
<%--                       required>--%>
<%--            </div>--%>
<%--            &lt;%&ndash;                     <div id="userIdMessage"></div>&ndash;%&gt;--%>

<%--            <div class="input-field">--%>
<%--                <i class="fas fa-key"></i>--%>
<%--                <input type="password" class="form-input" id="pass1" name="" placeholder="Enter password"--%>
<%--                       pattern="^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$"--%>
<%--                       title="Vui lòng bao gồm ít nhất 1 ký tự viết hoa, 1 ký tự viết thường và 1 số." required>--%>
<%--                <div class="eye">--%>
<%--                    <i class="far fa-eye"></i>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--            <div class="input-field">--%>
<%--                <i class="fas fa-key"></i>--%>
<%--                <input type="password" class="form-input" id="pass2" name="password" placeholder="Re-enter password"--%>
<%--                       pattern="^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$"--%>
<%--                       title="Vui lòng bao gồm ít nhất 1 ký tự viết hoa, 1 ký tự viết thường và 1 số." required>--%>
<%--                <div class="eye">--%>
<%--                    <i class="far fa-eye"></i>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--            <div class="input-field">--%>
<%--                <i class="fas fa-envelope"></i>--%>
<%--                <input type="email" class="form-input" name="confirm" placeholder="Enter email" required>--%>
<%--            </div>--%>
<%--            <div class="input-field">--%>
<%--                <i class="fas fa-phone"></i>--%>
<%--                <input type="tel" class="form-input" name="phone" placeholder="Enter phone"--%>
<%--                       pattern="[0-9]{3}[0-9]{3}[0-9]{4}" required>--%>
<%--            </div>--%>
<%--            <input type="checkbox" class="check-box"><span>I agree to the terms & conditions</span></tr>--%>

<%--            <button type="submit" class="submit-btn">Register</button>--%>

<%--        </form>--%>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script>
    var x = document.getElementById("login");
    var y = document.getElementById("register");
    var z = document.getElementById("btn");

    function register() {
        x.style.left = "-400px";
        y.style.left = "50px";
        z.style.left = "110px";
    }

    function login() {
        x.style.left = "50px";
        y.style.left = "450px";
        z.style.left = "0";
    }
</script>
<script>
    $(document).ready(function () {
        $('.eye').click(function () {
            $(this).toggleClass('open');
            $(this).children('i').toggleClass('fa-eye-slash fa-eye');
            if ($(this).hasClass('open')) {
                $(this).prev().attr('type', 'text');
            } else {
                $(this).prev().attr('type', 'password');
            }
        });
    });
</script>
<%--<script type="text/javascript">--%>
<%--    var req;--%>
<%--    var target;--%>
<%--    var isIE;--%>

<%--    function initRequest(url) {--%>
<%--        if (window.XMLHttpRequest) {--%>
<%--            req = new XMLHttpRequest();--%>
<%--        } else if (window.ActiveXObject) {--%>
<%--            isIE = true;--%>
<%--            req = new ActiveXObject("Microsoft.XMLHTTP");--%>
<%--        }--%>
<%--    }--%>

<%--    function validateUserId() {--%>
<%--        if (!target) target = document.getElementById("userid");--%>
<%--        var url = "validate?id=" + escape(target.value);--%>

<%--        // Invoke initRequest(url) to create XMLHttpRequest object--%>
<%--        initRequest(url);--%>
<%--        req.onreadystatechange = processRequest;--%>
<%--        req.open("GET", url, true);--%>
<%--        req.send(null);--%>
<%--    }--%>

<%--    function processRequest() {--%>
<%--        if (req.readyState == 4) {--%>
<%--            if (req.status == 200) {--%>

<%--                var message = req.responseXML.getElementsByTagName("valid")[0].childNodes[0].nodeValue;--%>

<%--                setMessageUsingDOM(message);--%>

<%--                var submitBtn = document.getElementById("submit_btn");--%>
<%--                if (message == "false") {--%>
<%--                    submitBtn.disabled = true;--%>
<%--                } else {--%>
<%--                    submitBtn.disabled = false;--%>
<%--                }--%>
<%--            }--%>
<%--        }--%>
<%--    }--%>

<%--    function setMessageUsingInline(message) {--%>
<%--        mdiv = document.getElementById("userIdMessage");--%>
<%--        if (message == "false") {--%>
<%--            mdiv.innerHTML = "<div style=\"color:red\">Invalid User Id</div>";--%>
<%--        } else {--%>
<%--            mdiv.innerHTML = "<div style=\"color:green\">Valid User Id</div>";--%>
<%--        }--%>
<%--    }--%>

<%--    function setMessageUsingDOM(message) {--%>
<%--        var userMessageElement = document.getElementById("userIdMessage");--%>
<%--        var messageText;--%>
<%--        if (message == "false") {--%>
<%--            userMessageElement.style.color = "red";--%>
<%--            messageText = "Invalid User Id";--%>
<%--        } else {--%>
<%--            userMessageElement.style.color = "green";--%>
<%--            messageText = "Valid User Id";--%>
<%--        }--%>
<%--        var messageBody = document.createTextNode(messageText);--%>


<%--        userMessageElement.innerHTML = messageText;--%>

<%--    }--%>

<%--    function disableSubmitBtn() {--%>
<%--        var submitBtn = document.getElementById("submit_btn");--%>
<%--        submitBtn.disabled = true;--%>
<%--    }--%>
<%--</script>--%>
</body>
</html>
