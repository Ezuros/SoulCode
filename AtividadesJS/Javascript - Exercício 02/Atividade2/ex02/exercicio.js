let texto = prompt(`Digite seu nome completo`)
let letras = texto.split('')

alert(`Texto em maiúsculo: ${texto.toUpperCase()}`)
alert(`Texto em minúsculo: ${texto.toLowerCase()}`) 

letras.forEach((letter) => {
    console.log(`${letter}<br>`) 
})








