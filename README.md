# Trabalho LFA -   Web Chassi Finder

## Linguagem

```
∑ = {0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F,G,H,J,K,L,M,N,P,R,S,T,U,V,W,X,Y,Z}
    ∑ = {[0-9], [A-H], [J-N], [P], [R-Z]}
    
Q = {q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17}

→ = {q0}
* = {q17}
```

## Gramática Regular e Expressão Regular

```
S  ->  0A  |  1A  |  2A  |  3A  |  4A  |  5A  |  6A  |  7A  |  8A  |  9A  |  AA  |  BA  |  CA  |  DA  |  EA  |  FA  |  GA  |  HA  |  JA  |  KA  |  LA  |  MA  |  NA  |  PA  |  RA  |  SA  |  TA  |  UA  |  VA  |  WA  |  XA  |  YA  |  ZA
A  ->  0B  |  1B  |  2B  |  3B  |  4B  |  5B  |  6B  |  7B  |  8B  |  9B  |  AB  |  BB  |  CB  |  DB  |  EB  |  FB  |  GB  |  HB  |  JB  |  KB  |  LB  |  MB  |  NB  |  PB  |  RB  |  SB  |  TB  |  UB  |  VB  |  WB  |  XB  |  YB  |  ZB
B  ->  0C  |  1C  |  2C  |  3C  |  4C  |  5C  |  6C  |  7C  |  8C  |  9C  |  AC  |  BC  |  CC  |  DC  |  EC  |  FC  |  GC  |  HC  |  JC  |  KC  |  LC  |  MC  |  NC  |  PC  |  RC  |  SC  |  TC  |  UC  |  VC  |  WC  |  XC  |  YC  |  ZC
C  ->  0D  |  1D  |  2D  |  3D  |  4D  |  5D  |  6D  |  7D  |  8D  |  9D  |  AD  |  BD  |  CD  |  DD  |  ED  |  FD  |  GD  |  HD  |  JD  |  KD  |  LD  |  MD  |  ND  |  PD  |  RD  |  SD  |  TD  |  UD  |  VD  |  WD  |  XD  |  YD  |  ZD
D  ->  0E  |  1E  |  2E  |  3E  |  4E  |  5E  |  6E  |  7E  |  8E  |  9E  |  AE  |  BE  |  CE  |  DE  |  EE  |  FE  |  GE  |  HE  |  JE  |  KE  |  LE  |  ME  |  NE  |  PE  |  RE  |  SE  |  TE  |  UE  |  VE  |  WE  |  XE  |  YE  |  ZE
E  ->  0F  |  1F  |  2F  |  3F  |  4F  |  5F  |  6F  |  7F  |  8F  |  9F  |  AF  |  BF  |  CF  |  DF  |  EF  |  FF  |  GF  |  HF  |  JF  |  KF  |  LF  |  MF  |  NF  |  PF  |  RF  |  SF  |  TF  |  UF  |  VF  |  WF  |  XF  |  YF  |  ZF
F  ->  0G  |  1G  |  2G  |  3G  |  4G  |  5G  |  6G  |  7G  |  8G  |  9G  |  AG  |  BG  |  CG  |  DG  |  EG  |  FG  |  GG  |  HG  |  JG  |  KG  |  LG  |  MG  |  NG  |  PG  |  RG  |  SG  |  TG  |  UG  |  VG  |  WG  |  XG  |  YG  |  ZG
G  ->  0H  |  1H  |  2H  |  3H  |  4H  |  5H  |  6H  |  7H  |  8H  |  9H  |  AH  |  BH  |  CH  |  DH  |  EH  |  FH  |  GH  |  HH  |  JH  |  KH  |  LH  |  MH  |  NH  |  PH  |  RH  |  SH  |  TH  |  UH  |  VH  |  WH  |  XH  |  YH  |  ZH
H  ->  0I  |  1I  |  2I  |  3I  |  4I  |  5I  |  6I  |  7I  |  8I  |  9I  |  AI  |  BI  |  CI  |  DI  |  EI  |  FI  |  GI  |  HI  |  JI  |  KI  |  LI  |  MI  |  NI  |  PI  |  RI  |  SI  |  TI  |  UI  |  VI  |  WI  |  XI  |  YI  |  ZI
I  ->  0J  |  1J  |  2J  |  3J  |  4J  |  5J  |  6J  |  7J  |  8J  |  9J  |  AJ  |  BJ  |  CJ  |  DJ  |  EJ  |  FJ  |  GJ  |  HJ  |  JJ  |  KJ  |  LJ  |  MJ  |  NJ  |  PJ  |  RJ  |  SJ  |  TJ  |  UJ  |  VJ  |  WJ  |  XJ  |  YJ  |  ZJ
J  ->  0K  |  1K  |  2K  |  3K  |  4K  |  5K  |  6K  |  7K  |  8K  |  9K  |  AK  |  BK  |  CK  |  DK  |  EK  |  FK  |  GK  |  HK  |  JK  |  KK  |  LK  |  MK  |  NK  |  PK  |  RK  |  SK  |  TK  |  UK  |  VK  |  WK  |  XK  |  YK  |  ZK
K  ->  0L  |  1L  |  2L  |  3L  |  4L  |  5L  |  6L  |  7L  |  8L  |  9L  |  AL  |  BL  |  CL  |  DL  |  EL  |  FL  |  GL  |  HL  |  JL  |  KL  |  LL  |  ML  |  NL  |  PL  |  RL  |  SL  |  TL  |  UL  |  VL  |  WL  |  XL  |  YL  |  ZL
L  ->  0M  |  1M  |  2M  |  3M  |  4M  |  5M  |  6M  |  7M  |  8M  |  9M  |  AM  |  BM  |  CM  |  DM  |  EM  |  FM  |  GM  |  HM  |  JM  |  KM  |  LM  |  MM  |  NM  |  PM  |  RM  |  SM  |  TM  |  UM  |  VM  |  WM  |  XM  |  YM  |  ZM
M  ->  0N  |  1N  |  2N  |  3N  |  4N  |  5N  |  6N  |  7N  |  8N  |  9N  |  AN  |  BN  |  CN  |  DN  |  EN  |  FN  |  GN  |  HN  |  JN  |  KN  |  LN  |  MN  |  NN  |  PN  |  RN  |  SN  |  TN  |  UN  |  VN  |  WN  |  XN  |  YN  |  ZN
N  ->  0O  |  1O  |  2O  |  3O  |  4O  |  5O  |  6O  |  7O  |  8O  |  9O  |  AO  |  BO  |  CO  |  DO  |  EO  |  FO  |  GO  |  HO  |  JO  |  KO  |  LO  |  MO  |  NO  |  PO  |  RO  |  SO  |  TO  |  UO  |  VO  |  WO  |  XO  |  YO  |  ZO
O  ->  0P  |  1P  |  2P  |  3P  |  4P  |  5P  |  6P  |  7P  |  8P  |  9P  |  AP  |  BP  |  CP  |  DP  |  EP  |  FP  |  GP  |  HP  |  JP  |  KP  |  LP  |  MP  |  NP  |  PP  |  RP  |  SP  |  TP  |  UP  |  VP  |  WP  |  XP  |  YP  |  ZP
P  ->   0  |   1  |   2  |   3  |   4  |   5  |   6  |   7  |   8  |   9  |   A  |   B  |   C  |   D  |   E  |   F  |   G  |   H  |   J  |   K  |   L  |   M  |   N  |   P  |   R  |   S  |   T  |   U  |   V  |   W  |   X  |   Y  |   Z

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
