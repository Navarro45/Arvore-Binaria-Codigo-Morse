Projeto Árvore Morse
Este projeto implementa uma árvore binária para a tradução de códigos Morse em caracteres alfabéticos. 
A árvore foi criada de forma que cada letra em código Morse seja armazenada em nós da árvore, onde cada 
nó pode ter subnós à esquerda ou à direita, representando os símbolos '.' (ponto) e '-' (traço), respectivamente.

Estrutura do Projeto
O projeto é composto por três classes principais:

1. No
Esta classe representa um nó da árvore binária. Cada nó tem:

informacao: o caractere armazenado.
esquerda: referência ao filho à esquerda, representando o símbolo '.'.
direita: referência ao filho à direita, representando o símbolo '-'.
Métodos:
getInformacao(): Retorna a informação contida no nó.
setInformacao(String informacao): Define a informação a ser armazenada no nó.
getEsquerda(): Retorna o nó à esquerda.
setEsquerda(No esquerda): Define o nó à esquerda.
getDireita(): Retorna o nó à direita.
setDireita(No direita): Define o nó à direita.
2. Arvore
Esta classe contém a lógica da árvore binária que organiza os códigos Morse e seus respectivos caracteres.

Métodos:
iniciaizar(): Inicializa a árvore criando o nó raiz.
inserir(String codigo, String caracter): Insere um caractere na árvore de acordo com o código Morse fornecido. 
O código Morse é dividido em símbolos e, para cada símbolo, a árvore navega para a esquerda (se for '.') ou 
para a direita (se for '-'). Caso a posição do nó não exista, um novo nó é criado.
buscar(String morse): Busca o caractere correspondente ao código Morse fornecido. 
O método navega pela árvore da mesma forma que na inserção, retornando o caractere armazenado no nó final.

3. Main
Esta classe contém o ponto de entrada do programa. Ela cria uma instância da árvore e oferece um menu de interação para o usuário.

Métodos:
main(String[] args): Inicializa a árvore e abre o menu.
menu(): Fornece ao usuário as opções de inserir um código Morse e seu caractere correspondente ou de buscar um caractere pelo código Morse.
Como Funciona
Inserção de Letras: O usuário pode inserir uma letra e o código Morse correspondente. A árvore irá criar um caminho de nós baseado nos símbolos '.' e '-' do código e armazenar o caractere no nó final.

Busca de Letras: O usuário pode buscar uma letra fornecendo o código Morse. A árvore irá navegar pelos nós baseando-se nos símbolos '.' e '-' e retornar o caractere armazenado no nó final.

Exemplo de Inserção e Busca:

Inserção de 'S' com o código Morse '...': o programa criará três nós à esquerda e armazenará 'S' no último nó.
Busca de '...': o programa navegará pelos nós à esquerda e retornará 'S'.
