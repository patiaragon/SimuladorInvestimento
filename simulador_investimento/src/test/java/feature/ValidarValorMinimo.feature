# language: pt

Funcionalidade: Realizar simulação de investimento
Como um Associado
Eu gostaria de preencher o formulário de simulação
Para ver a tabela de resultado com Mês e Valor.

Cenário: Deve exibir mensagem de validação para valor mínimo.
Dado que quero informar um valor inferior a 20,00
Quando informo "<valoraplicar>"
E clico no campo "<valor_poupar>"
Então visualizo a"<mensagem_validacao>". 