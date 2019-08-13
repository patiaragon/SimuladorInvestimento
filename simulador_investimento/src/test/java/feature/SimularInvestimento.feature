# language: pt
 
Funcionalidade: Realizar simulação de investimento
Como um Associado
Eu gostaria de preencher o formulário de simulação
Para ver a tabela de resultado com Mês e Valor.

Cenário: Deve realizar simulação de investimento
Dado que desejo realizar uma simulação de investimento
Quando informo "<valor_aplicar>" 
E informo "<valor_poupar>"
E informo "<tempo>" meses
Então visualizo os dados da simulação de investimento desejada.

