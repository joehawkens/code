"""
In this Kata the aim is to compare each pair of integers from 2 arrays, and return a new array of large numbers.

Note: Both arrays have the same dimensions.
"""

def get_larger_numbers(a, b):
    
    counter = 0
    large_numbers = []
    
    for number in range(len(a)):
        
        if a[counter] >= b[counter]:
            
            large_numbers.append(a[counter])
            counter += 1
            
        else:
            
            large_numbers.append(b[counter])
            counter += 1
            
    return large_numbers