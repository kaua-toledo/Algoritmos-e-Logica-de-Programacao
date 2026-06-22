Algoritmo "EstruturasSequenciais_ex06"
// Capítulo Estruturas Sequenciais "Pagamento"

Var

   nome : caractere
   valorHora, cargaHoraria, pagamento : real

Inicio

   escreva("Nome: ")
   leia(nome)

   escreva("Valor por hora: ")
   leia(valorHora)

   escreva("Horas trabalhadas: ")
   leia(cargaHoraria)
   
   pagamento <- valorHora * cargaHoraria
   escreva("O pagamento de ", nome, " deve ser", pagamento:8:2)

Fimalgoritmo