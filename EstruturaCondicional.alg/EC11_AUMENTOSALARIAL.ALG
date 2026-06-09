Algoritmo "EC11_AumentoSalarial"
// Capítulo Estrutura Condicional: Problema "Aumento Salarial"

Var

   salario, novoSalario, aumento : real
   porcentagem: inteiro

Inicio

   escreva("Digite o salario da pessoa: ")
   leia(salario)

   se salario <= 1000 entao
      porcentagem <- 20
   senao
      se salario <= 3000 entao
         porcentagem <- 15
      senao
         se salario <= 8000 entao
            porcentagem <- 10
         senao
            porcentagem <- 5
         fimse
      fimse
   fimse

   aumento <- (salario * porcentagem) / 100
   novoSalario <- salario + aumento
   
   escreval("NOVO SALÁRIO: R$", novoSalario:5:2)
   escreval("PORCENTAGEM: ", porcentagem, "%")
   escreval("AUMENTO: R$", aumento:5:2)


Fimalgoritmo