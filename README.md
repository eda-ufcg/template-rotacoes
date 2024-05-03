# Identificação

* Nome: 
* Email (@ccc): 
* Matrícula: 

# Roteiro: Rotações

## O template

> Não altere o arquivo build.gradle

> O código java estará (ou você terá que colocar) no diretório **/src/main/java/**

> Os testes estarão (ou você terá que incluir) no diretório **/src/test/java/**

> Seu código é tão bom quanto seus testes. Eu vou executar meus testes quando você submeter.

> Não mude nenhuma assinatura de método, nome de classe ou localização dos arquivos. Mas você pode/deve criar outros métodos e classes, desde que passem nos testes.

> Compilando: `gradle compileJava` na raiz do projeto.

> Executando os testes: `gradle test` na raiz do projeto.

## A tarefa. 

Você deve implementar os métodos rotateLeft e rotateRight da classe Rotator. Analise bem os testes. Desenhe a árvore que eu monto antes para entender a rotação a ser feita. Lembre-se das verificações de null e de parent. 


Importante: eu tomei algumas decisões controversas de design para facilitar a vida de vocês (e a minha, por tabela). A principal delas é que o método search expõe os nós. Idealmente não queremos dar esse controle para usuários da classe BST. Contudo, o objetivo dessa etapa da disciplina é que vocês entendam rotações. Não se preocupem, não seremos presos pela gangue do design pattern.



## Entregando o lab

> Passo 0. Modifique o arquivo README. Coloque seu nome, email @ccc e matrícula nos lugares indicados. Se você não fizer isso, não considero que sua prova foi assinada e, portanto, não vou corrigir. Não mude a formatação da linha. Apenas inclua seus dados.

> Passo 1. Certifique-se **NO TERMINAL** de que sua solução compila e passa nos testes. Isso deve ser feito com os comandos do gradle (compileJava e test).

> Passo 2. Certifique-se de que você respondeu as perguntas teóricas onde foi indicado aqui no README.

> Passo 3. Submeta as suas modificações para o repositório

  * `git pull`
  * `git commit -m "entregando o lab de algoritmos recursivos"`
  * `git push origin main`
