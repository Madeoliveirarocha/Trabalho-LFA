# Trabalho LFA -   Web Chassi Finder

## Linguagem Regular

```
Alfabeto = {[0-9], [A-H], [J-N], [P], [R-Z]}
Alfabeto = {0,1,2,3,4,5,6,7,8,9, A, B, C, D, E, F, G, H, J, K, L, M, N, P, R, S, T, U, V, W, X, Y, Z}
Estados = {q0, q1, q2, q3, q4, q5, q6, q7, q8, q9,
q10, q11, q12, q13, q14, q15, q16, q17}

→ = {q0}
* = {q17}
```

## Gramática Regular e Expressão Regular

```
S -> X X X X X X X X X X X X X X X X X
X -> 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | A | B | C | D | E | F | G | H | J | K | L | M | N | P | R | S | T | U | V | W | X | Y | Z

^[0-9A-HJ-NPR-Z]{17}$
```

## Tabela Transição

|   S   |   0   |   1   |   2   |   3   |   4   |   5   |   6   |   7   |   8   |   9   |   A   |   B   |   C   |   D   |   E   |   F   |   G   |   H   |   J   |   K   |   L   |   M   |   N   |   P   |   R   |   S   |   T   |   U   |   V   |   W   |   X   |   Y   |   Z   |
|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|
| →q0  |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |  q1   |
|  q1   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |  q2   |
|  q2   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |  q3   |
|  q3   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |  q4   |
|  q4   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |  q5   |
|  q5   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |  q6   |
|  q6   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |  q7   |
|  q7   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |  q8   |
|  q8   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |  q9   |
|  q9   | q10   | q10   | q10   | q10   | q10   | q10   | q10   | q10   | q10   | q10   | q10   | q10   | q10   | q10   | q10   | q10   | q10   | q10   | q10   | q10   | q10   | q10   | q10   | q10   | q10   | q10   | q10   | q10   | q10   | q10   | q10   | q10   | q10   |
|  q10  | q11   | q11   | q11   | q11   | q11   | q11   | q11   | q11   | q11   | q11   | q11   | q11   | q11   | q11   | q11   | q11   | q11   | q11   | q11   | q11   | q11   | q11   | q11   | q11   | q11   | q11   | q11   | q11   | q11   | q11   | q11   | q11   | q11   |
|  q11  | q12   | q12   | q12   | q12   | q12   | q12   | q12   | q12   | q12   | q12   | q12   | q12   | q12   | q12   | q12   | q12   | q12   | q12   | q12   | q12   | q12   | q12   | q12   | q12   | q12   | q12   | q12   | q12   | q12   | q12   | q12   | q12   | q12   |
|  q12  | q13   | q13   | q13   | q13   | q13   | q13   | q13   | q13   | q13   | q13   | q13   | q13   | q13   | q13   | q13   | q13   | q13   | q13   | q13   | q13   | q13   | q13   | q13   | q13   | q13   | q13   | q13   | q13   | q13   | q13   | q13   | q13   | q13   |
|  q13  | q14   | q14   | q14   | q14   | q14   | q14   | q14   | q14   | q14   | q14   | q14   | q14   | q14   | q14   | q14   | q14   | q14   | q14   | q14   | q14   | q14   | q14   | q14   | q14   | q14   | q14   | q14   | q14   | q14   | q14   | q14   | q14   | q14   |
|  q14  | q15   | q15   | q15   | q15   | q15   | q15   | q15   | q15   | q15   | q15   | q15   | q15   | q15   | q15   | q15   | q15   | q15   | q15   | q15   | q15   | q15   | q15   | q15   | q15   | q15   | q15   | q15   | q15   | q15   | q15   | q15   | q15   | q15   |
|  q15  | q16   | q16   | q16   | q16   | q16   | q16   | q16   | q16   | q16   | q16   | q16   | q16   | q16   | q16   | q16   | q16   | q16   | q16   | q16   | q16   | q16   | q16   | q16   | q16   | q16   | q16   | q16   | q16   | q16   | q16   | q16   | q16   | q16   |
|  q16  | q17   | q17   | q17   | q17   | q17   | q17   | q17   | q17   | q17   | q17   | q17   | q17   | q17   | q17   | q17   | q17   | q17   | q17   | q17   | q17   | q17   | q17   | q17   | q17   | q17   | q17   | q17   | q17   | q17   | q17   | q17   | q17   | q17   |
| *q17 | -     | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   | -   |

## Automato

>> Está disponível o Automato.jff para ser utilizado com o software JFLAP.

![Automato do Projeto](/automaton.jpg "Automaton Representation.")
