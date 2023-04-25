Date : 25-04-2023
-------------------------------------
# Topics:

	-Introduction to Datastructure
	-Computational Thinking
	-Types of Data Structures
	-Recursion
	
    Data: collection of raw facts.

    Data structure: organization of data needed to solve the problem.

    Algorithm: Outline, the essence of the computational process.It is a step by step instructions.

    Program: -An implementation of the algorithm in some programming language.

Algorithm:
-----------
  -It is a sequence of unambiguous instructions/operations for solving a problem,for obtained the required output for any legitimate  input in a finite amount of time.

Characteristics of algorithms:
--------------------------------
    Input:some input value is required.
    Output:atleast one output.
    Unambiguity:instructions must very clear and simple.
    Finiteness:limited amount of instruction.
    Effectiveness:instructions in program must be clear and it affects the overall program.
    Laguage independent:output for different programming language must be same.
	
	
Good Algorithm:
----------------
	Efficiency:
		-1. Running time
		-2. Space used by the program
	
	Note: The number of bits in an input  will define the efficiency of the algorithm.
	
Algorithm Design Strategies:
------------------------------
	1.Brute force
	2.Divide and Conquer
	3.Decresea and conquer
	4.Transform and conquer
	5.Greedy approach
	6.Dynamic programming
	7.Backtracking 
	8.Branch and bound
	...
	
Analysis of Algorithm:
-----------------------
	-Correctness
		-Time efficiency
		-Space efficiency
	-An algorithm is said to be efficient and fast, it takes less time to execute 
	and consume less memory space
	
	-The performance of algorithm can be measured by the properties:
		1. Time complexity
		2. Space complexity
	
Data structure:
----------------
	-It is an organization, management and storage of data.
	-It will enable the efficient access and modification.
		
Types of Data structure:
-------------------------
	1. Linear Data Structure
		-Elements can be arranged in 1 dimension, are known as linear data strucuter.
		-eg., array, queue, stack, linked list,...
		
	2. Non-Linear Data Structure
		-Elements can be arranged in one to many, many to one and many to many dimension.
		-e.g., tree, graph, table, ...
		
Home work:
------------
  
     -Differntiate between Linear and nonlinear data structure.
     -Differntiate  between Primitive and non primitive data structure.

Keyword:
-----------
    -Linear
    -Non-linear
    -homogeneous
    -non-homogeneous
    -static
    -dynamic

Advantage:
--------------

    -efficiency
    -resuability
    -abstraction (ADT: Abstract data type)

Abstract Data type:
--------------------

  -ADT is a type or class for objects whose behaviour is defrined by a set of value and set of operations.
  -"abstract" because it gives an implementation independent view.

Recursion:
----------

    -Any function which call itself directly or indirectly is called Recursion.
    -important : recursive function get terminate.
    -eg: tower of hanoi (TOH), tree traversals, DFS and BFS, sorting algos,....

Direct recursion:
---------------------

    void f1()
    {
      f1()// recursive call
    }

Indirect recursion:
--------------------

    void f1()
    {
      f2()// recursive call
    }
    void f2()
    {
      f1()// recursive call
    }

    -code compact  but complex to understand.
    -code is smaller in size, easier to write recursive code.
    -termination of code: base condition is to be reached.
    -requires extra space on the stack.

# Home work
----------

    1.Tower of Hanoi
    2.Factorial
    3.Fibnocci series (n=5,10,25,50,100)
    4.Greatest common divisor
    5.Printing all permutations of the given string.
