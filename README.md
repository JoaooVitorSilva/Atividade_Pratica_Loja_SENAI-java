# Atividade Prática - Sistema de Loja em Java

Projeto Java desenvolvido como atividade prática para o curso do **UniSENAI**.  
O objetivo é criar um sistema simples de gerenciamento de produtos de uma loja, praticando conceitos de **POO (Programação Orientada a Objetos)** em Java.

---

## 📚 Estrutura do Projeto

- **Classe `Produto`**  
  Representa os itens da loja, contendo:
  - `nome` (String)
  - `preco` (double)
  - `quantidadeEstoque` (int)

  Métodos principais:
  - Construtor vazio
  - Construtor com parâmetros
  - Getters e Setters
  - `exibirInformacoes()`
  - `vender(int quantidade)`
  - `reporEstoque(int quantidade)`

- **Classe `LojaApp`**  
  Classe principal responsável por:
  - Instanciar os produtos
  - Armazenar em uma lista (`ArrayList`)
  - Exibir informações
  - Realizar vendas
  - Repor o estoque
  - Mostrar as informações atualizadas

---

## ✅ Funcionalidades Implementadas

1. **Cadastro de Produtos**
   - Criação de produtos com nome, preço e quantidade em estoque.

2. **Exibição de Informações**
   - Exibe no console todos os dados de cada produto.

3. **Venda**
   - Reduz o estoque caso exista quantidade suficiente.
   - Exibe mensagem de erro em caso de estoque insuficiente.

4. **Reposição**
   - Aumenta a quantidade em estoque de um produto.

5. **Listagem Atualizada**
   - Mostra novamente as informações após operações de venda e reposição.

---

## 🎯 Objetivo da Atividade

1. Praticar a criação de classes e objetos.
2. Utilizar **construtores** (vazio e parametrizado).
3. Aplicar **encapsulamento** com atributos privados e métodos `get`/`set`.
4. Trabalhar com **listas dinâmicas (`ArrayList`)** para armazenamento de produtos.
5. Implementar métodos para manipulação dos dados (exibir, vender, repor).
6. Praticar lógica de negócio com condições (`if/else`) no controle de estoque.
