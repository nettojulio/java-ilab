function recuperarDados() {
  // acessar a API
  fetch("http://localhost:8080/produtos")
    .then((res) => res.json())
    .then((listaProdutos) => preenchePagina(listaProdutos));
}

function preenchePagina(listaProdutos) {
  let htmlDinamico = ``;
  for (i = 0; i < listaProdutos.length; i++) {
    let produto = listaProdutos[i];
    htmlDinamico += `<div class="col-6 col-sm-6 col-md-3 col-lg-2 col-xl-2 col-xxl-2">
       <div class="card" style="width:100%">
           <img src="${produto.linkFoto}" class="card-img-top" alt="...">
           <div class="card-body">
               <h5 class="card-title">${produto.nome}</h5>
               <p class="card-text">${produto.descricao}</p>
               <p class="card-text">Departamento: ${produto.dpto.nome}</p>
               <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">Saiba Mais</button>
           </div>
       </div>
   </div>`;
  }
  document.getElementById("linhaComProdutos").innerHTML = htmlDinamico;
}
