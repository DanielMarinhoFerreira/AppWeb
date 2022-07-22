const formulario = document.querySelector("form");

const sNome = document.querySelector(".usuario");
const sEmail = document.querySelector(".email");
const sSenha = document.querySelector(".senha")
const stel = document.querySelector(".telefone")

function dados(){

    dados = {
        nome: sNome.value,
        email: sEmail.value,
        senha: sSenha.value,
        tel: stel.value
    }

}

function limparDados(){
    
    sNome.value = null;
    sEmail.value = null;
    sSenha.value = null;
    stel.value = null;
}

function cadastrar (){

    fetch("http://localhost:8080/cadastrar",
    
        {
            headers:{
                'Accept':'aplication/json',
                'Content-Type': 'application/json'
            },
            method: "POST",
            body: JSON.stringify(dados())
    })
    .then(function(rest){(console.log(rest))})
    .catch(function(rest){(console.log(rest))})
};

formulario.addEventListener("submit", function(evevnto){
    evevnto.preventDefault();
    
    cadastrar();
    limparDados();
});