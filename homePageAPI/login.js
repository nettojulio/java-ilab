function enviarDados(){
    let txtLogin = document.getElementById("txtLogin").value;
    let txtSenha = document.getElementById("txtSenha").value;

    console.log("voce digitou = "+txtLogin+"/"+txtSenha);

    let corpo = {
        email: txtLogin,
        username: txtLogin,
        senha: txtSenha
    }

    let cabecalho = {
        method : "POST",
        body : JSON.stringify(corpo),
        headers : {
            "content-type":"application/json"
        }        
    }

    console.log(corpo);
    console.log(cabecalho)

    fetch("http://localhost:8080/login", cabecalho)
        .then(res => res.json())
        .then(token  => {
            alert("Login realizado com sucesso");
            localStorage.setItem("ECM_Tk", token.token)
            window.location = "home.html";
        })
        .catch(err => alert("Impossivel autenticar!"));
}