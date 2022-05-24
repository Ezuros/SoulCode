
let quant = prompt('Quantos números você deseja digitar?')
let arr = [quant]
let soma = 0
let média = 0


for (let i = 0; i < quant; i++) {
    arr[i] = parseFloat(prompt(`Digite o ${i + 1}º número `))
    soma += arr[i]

    alert(`${arr[i]} elevado ao quadrado = ${arr[i] ** 2}`)
    alert(`Raiz quadrada de ${arr[i]} = ${(arr[i] ** (1 / 2)).toFixed(2)}`)
    alert(`Raiz cúbica de ${arr[i]} = ${(arr[i] ** (1 / 3)).toFixed(2)}`)
}

média = soma / quant

alert(`A soma dos números é: ${soma}`)
alert(`A média dos números: ${média.toFixed(2)}`)






