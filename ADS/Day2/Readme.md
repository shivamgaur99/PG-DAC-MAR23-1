
March 2023: Algorithms and Data Structures
------------------------------------------

    Date : 26-04-2023
    
    Topics:
      -Recursion
      -Brute Force algorithm
      -Backtracking
      -Arrays
	
	
      gcd(int, int)
      {

      }

      Test cases:
      gcd(int,gcd(int, int))


      gcd(int, gcd(int, gcd(int,int)))
	
 ## Note: Read about Ackermann's function: foundation for recursion concept.

Array:
------

    -An array is a finite, orderd and collection of homogeneous data element.
      -finite :only limited amount of elements.
      -ordered : stored it in contigous locations in linear fashion.
      -homogeneous : same data type.
      
 Type of indexing in an array:
-------------------------------

    1.0(zero-based indexing)
    2.1(one-based indexing)
    3.n(n-based indexing)

Insertion in Array:
------------------
 arr[2]=10;
 
Access element from array:
 a=arr[2];
 
Searching in array:
A is present or not ?
	1.Loop
	2.if condn
	3.return true

1D Array:
-------------
Address( A[i]) = M + (i-L) * w
M= starting point of array
i= index of an array
L= Lower bound of an array
w= data type size

address(A[2]) = 100 + (2- 0)* 2
			  = 100 + 4= 104

U:upper bound
L:lower bound

Size(a) = U-L+1
		= 4-0+1
		= 5


2D Array:
-------------
Row Major Order:
Address(Aij)=M+(i-1)*n+j-1
ij=index in @D matrix
m=rows
n=cols
Address(a13)=100+(1-1)*4+3-1
			=102


Column Major Order:
Address(Aij)=M+(j-1)*m+i-1
Address(a13)=100+(3-1)*3+1-1
			=106
			
Operations on array:
-------------------
	-Insertion
	-Deletion
	-Searching
	-Sorting
	-Traversing

//Display
for() or for each loop

//search
Loop 0 to n
	if(a[i] == key)
		true
//Delete
same as search
replace with next element -> repeate in loop
