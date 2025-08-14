# Busca Linear

## Conceito
- Percorre todos os elementos de uma lista/vetor até encontrar o valor desejado.
- Não precisa que os dados estejam ordenados.

## Como funciona
1. Começa do primeiro elemento.
2. Compara cada elemento com o valor procurado.
3. Para quando encontrar ou chegar ao fim da lista.

## Complexidade
- Melhor caso: O(1) → elemento está na primeira posição.
- Pior caso: O(n) → elemento está na última posição ou não existe.

## Vantagens
- Simples de implementar.
- Funciona para qualquer tipo de lista.

## Desvantagens
- Ineficiente para listas grandes.

## Exemplo (Python)
```python
def busca_linear(lista, valor):
    for i in range(len(lista)):
        if lista[i] == valor:
            return i
    return -1

print(busca_linear([10, 20, 30, 40], 30))  # 2

---

## 📂 **05_Algoritmos/Busca/Busca_Binaria/anotacoes.md**
```md
# Busca Binária

## Conceito
- Procura por um elemento dividindo repetidamente a lista ao meio.
- **Necessita que a lista esteja ordenada**.

## Como funciona
1. Define início e fim da lista.
2. Calcula o índice do meio.
3. Se o valor do meio for o procurado → retorna.
4. Se o valor procurado for menor → busca na metade esquerda.
5. Se for maior → busca na metade direita.
6. Repete até encontrar ou não restarem elementos.

## Complexidade
- Melhor caso: O(1) → valor encontrado de primeira.
- Pior caso: O(log n) → reduz pela metade a cada passo.

## Vantagens
- Muito mais rápida que a busca linear para listas grandes.

## Desvantagens
- Requer lista ordenada.

## Exemplo (Python)
```python
def busca_binaria(lista, valor):
    inicio, fim = 0, len(lista) - 1
    while inicio <= fim:
        meio = (inicio + fim) // 2
        if lista[meio] == valor:
            return meio
        elif lista[meio] < valor:
            inicio = meio + 1
        else:
            fim = meio - 1
    return -1

print(busca_binaria([10, 20, 30, 40, 50], 30))  # 2
