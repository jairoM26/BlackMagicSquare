diabolic([A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P]) :-
    N0=[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16],

    R1=[A,B,C,D],select_list(N0,R1,N1),sum_list(R1,34),
    R2=[E,F,G,H],select_list(N1,R2,N2),sum_list(R2,34),
    R3=[I,J,K,L],select_list(N2,R3,N3),sum_list(R3,34),
    R4=[M,N,O,P],select_list(N3,R4,[]),sum_list(R4,34),

    sum_list([A,E,I,M],34),
    sum_list([B,F,J,N],34),
    sum_list([C,G,K,O],34),
    sum_list([D,H,L,P],34),

    sum_list([A,F,K,P],34),
    sum_list([M,J,G,D],34).

select_list(X,[],X).
select_list(X,[H|T],Z) :- select(H,X,Y), select_list(Y,T,Z).


