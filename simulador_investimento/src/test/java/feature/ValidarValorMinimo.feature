# language: pt

Funcionalidade: Realizar simula��o de investimento
Como um Associado
Eu gostaria de preencher o formul�rio de simula��o
Para ver a tabela de resultado com M�s e Valor.

Cen�rio: Deve exibir mensagem de valida��o para valor m�nimo.
Dado que quero informar um valor inferior a 20,00
Quando informo "<valoraplicar>"
E clico no campo "<valor_poupar>"
Ent�o visualizo a"<mensagem_validacao>". 