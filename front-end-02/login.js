$(function() {
    $("#loginForm").on("submit", function(e) {
        e.preventDefault(); // STOP form from reloading the page!

        const email = $("#email").val().trim();
        const password = $("#password").val().trim();

        if (!email || !password) {
            alert("Both email and password are required!");
            return;
        }

        $.ajax({
            url: "http://localhost:8080/auth/login",
            method: "POST",
            contentType: "application/json",
            data: JSON.stringify({
                username: email,   // your backend expects "username" not "email"
                password: password
            }),
            success: function(response) {
                console.log("Login success:", response);
                localStorage.setItem("token", response.token);
                window.location.href = "./home.html"; // Redirect after login
            },
            error: function(xhr) {
                let msg = "Login failed! 😢 ";
                try {
                    const err = JSON.parse(xhr.responseText);
                    msg += err.message || xhr.statusText;
                } catch {
                    msg += xhr.statusText || "Unknown error";
                }
                alert(msg);
            }
        });
    });
});