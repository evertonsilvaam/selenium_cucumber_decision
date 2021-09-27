# language: pt

Funcionalidade: Cadastro de Usuário

  Cenario: Preenchimento de Dados do Veiculo
    Dado o usuario acessa o menu dados do veiculo
    Quando o usuario preenche todos os dados do veiculo
    Entao o menu Enter Ensurance Data deve ser exibido

  Cenario: Preenchimento de Informacoes do cliente
    Dado o usuario acessa o menu de informações do cliente
    Quando o usuario preenche todos os dados do cliente
    Entao o menu Enter Product Data deve ser exibido

  Cenario: Preenchimento de Dados do Produto
    Dado o usuario acessa o menu dados do produto
    Quando o usuario preenche todos os dados do produto
    Entao o menu Select Price Option deve ser exibido

  Cenario: Selecao do plano
    Dado o usuario acessa o menu Opcoes de Preco
    Quando o usuario seleciona o preco
    Entao o menu Send Quote deve ser exibido

  Cenario: Preenchimento de Dados do Contato
    Dado o usuario acessa o menu Enviar Contacao
    Quando o usuario preenche todos os dados de contato do cliente
    Entao uma mensagem de e-mail enviado com sucesso
