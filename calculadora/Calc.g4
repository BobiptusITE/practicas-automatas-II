grammar Calc;

// ── REGLAS DEL PARSER (minúsculas) ──────────────────

prog:
	expr EOF; // Un programa es una expresión seguida del fin de entrada

expr:
	expr op = ('*' | '/') expr		# MulDiv // Multiplicación y división (mayor precedencia)
	| expr op = ('+' | '-') expr	# SumRes // Suma y resta (menor precedencia)
	| '(' expr ')'					# Par // Expresión entre paréntesis
	| NUM							# Numero; // Un número

// ── REGLAS DEL LEXER (MAYÚSCULAS) ───────────────────

NUM: [0-9]+ ('.' [0-9]+)?; // Número entero o decimal

WS: [ \t\r\n]+ -> skip; // Ignorar espacios en blanco