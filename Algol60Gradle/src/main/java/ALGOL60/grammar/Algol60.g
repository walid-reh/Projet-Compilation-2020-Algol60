// Grammaire du langage Algol60


/*
Authors :

REHIOUI Walid
ANOUAR Ilham
HMIZA Jaber
FAZOUANE Souhail

*/



grammar Algol60;




options{
k=1;
backtrack=false;
language=Java;
output=AST;
ASTLabelType=CommonTree; 
}







tokens{
LABELLIST;
STATEMENTS;
PROG;
LABEL;
BLOCK;
BOUNDS;
ARRAY_DIMENSION;
DECLARATIONS;
OWN_DECLARATION;
SWITCH_DECLARATION;
LOCAL_DECLARATION;
ARRAY_DECLARATION;
PROC_DECLARATION;
VAR_ID;
ARRAY_SEGMENT;
ARRAY_ID;
ARRAY_BOUNDS;
SWITCH_LIST;
LISTPARAMETER;
IF;
THEN;
ELSE;
SPECIFICATION;
BEGIN;
ASSIGNMENT;
ARRAY_ACCESS;
INDEX;
FOR;
DO;
FUNCTION_CALL;
GOTO;
FOR_LIST;
UNTIL;
STEP;
WHILE;
SWITCH_CALL;
SWITCH_CASE;
SPECIFICATION;
SPECIFIED_ID;
VALUE;
LABELLED_EMPTY_STATEMENT;
LABELLED_BLOCK;
LABELLED_STATEMENT;
FOR_ELEMENT;
EMPTY_STATEMENT;
}


@members{
 CommonTree Identifiermemory;
 CommonTree Identifiermemory2;

}


            



program    :	 start_program ->^(PROG start_program)
            ;
       
       
start_program
 	:	rest_program
 	|           'begin' (declaration ';')* compound_tail -> ^(BEGIN  ^(DECLARATIONS declaration*)? ^(BLOCK compound_tail)?)
 	;
 
rest_program
            	:	 (label ':') start_program -> ^(LABELLED_BLOCK label  start_program) 
            	;
            
label	:	Number
             |            Identifier
             ;



compound_tail
	:	 statement (';' statement)* 'end'-> statement+
	;



declaration :            'own'  own_declaration_1 -> ^(OWN_DECLARATION  own_declaration_1)
           |             switch_declaration ->^(SWITCH_DECLARATION switch_declaration) 
           |             type declarationtypenoown  -> ^(LOCAL_DECLARATION type declarationtypenoown)
           |             array_declaration -> ^(ARRAY_DECLARATION array_declaration)
           |             procedure_declaration -> ^(PROC_DECLARATION procedure_declaration)
           ;



declarationtypenoown
	:       procedure_declaration -> ^(PROC_DECLARATION procedure_declaration)
	|       array_declaration  -> ^(ARRAY_DECLARATION array_declaration)
	|       type_declaration  -> ^(VAR_ID type_declaration)
	;


 own_declaration_1
 	:	array_declaration  -> ^(ARRAY_DECLARATION array_declaration)
 	|           type own_typed 
 	;

own_typed
	:  type_declaration ->^(VAR_ID type_declaration)
	| array_declaration  -> ^(ARRAY_DECLARATION array_declaration)
	;

 	

type_declaration
	:	 
	Identifier (',' Identifier)* -> Identifier+
	;


array_declaration
	:	 'array' array_list -> array_list
	;


array_list
	:	 array_segment (',' array_segment)* -> array_segment+
	;
	
	
array_segment
	:	 Identifier  (',' Identifier)* '[' bound_pair_list ']' ->^(ARRAY_SEGMENT ^(ARRAY_ID Identifier+) ^(ARRAY_DIMENSION bound_pair_list)) //àrevoir
             ;
         


bound_pair_list
	:	 bound_pair (',' bound_pair)* -> bound_pair+
	;

bound_pair
	:	 lower_bound ':' upper_bound ->^(BOUNDS lower_bound upper_bound)
	;
	





	
	
switch_declaration
	:     'switch'! Identifier ':='! switch_list 
	;
	
	
	

switch_list
	:	 designational_expression (',' designational_expression)* ->^(SWITCH_LIST designational_expression+)
	;
	




local_or_own_type
	:	 ('own')?
	;


type	:	 'real'
            |             'integer'
            |             'boolean'
            ;







upper_bound
	:	 arithmetic_expression
	;

lower_bound
	:	arithmetic_expression
	;


procedure_declaration
	:     'procedure' procedure_heading statement -> procedure_heading statement
	;



procedure_heading
	:	 Identifier formal_parameter_part ';'! value_part specification_part 
	;


formal_parameter_part
	:
	|             '(' formal_parameter_list  ')' (Identifier ':' '(' formal_parameter_list ')')*
	->^(LISTPARAMETER formal_parameter_list  (formal_parameter_list)*)

	;
	
	
formal_parameter_list
	:	Identifier (',' Identifier)* -> Identifier+
	;



value_part
	:	 'value' Identifier (',' Identifier)* ';' ->^(VALUE Identifier+)
	|
            ;


specification_part
	:	specification_part1* -> specification_part1*
	// -> ^(SPECIFICATION specifier ^(SPECIFIED_ID Identifier+))* 
            ;
   
specification_part1
           	:	specifier (Identifier (',' Identifier)*) ';'  -> ^(SPECIFICATION specifier ^(SPECIFIED_ID Identifier+)) 
           	;


identifier_list
	:	Identifier (',' Identifier)*
	;

specifier
	:	'string'
	|            type type_1
            |            'array'
            |            'label'
            |            'switch'
            |            'procedure'
            ;
type_1	:
	|	'array'
	|	'procedure'
	;
  
              	
             
             
statement 
	:	statement_memory->statement_memory
	|            go_to_statement -> go_to_statement 
	|            -> EMPTY_STATEMENT
	|             'if' expression 'then' conditional_statement ( options {greedy=true;} : 'else' statement)? ->^(IF expression ^(THEN conditional_statement) ^(ELSE statement)?)
	|             'for' Identifier(-> Identifier) {Identifiermemory2=$statement.tree;} iterator ':=' for_list 'do' s1=statement2 ->^(FOR  iterator ^(FOR_LIST for_list) ^(DO $s1)) 
	|             'begin' ( declaration ';')* compound_tail ->^(BEGIN ^(DECLARATIONS declaration*)? ^(BLOCK compound_tail)?)
	;
	
statement2  : statement->statement
;
  
  
  
  
statement_memory	:   Identifier (->Identifier){Identifiermemory=$statement_memory.tree;} statement_with_identifier->statement_with_identifier
	|   Number (->Number){Identifiermemory=$statement_memory.tree;} statement_with_identifier->statement_with_identifier
	;
             

statement_with_identifier
	:    (->{Identifiermemory}) actual_parameter_part -> actual_parameter_part
	|    (->{Identifiermemory})   '[' arithmetic_expression (',' arithmetic_expression)* ']' (':='  expression)+ ->^(ASSIGNMENT ^(ARRAY_ACCESS $statement_with_identifier ^(INDEX arithmetic_expression+)) expression+)
	|    (->{Identifiermemory}) (':=' expression)+ ->^(ASSIGNMENT $statement_with_identifier expression+)
      	|    (->{Identifiermemory}) ':' statement_with_label ->statement_with_label
	;
	
	
statement_with_label 
	:	 (->{Identifiermemory}) label_labeled_statements ->^(LABELLED_STATEMENT $statement_with_label label_labeled_statements)
	|             (->{Identifiermemory}) go_to_statement ->^(LABELLED_STATEMENT $statement_with_label go_to_statement)
	|             (->{Identifiermemory}) 'if' expression 'then' conditional_statement (options {greedy=true;} : 'else' statement)? ->^(LABELLED_STATEMENT $statement_with_label ^(IF expression ^(THEN conditional_statement) ^(ELSE statement)))
//	|             (->{Identifiermemory}) 'for' Identifier variable_para? ':=' for_list 'do' ->^(LABEL $statement_with_label ^(FOR Identifier  ))
	|	 (->{Identifiermemory}) for_statement  ->^(LABELLED_STATEMENT $statement_with_label for_statement )                                                                                                                                                                
             |             (->{Identifiermemory}) begin ->^(LABELLED_STATEMENT $statement_with_label begin)
             |             (->{Identifiermemory}) actual_parameter_part1->actual_parameter_part1
             |             (->{Identifiermemory}) ->^(LABELLED_EMPTY_STATEMENT $statement_with_label)
      //     |             (->{Identifiermemory}) ':' statement_with_label->statement_with_label
	;
	
	
for_statement 
	:	 'for' Identifier(-> Identifier) {Identifiermemory2=$for_statement.tree;} iterator ':=' for_list 'do' statement  ->^(FOR iterator ^(FOR_LIST for_list) ^(DO statement))
	;	
	
begin	:	 'begin' ( declaration ';')* compound_tail ->^(BEGIN ^(DECLARATIONS declaration*)? ^(BLOCK compound_tail)?)
	;
	
	
label_labeled_statements 
	:	Identifier (->Identifier) {Identifiermemory=$label_labeled_statements.tree;} labeled_statements->labeled_statements
	|            Number (->Number) {Identifiermemory=$label_labeled_statements.tree;} labeled_statements->labeled_statements
	;

labeled_statements
	:   (->{Identifiermemory}) (':=' expression)+ ->^(ASSIGNMENT $labeled_statements expression+)
	|  (->{Identifiermemory}) actual_parameter_part -> actual_parameter_part
	|   ':' statement_with_label->statement_with_label
	;
	
	
	
conditional_statement_with_label
	:         Identifier (-> Identifier) {Identifiermemory=$conditional_statement_with_label.tree;} expression_with_identifier->expression_with_identifier
	|         (->{Identifiermemory}) go_to_statement->^(LABEL $conditional_statement_with_label go_to_statement )
	|         (->{Identifiermemory}) begin -> begin
	|          'for' Identifier(-> Identifier) {Identifiermemory2=$conditional_statement_with_label.tree;} iterator ':=' for_list 'do' statement->^(FOR iterator ^(FOR_LIST for_list) ^(DO statement))
	|          
	;
	
iterator      :	 (->{Identifiermemory2}) '[' arithmetic_expression (',' arithmetic_expression)* ']' ->^(ARRAY_ACCESS  $iterator  ^(INDEX arithmetic_expression+))
	|	 (->{Identifiermemory2})
	;

conditional_statement 
	:    'for' Identifier (-> Identifier) {Identifiermemory2=$conditional_statement.tree;} iterator ':=' for_list 'do' statement->^(FOR  iterator ^(FOR_LIST for_list) ^(DO statement))
	|    Identifier (->Identifier) {Identifiermemory=$conditional_statement.tree;} conditional_statement_with_id   -> conditional_statement_with_id  
	|    go_to_statement  -> go_to_statement
	|    begin  -> begin 
	|    
	;



conditional_statement_with_id
	: 	 (->{Identifiermemory}) expression_with_identifier->expression_with_identifier
	|             ':' conditional_statement_loop -> conditional_statement_loop
	;


expression_with_identifier 
	:	 (->{Identifiermemory}) (':=' expression)+ ->^(ASSIGNMENT $expression_with_identifier expression+ )
	|             (->{Identifiermemory}) actual_parameter_part  -> actual_parameter_part 
	;
	
	
conditional_statement_loop
	:	 (->{Identifiermemory}) conditional_statement_with_label -> conditional_statement_with_label
	|             ':' conditional_statement_loop -> conditional_statement_loop
	;	
	


	

go_to_statement
	:            'goto' designational_expression ->^(GOTO designational_expression)
             ;


designational_expression
	:	simple_designational_expression -> simple_designational_expression
	|            'if' expression 'then' simple_designational_expression 'else' designational_expression ->^(IF expression ^(THEN simple_designational_expression) ^(ELSE designational_expression ))
            ; 



simple_designational_expression
	:	Identifier ( '[' arithmetic_expression ']'-> ^(SWITCH_CALL Identifier ^(SWITCH_CASE arithmetic_expression )) | ->Identifier)         
	|             Number
            |            '(' designational_expression ')' -> designational_expression
            ;
           
           
                  
actual_parameter_part1
	:	 (->{Identifiermemory}) '(' actual_parameter (',' actual_parameter)*')' (Identifier '(' actual_parameter (',' actual_parameter)* ')' )*
	->^(FUNCTION_CALL $actual_parameter_part1 ^(LISTPARAMETER actual_parameter*   ))
            ;

actual_parameter_part
	:	 (->{Identifiermemory}) '(' actual_parameter (',' actual_parameter)*')' (Identifier ':' '(' actual_parameter (',' actual_parameter)* ')' )*
		->^(FUNCTION_CALL $actual_parameter_part ^(LISTPARAMETER actual_parameter*  ))

	|       
            ;

actual_parameter
	:	 STRING
            |             expression -> expression
            |
            ;



if_clause
                       :	 'if' expression 'then'
                        ;
 
 
 
for_list
            :	for_list_element (',' for_list_element)* -> ^(FOR_ELEMENT for_list_element)+
            ;

for_list_element
	:	arithmetic_expression for_list_element1
            ;


for_list_element1
	:             'while' expression ->^(WHILE expression)
             |             'step' d1=arithmetic_expression 'until' d2=arithmetic_expression ->^(STEP $d1 $d2 )
             |
           	;


arithmetic_expression
	:	simple_arithmetic_expression -> simple_arithmetic_expression
             |            'if' expression 'then' simple_arithmetic_expression 'else' arithmetic_expression ->^(IF expression ^(THEN simple_arithmetic_expression) ^(ELSE arithmetic_expression))
             ;


expression
            :	simple_boolean -> simple_boolean
            |            'if' expression 'then' simple_boolean 'else' expression ->^(IF expression ^(THEN simple_boolean) ^(ELSE expression))
            ;


simple_boolean
	:	implication ('<=>'^ implication)*
             ;

implication
	:	boolean_term ('=>'^ boolean_term)*
             ;

boolean_term
	:	boolean_factor ('OR'^ boolean_factor)*
             ;

boolean_factor
	:	boolean_secondary ('AND'^ boolean_secondary)*
             ;


boolean_secondary
	:            boolean_primary
	|            '~'^ boolean_primary
	;

boolean_primary
	:             ('true' | 'false')      
             |             relation
             ;


relation 
            
            :             simple_arithmetic_expression (('<' | '<=' | '=' | '<>' | '>' | '>=')^ simple_arithmetic_expression)?
                        ;

simple_arithmetic_expression
            :            term (('+'|'-')^ term)*
            |            (('+'|'-')^ term)+ 
            ;


term 	:	factor (('*'|'//'|'/')^ factor)*
            ;


factor	:	primary ('**'^ primary)*
             ;

primary	:	 Identifier (->Identifier) {Identifiermemory=$primary.tree;} primary_with_identifier -> primary_with_identifier
	|	 Number -> Number
             |             '(' expression ')' -> expression
            ;
     
     

	
primary_with_identifier
	:    (->{Identifiermemory}) actual_parameter_part1-> actual_parameter_part1
	|     (->{Identifiermemory})
	|     (->{Identifiermemory}) '[' arithmetic_expression (',' arithmetic_expression)* ']' ->^(ARRAY_ACCESS  $primary_with_identifier ^(INDEX arithmetic_expression+))
	;



STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;
    
    

Identifier
	:     Letter(Letter|('0'..'9'))*
	;

fragment
Letter
	:	('a'..'z'|'A'..'Z')
	;
		
// Ici on genere tous les nombres (entiers et reels)	
Number
    :   INT '.' ('0'..'9')* EXPONENT?
    |   '.' INT EXPONENT?
    |   INT EXPONENT?
    ;

fragment    
INT 	:	('0'..'9')+
	;
	
fragment		
EXPONENT : ('e'|'E') ('+'|'-')? INT ;



COMMENT
    :   'comment' ~(';')* ';' {$channel=HIDDEN;}
    ;


WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
