let binario = prompt(`Digite um número binário`)
let numeros = binario.split('')
let soma = 0

numeros.reverse() //INVERTI, POIS A FORMULA PARA TRANSFORMAR EM DECIMAL COMEÇA DE TRÁS PRA FRENTE



let todosOsNumerosEstaoCorretos = numeros.every(numeros => {
    return numeros < 2
  })
  alert(`Todos os números digitados foram 0 ou 1: ${todosOsNumerosEstaoCorretos}`)

  if(todosOsNumerosEstaoCorretos == true){
    for(let i = 0; i < numeros.length; i++){
        soma += (2**i) * numeros[i]
    }
    alert(`O numero digitado equivale a ${soma} na base 10`)
  }
  else{
      alert('Digite apenas 1 ou 0')
  }


  //2º Forma
  
/* for(let i = 0; i < numeros.length; i++){
    soma += (2**i) * numeros[i]
} */
/* alert(`O numero digitado equivale a ${soma} na base 10`)
 */









