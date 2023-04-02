const express = require('express');
const bodyParser = require('body-parser');
const mysql = require('mysql2');

const app = express();
app.use(bodyParser.json()); // обробляє JSON запити
app.use(bodyParser.urlencoded({ extended: true }));
const serverName = process.env.NAME || 'Nodejs JWT Auth';
const PORT = process.env.PORT || 3000;

// Подключение библиотек для шифрования
jwt = require('jsonwebtoken')
const jwt_key ="1a2b3c4d"



// Маршрут который отдает нам ключ
app.post("/api/auth/login", (request, response) => {

    try {
        console.log(request.body);
        console.log(request.data);
        let user = request.body;
        let token = jwt.sign(
            user,
            jwt_key
        )
        response.status(200).json({
            "user" : user,
            "token": token,
            "message": "Welcome"
        })
    }catch (ex){
        console.log(ex);
    }

});


// Запустил сервер
app.listen(PORT, () => console.log("Server " + serverName + " running at port " + PORT));