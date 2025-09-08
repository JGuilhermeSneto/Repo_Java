# 📝 Anotações sobre Estrutura de Dados

Este documento reúne conceitos fundamentais de **Estrutura de Dados** para estudo e consulta rápida.

---

## 📌 O que são Estruturas de Dados?
- Conjunto de técnicas e formas de **organizar e armazenar dados** na memória do computador.
- Influenciam na **eficiência** de programas (tempo de execução e uso de memória).

---

## ⚙️ Tipos de Estruturas de Dados

### 1. Estruturas Lineares
Organizam dados em **sequência**.
- **Vetores/Arrays**
  - Coleção de elementos do mesmo tipo.
  - Acesso direto por índice.
  - Tamanho fixo.
- **Listas**
  - **Lista Simplesmente Encadeada**: cada nó aponta para o próximo.
  - **Lista Duplamente Encadeada**: cada nó aponta para o próximo e o anterior.
  - **Lista Circular**: último nó aponta para o primeiro.
- **Pilhas (Stack)**
  - Estrutura **LIFO** (Last In, First Out).
  - Operações: `push` (inserir), `pop` (remover).
- **Filas (Queue)**
  - Estrutura **FIFO** (First In, First Out).
  - Operações: `enqueue` (inserir), `dequeue` (remover).
  - Variações: Fila Circular, Fila de Prioridade.

---

### 2. Estruturas Não Lineares
Permitem **relações complexas** entre os elementos.
- **Árvores**
  - Conjunto de nós ligados hierarquicamente.
  - **Árvore Binária**: cada nó tem até 2 filhos.
  - **Árvore de Busca Binária (BST)**: nós à esquerda menores, à direita maiores.
  - **Árvore Balanceada (AVL, Red-Black)**: mantém equilíbrio para melhor desempenho.
- **Grafos**
  - Conjunto de **vértices (nós)** e **arestas (ligações)**.
  - Podem ser direcionados, não-direcionados, ponderados ou não.
  - Usados em redes, mapas, conexões sociais, etc.

---

## 📊 Complexidade de Algoritmos
- **O(1)**: constante (ex.: acessar elemento em array).
- **O(log n)**: logarítmica (ex.: busca binária).
- **O(n)**: linear (ex.: percorrer lista).
- **O(n log n)**: eficiente (ex.: QuickSort, MergeSort).
- **O(n²), O(2^n), O(n!)**: algoritmos custosos.

---

## 🔑 Operações Básicas
- Inserção
- Remoção
- Busca
- Percurso/Iteração
- Ordenação

---

## 📚 Aplicações Reais
- **Pilhas** → desfazer/refazer (Ctrl+Z), navegador.
- **Filas** → gerenciamento de processos em SO, impressão.
- **Listas** → playlists, cadastros dinâmicos.
- **Árvores** → sistemas de arquivos, banco de dados.
- **Grafos** → GPS, redes sociais, internet.

---

## 🧠 Dicas de Estudo
1. Entender **quando usar** cada estrutura.
2. Praticar implementações em **Java, Python ou C**.
3. Resolver exercícios de **inserção, remoção e busca**.
4. Comparar **eficiência** (tempo/memória).
5. Aplicar em **projetos práticos**.

---

