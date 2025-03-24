# Q1:  Big O Notation in Algorithm Analysis

Big O notation is a mathematical concept used to describe the upper bound of an algorithm's running time or space requirements in terms of the input size. It helps us understand how an algorithm scales and performs as the input grows.

# Examples & Key Rules 

1. Abstracting Constants:
   > When analyzing an algorithm, constant multipliers are ignored.

   > Example:
   If an algorithm runs in `3n` time, it is classified as `O(n)`, because the constant factor 3 does not change the rate of growth.

2. Dropping Lower Order Terms:
   > In expressions with multiple terms, only the term with the highest growth rate is considered.

   > Example:
    An algorithm with a running time of `n² + n` is classified as `O(n²)`, since `n²` grows faster than `n` as the input size increases.

3. Worst-Case Analysis:
   > Big O notation typically describes the worst-case scenario, ensuring that the algorithm’s performance is acceptable even in the most demanding cases.
   > Example:
    In linear search, even though the best case might be O(1) when the element is at the beginning, the worst-case time complexity is `O(n)`when the element is not found or is at the end.

4. Comparison of Algorithms:
   > By focusing on the dominating term and ignoring constants, Big O provides a common ground to compare different algorithms.
   > Example:
    An algorithm running in `O(n log n)` is generally more efficient than one running in `O(n²)` for large values of `n`.

5. Simplification and Focus on Asymptotic Behavior:
   > Big O notation simplifies the comparison of algorithm efficiencies by focusing on how performance scales with input size, rather than precise operation counts.
   > This abstraction helps in understanding algorithm performance regardless of hardware or implementation differences.


Q(ii) 

# Q2: Differences Between Arrays and Linked Lists

When comparing arrays and linked lists, the differences mainly lie in how they allocate memory, their performance characteristics, and how they handle insertion and deletion operations.

# 1. Memory Allocation

Arrays:
  > Memory is allocated contiguously.

  > The size of an array is fixed at the time of creation (though dynamic arrays or lists in some languages can resize, they do so by creating a new array behind the scenes).
  
Linked Lists:
  > Memory is allocated dynamically for each node.
  > Nodes can be scattered throughout memory, with each node containing a reference (or pointer) to the next node.

# 2. Performance

Arrays:
 > Access Time: Provides constant time O(1) access to elements using an index.

 > Insertion/Deletion: Inserting or deleting elements (especially in the middle) requires shifting subsequent elements, leading to a worst-case performance of O(n).
  
Linked Lists:
 > Access Time: Requires traversal from the head to the desired node, resulting in O(n) time for random access.

 > Insertion/Deletion: Generally more efficient for operations at the beginning or when the node reference is known, as these can be done in O(1) time by updating pointers. However, finding the insertion point might still take O(n) time if a search is needed.

# 3. Insertion and Deletion Operations

Arrays:
 > Insertion: Adding an element (especially in the middle) involves shifting elements to accommodate the new value.

 > Deletion: Removing an element also requires shifting elements to fill the gap.
 
 > These operations are less efficient compared to linked lists when frequent modifications are required.
  
Linked Lists:
 > Insertion: Can be performed at the beginning in constant time O(1) if you have a pointer to the head. Inserting at other positions requires locating the previous node, which is O(n) in the worst case.

 > Deletion: Removing the first node is O(1). Deleting a node from the middle or end also requires finding the preceding node, so it might take O(n) time.
  
In conclusion, arrays offer quick random access due to contiguous memory allocation, while linked lists offer more efficient insertions and deletions at the beginning or when working with dynamic data where frequent modifications are needed.
