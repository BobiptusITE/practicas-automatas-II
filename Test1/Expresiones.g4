grammar Expresiones;

a: b a_prima;

a_prima: '+' b a_prima | '*' b a_prima |;

b: c b_prima;

b_prima: '^' c b_prima |;

c: '(' a ')' | 'x' | 'y';