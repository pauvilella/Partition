# Partition
Exercise related with Linked Lists.

## Exercise Challenge
Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal to x.

### Solution
I have implemented 2 solutions. 
The first one creates to linked lists (one for lowe values than x and one for greater or equal value than x). 
I iterate through the liked list and add the node to the linked list it corresponds. 
The other solution returns a linkedlist of the lower values and modifies the original liked list to hold the higher. 
If I found a value lower than x, I add it to lower and delete it from the original linked list.
