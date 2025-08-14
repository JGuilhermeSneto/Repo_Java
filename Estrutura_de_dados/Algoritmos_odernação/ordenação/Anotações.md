# Bubble Sort

## Conceito
- Compara elementos adjacentes e troca se necessário.
- Passa várias vezes até ordenar.

## Complexidade
- Melhor caso: O(n).
- Pior caso: O(n²).

## Desvantagens
- Ineficiente para listas grandes.



# Insertion Sort

## Conceito
- Constrói a lista ordenada um elemento por vez.
- Insere cada novo elemento na posição correta entre os já ordenados.

## Como funciona
1. Considera o primeiro elemento como já ordenado.
2. Pega o próximo elemento e o compara com os anteriores.
3. Move os maiores para a direita e insere o novo elemento no lugar correto.
4. Repete até o final da lista.

## Complexidade
- Melhor caso: O(n) (lista já ordenada).
- Pior caso: O(n²) (lista em ordem inversa).

## Vantagens
- Simples e eficiente para listas pequenas.
- Estável (mantém a ordem de elementos iguais).

## Exemplo (Python)
```python
def insertion_sort(lista):
    for i in range(1, len(lista)):
        chave = lista[i]
        j = i - 1
        while j >= 0 and lista[j] > chave:
            lista[j + 1] = lista[j]
            j -= 1
        lista[j + 1] = chave
    return lista

print(insertion_sort([5, 2, 9, 1, 5, 6]))



---

## 📂 **05_Algoritmos/Ordenacao/Selection_Sort/anotacoes.md**
```md
# Selection Sort

## Conceito
- Encontra o menor elemento da lista e o coloca na primeira posição.
- Repete o processo para as posições seguintes até ordenar.

## Como funciona
1. Percorre a lista para encontrar o menor elemento.
2. Troca-o com o primeiro elemento não ordenado.
3. Avança o ponto de ordenação e repete até o final.

## Complexidade
- Melhor caso: O(n²)
- Pior caso: O(n²)
- Não é eficiente para listas grandes.

## Vantagens
- Simples de implementar.
- Poucas trocas comparado ao Bubble Sort.

## Exemplo (Python)
```python
def selection_sort(lista):
    for i in range(len(lista)):
        min_index = i
        for j in range(i + 1, len(lista)):
            if lista[j] < lista[min_index]:
                min_index = j
        lista[i], lista[min_index] = lista[min_index], lista[i]
    return lista

print(selection_sort([64, 25, 12, 22, 11]))





---

## 📂 **05_Algoritmos/Ordenacao/Merge_Sort/anotacoes.md**
```md
# Merge Sort

## Conceito
- Algoritmo de ordenação baseado na técnica "Dividir e Conquistar".
- Divide a lista ao meio, ordena cada metade e depois combina.

## Como funciona
1. Divide a lista em duas metades.
2. Ordena cada metade recursivamente.
3. Combina as duas metades ordenadas.

## Complexidade
- Melhor caso: O(n log n)
- Pior caso: O(n log n)
- Estável.

## Vantagens
- Muito eficiente para listas grandes.
- Estável.

## Desvantagens
- Requer memória extra proporcional ao tamanho da lista.

## Exemplo (Python)
```python
def merge_sort(lista):
    if len(lista) > 1:
        meio = len(lista) // 2
        esquerda = lista[:meio]
        direita = lista[meio:]

        merge_sort(esquerda)
        merge_sort(direita)

        i = j = k = 0

        while i < len(esquerda) and j < len(direita):
            if esquerda[i] < direita[j]:
                lista[k] = esquerda[i]
                i += 1
            else:
                lista[k] = direita[j]
                j += 1
            k += 1

        while i < len(esquerda):
            lista[k] = esquerda[i]
            i += 1
            k += 1

        while j < len(direita):
            lista[k] = direita[j]
            j += 1
            k += 1

    return lista

print(merge_sort([38, 27, 43, 3, 9, 82, 10]))



---

## 📂 **05_Algoritmos/Ordenacao/Quick_Sort/anotacoes.md**
```md
# Quick Sort

## Conceito
- Algoritmo de ordenação rápido baseado em "Dividir e Conquistar".
- Escolhe um elemento como pivô e reorganiza a lista para que todos os menores fiquem antes e os maiores depois.

## Como funciona
1. Escolhe um pivô.
2. Particiona a lista em dois grupos: menores e maiores que o pivô.
3. Aplica o Quick Sort recursivamente a cada grupo.

## Complexidade
- Melhor caso: O(n log n)
- Pior caso: O(n²) (pivô ruim, como lista já ordenada e pivô sendo primeiro/último).
- Geralmente: O(n log n)

## Vantagens
- Muito rápido na prática.
- Não precisa de memória extra significativa.

## Desvantagens
- Pior caso pode ser ruim se pivô não for bem escolhido.

## Exemplo (Python)
```python
def quick_sort(lista):
    if len(lista) <= 1:
        return lista
    else:
        pivo = lista[len(lista) // 2]
        esquerda = [x for x in lista if x < pivo]
        meio = [x for x in lista if x == pivo]
        direita = [x for x in lista if x > pivo]
        return quick_sort(esquerda) + meio + quick_sort(direita)

print(quick_sort([10, 7, 8, 9, 1, 5]))
