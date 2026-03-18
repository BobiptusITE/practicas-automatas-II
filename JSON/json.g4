grammar json;

json: object | array;

object: LBRACE pair (',' pair)* RBRACE | LBRACE RBRACE;

array:
	LBRACKET value (',' value)* RBRACKET
	| LBRACKET RBRACKET; // empty array

pair: STRING COLON value;

value:
	STRING
	| NUMBER
	| object // recursion
	| array // recursion
	| 'true' // keywords
	| 'false'
	| 'null';

////////////////////////////////////////////////////////////////////////////////

LBRACE: '{';
RBRACE: '}';
LBRACKET: '[';
RBRACKET: ']';
COLON: ':';
COMMA: ',';

NUMBER:
	'-'? INT '.' INT EXP? // 1.35, 1.35E-9, 0.3, -4.5
	| '-'? INT EXP // 1e10 -3e4
	| '-'? INT; // -3, 45

STRING: '"' (ESC | ~["\\])* '"';
WS: [ \t\n\r]+ -> skip;

fragment INT: '0' | [1-9] [0-9]*; // no leading zeros
fragment EXP:
	[Ee] [+\-]? INT; // \- since - means "range" inside [...]
fragment ESC: '\\' (["\\/bfnrt] | UNICODE);
fragment UNICODE: 'u' HEX HEX HEX HEX;
fragment HEX: [0-9a-fA-F];