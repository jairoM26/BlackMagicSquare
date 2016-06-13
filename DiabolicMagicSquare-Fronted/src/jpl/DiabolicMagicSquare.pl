/**
 * This library provides CLP(FD): Constraint Logic Programming over Finite Domains. 
 * solving combinatorial problems such as planning, scheduling and allocation tasks.For more information in: http://www.swi-prolog.org/man/clpfd.html
 */

:- use_module(library(clpfd)).

%------------------- Three principal  Magic Scuares ---------------

 diabolicA([1,8,13,12,14,11,2,7,4,5,16,9,15,10,3,6]). %Magic Scuare A
 diabolicB([1,12,7,14,8,13,2,11,10,3,16,5,15,6,9,4]). %Magic Scuare B
 diabolicC([1,8,11,14,12,13,2,7,6,3,16,9,15,10,5,4]). %Magic Scuare C
 
 diabolic([1,8,13,12,14,11,2,7,4,5,16,9,15,10,3,6]). %Magic Scuare A
 diabolic([1,12,7,14,8,13,2,11,10,3,16,5,15,6,9,4]). %Magic Scuare B
 diabolic([1,8,11,14,12,13,2,7,6,3,16,9,15,10,5,4]). %Magic Scuare C




%############################################### USER MAGIC SCUARE ###################################################################


/**
 * diabolic(-List of number that can be a magic scuare) User input
 *
 * Check if the user input a magic scuare or not.
 * MATRIZ Magic Scuare:
 *   A  E   I   M
 *   B  F   J   N
 *   C  G   K   O
 *   D  H   L   P
 *   test: diabolic([1, 8, 10, 15, 14, 11, 5, 4, 7, 2, 16, 9, 12, 13, 3, 6])
 */



diabolic([A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P]) :-
    Numbers=[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16], % List of all number that can input the user

%---------------------- Check if the number input by the user are from 1 to 16----------------------------


    Sum1=[A,B,C,D],select_list(Numbers,Sum1,N1),
    
    Sum2=[E,F,G,H],select_list(N1,Sum2,N2),
    
    Sum3=[I,J,K,L],select_list(N2,Sum3,N3),
    
    Sum4=[M,N,O,P],select_list(N3,Sum4,[]),
   
%---------------------- Check if the list of parameter sum 34----------------------------



%Vertical sum n(n^2 + 1)/2

    sum_list(Sum1,34), % First column should sum 34
    sum_list(Sum2,34), % Second column should sum 34
    sum_list(Sum3,34), % Third column should sum 34
    sum_list(Sum4,34), % Fourth column should sum 34

%Any of the sixteen 2x2 squares, including those that wrap around the edges of the
%whole square, should sum 34

    sum_list([A,E,B,F],34),
    sum_list([C,G,D,H],34),
    sum_list([I,M,J,N],34),
    sum_list([K,O,L,P],34),
    sum_list([B,F,C,G],34),
    sum_list([J,N,K,O],34),

% The corners of any 3×3 square,should Sum 34

    sum_list([A,I,C,K],34),
    sum_list([B,J,D,L],34),
    sum_list([E,M,G,O],34),
    sum_list([F,N,H,P],34),

%Any pair of horizontally or vertically adjacent numbers, together with the
%corresponding pair displaced by a (2, 2) vector, should sum 34

    sum_list([A,E,K,O],34),
    sum_list([B,F,L,P],34),
    sum_list([C,G,I,M],34),
    sum_list([D,H,J,N],34),
    sum_list([A,B,K,L],34),
    sum_list([C,D,I,J],34),
    sum_list([E,F,O,P],34),
    sum_list([G,H,M,N],34),

%Horizontal sum n(n^2 + 1)/2

    sum_list([A,E,I,M],34),% First row should sum 34
    sum_list([B,F,J,N],34),% Second row should sum 34
    sum_list([C,G,K,O],34),% Third row should sum 34
    sum_list([D,H,L,P],34),% Fourth row should sum 34

% The two should Diagonal sum (n^3 + n)/2

    sum_list([A,F,K,P],34),% 
    sum_list([M,J,G,D],34).

%----------------------Check what number is each element of the user input, if are one repeated , the no is a magic scuare---------------


select_list(X,[],X). % Stop the recursion,Is true when the list T is empty
select_list(X,[H|T],Z) :- select(H,X,Y), % Is true when X with H removed, results in Y.
select_list(Y,T,Z). % Return a list Z, from the list Y and T


%######################## Make from 1 to 10 Magic Scuares ######################




/** 
 *Kinds of Magic Scuares
 *   A  B   C   D
 *   E  F   G   H
 *   I  J   K   L
 *   M  N   O   P
 */

%-------------Each line make a different magic scuare-------

%diabolic(A):- diabolico(L), writescuares(L).
diabolic(A,B):- diabolico(L), writescuares(L), reflection(L).
diabolic(A,B,C):- diabolic(A,B),diabolico(L),rotation_center(L).
diabolic(A,B,C,D):-diabolic(A,B,C),diabolico(L),rotation_columns(L).
diabolic(A,B,C,D,E):-diabolic(A,B,C,D),diabolico(L),rotation_rows(L).
diabolic(A,B,C,D,E,F):-diabolic(A,B,C,D,E),diabolico(L),convolution(L).

diabolic(A,B,C,D,E,F,G):-diabolic(A,B,C,D,E,F),diabolicA(L),reflection(L).
diabolic(A,B,C,D,E,F,G,H):-diabolic(A,B,C,D,E,F,G),diabolicA(L),rotation_center(L).
diabolic(A,B,C,D,E,F,G,H,I):-diabolic(A,B,C,D,E,F,G,H),diabolicA(L),rotation_columns(L).
diabolic(A,B,C,D,E,F,G,H,I,J):-diabolic(A,B,C,D,E,F,G,H,I),diabolicA(L),rotation_rows(L).

%----------------------   TRANSFORMATION  -----------------------------

%--------------- Reflection --------------------------

%Reverse all rows of the square, the first rox change with the last, and the second row change with the third.
reflection([A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P]):-
    writescuares([D,C,B,A,H,G,F,E,L,K,J,I,P,O,N,M]).

%---------- Rotation about the center point  ------

%Change the values around the center, not change the center or the corners.
rotation_center([A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P]):-
    writescuares([A,E,H,D,B,F,G,C,N,J,K,O,M,I,L,P]).
    
%----------Rotation of columns---------------

%Take the rightmost column and put it one to the left.
rotation_columns([A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P]):-
    writescuares([D,B,C,A,H,G,F,E,L,K,J,I,P,O,N,M]).

%------------- Rotation of rows ------------------

%Remove the top row and tack it on the bottom.
rotation_rows([A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P]):-
    writescuares([M,N,O,P,E,F,G,H,I,J,K,L,A,B,C,D]).
    
%----------Convolution-----------------------
%Take the rows and converts it in a 2x2 square.
convolution([A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P]):-
    writescuares([A,D,H,E,B,C,G,F,N,O,K,J,M,P,L,I]).




%############################################### SHOWALL #######################################################################


/** 
 *Show the 384 magic scuares
 */
showall :- diabolico(L), writescuares(L),fail.


/** 
 *Make the magic scuares
 *   A  B   C   D
 *   E  F   G   H
 *   I  J   K   L
 *   M  N   O   P
 */
diabolico([A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P]) :-
 
 Vs = [A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P],
 Vs ins 1..16,


 all_different(Vs),%Check if all number are different; more information in:  http://www.swi-prolog.org/pldoc/man?predicate=all_distinct/1
 A+B+C+D#=34,
 E+F+G+H#=34, 
 I+J+K+L#=34,
 M+N+O+P#=34,
 A+E+I+M#=34,
 B+F+J+N#=34,
 C+G+K+O#=34,
 D+H+L+P#=34,
 M+B+G+L#=34,
 I+N+C+H#=34,
 E+J+O+D#=34,
 A+F+K+P#=34,
 P+C+F+I#=34,
 L+O+B+E#=34,
 H+K+N+A#=34,
 D+G+J+M#=34,
 
 label(Vs).% Generate solutions in increasing or decreasing order of the value

/** 
 * Show the magic scuare
 */
writescuares([]):- writeln('Magic scuare : ').
writescuares([A,B,C,D|Rs]) :-
 format('~|~t~d~3+~|~t~d~3+~|~t~d~3+~|~t~d~3+~n', [A,B,C,D]),%Write the values of A,B,C and D separate by 3 spaces, each. 
 %More information : http://www.swi-prolog.org/pldoc/man?section=format
 writescuares(Rs).