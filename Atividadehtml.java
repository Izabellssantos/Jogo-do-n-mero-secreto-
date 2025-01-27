//1___ h1 COM A MENSAGEM 'hORA DO DESAFIO'
let titulo = document.querySelector ('h1');
titulo.innerHTML = 'Hora do desafio';
function verificarBotão () {
    console.log ('O botão foi clicado');
}
//Mensagem no HTML
<button onclick="verificarBotão()" class="button">Console</button>

//2___ Função 'Eu amo JS' - Console botão 'Alerta'
function botãoAlerta () {
    alert ('Eu amo JS');
}
//Mensagem no HTML
<button onclick="botãoAlerta()" class="button">Alert</button>


//3___Função para ativar mensagem prompt ''Nome da cidade'', com alerta - Estive em {cidade} e lembrei de você.
function exibirPrompt() {
    let nomeDaCidade = prompt('Digite o nome de uma cidade do Brasil que você já viajou e te trouxe boas memórias:')
    alert(`Estive em ${nomeDaCidade} e lembrei de você`);
}

//4___
function somandoDoisNumeros() {
    let primeiroNumero = parseInt(prompt('Digite o primeiro número'));
    let segundoNumero = parseInt(prompt('Digite o segundo número'));
    let resultado = primeiroNumero + segundoNumero;
    alert(`${primeiroNumero} + ${segundoNumero} = ${resultado}`)
}
// No HTML
<button onclick="somandoDoisNumeros()" class="button">Soma</button>