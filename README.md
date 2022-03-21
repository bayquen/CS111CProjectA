# Project: Java Array-Based List Implementation
Course: CS111C Java Data Structures and Algorithms, Spring 2022

Team Members: Brandon Bayquen, Juan E., Ricky H.
## Project Description:
You are given an interface for a type of list. The list works like this:

-  entries can only be added to and removed from the front or back of the list
-  entries can be accessed in any position
-  the size of the list is limited ("capped"); when the size is reached, no more entries can be added
-  entries begin at index 0

Write a class that implements this interface. The class uses arrays to implement the list.

## Class Requirements: Part One
Your class should have all of the following. I recommend working on these methods listed in Part One first. The provided tester file relies heavily on these methods to run. So you should write and test these methods first. There is information in the section below and commented out in the tester file about how you can test these methods.

### (3 points) constructor(int)
the parameter specifies the maximum size (i.e., capacity) that the list can be
### (4 points) String toString()
-  the output must contain the size, the capacity (max size), and a display of all elements in the list (see the driver program for the format of the text representation- your display must match this format!)
-  Note: I strongly recommend writing the toString method right after the constructor because the tester will be much less useful without this method written!
### (2 points) boolean isEmpty()
### (2 points) boolean isFull()
### (1 points) int size()
### (6 points) T getEntry(int)
-  null should be returned when an invalid position is passed in as a parameter
### (2 points) void clear()
 
## Class Requirements: Part Two

### (12 points) boolean addBack(T)
-  when there is room to add an element, the new element is added to the end of the list and true is returned
-  when the list is full, no changes are made to the array and false is returned
### (15 points) boolean addFront(T)
-  when there is room to add an element, the current elements in the list are shifted to make room and the new element is added to the beginning of the list; true is returned
when the list is full, no changes are made to the array and false is returned
### (15 points) T removeFront()
-  elements in the list are shifted down after the element is removed from the front
-  null is returned from an empty list
### (12 points) T removeBack()
-  null is returned from an empty list
### (6 points) boolean contains (T)
### (5 points) int indexOf(T)
### (5 points) int lastIndexOf(T)
