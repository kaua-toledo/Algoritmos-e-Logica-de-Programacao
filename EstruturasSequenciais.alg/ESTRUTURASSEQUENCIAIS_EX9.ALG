Algoritmo "EstruturasSequenciais_ex9"
// Capítulo Estruturas Sequenciais "Duração"

Var

   duracao, horas, resto, minutos, segundos : inteiro

Inicio
   escreva("Digite a duração de tempo em segundos: ")
   leia(duracao)
   horas <- duracao \ 3600
   resto <- duracao % 3600
   minutos <- resto \ 60
   segundos <- resto % 60

   escreva("A duração foi de", horas:2, ":", minutos:2, ":", segundos:2)

Fimalgoritmo