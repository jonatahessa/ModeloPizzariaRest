function main() {
  document.querySelector("#pizzas-salgadas").addEventListener("click", abreCardapio);
}

function abreCardapio() {
  var dados = getArchive();
  for (var i = 0; i < dados.length; i++) {
    //Cria linha
    var linha = document.createElement("tr");

    //Cria célula
    var celulaCodigo = document.createElement("td");
    var textCodigo = document.createTextNode(dados[i].codigo);
    celulaCodigo.appendChild(textCodigo);

    linha.appendChild(celulaCodigo);

    var celulaNome = document.createElement("td");
    var textNome = document.createTextNode(dados[i].nome);
    celulaNome.appendChild(textNome);

    linha.appendChild(celulaNome);

    var celulaDescricao = document.createElement("td");
    var textDescricao = document.createTextNode(dados[i].descricao);
    celulaDescricao.appendChild(textDescricao);

    linha.appendChild(celulaDescricao);

    var celulaValor = document.createElement("td");
    var textValor = document.createTextNode(dados[i].valor);
    celulaValor.appendChild(textValor);

    linha.appendChild(celulaValor);

    document.getElementById("linhas-cardapio").appendChild(linha);
  }
}

function getArchive() {
  var xmlhttp = new XMLHttpRequest();
  var url = "http://localhost:8080/RestfulApp/webresources/produtos/listarTodos";

  xmlhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
        var myArr = JSON.parse(this.responseText);
        myFunction(myArr);
    }
};
  xmlhttp.open("GET", url, true);
  xmlhttp.send();
}

window.addEventListener("load", main);
