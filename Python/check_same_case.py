# Python

# Problem: check to see if two parameters are both the same case (upper or lower)

# Example:
# A + B = 1
# A + b = 0
# a + ? = -1




# FIRST ATTEMPT ====================================================


def same_case(a, b): 
    
    
    if a.isupper() and b.isupper():
        
        return 1
    
    elif a.islower() and b.islower():
        
        return 1
    
    elif a.islower() and b.isupper():
        
        return 0
    
    elif a.isupper() and b.islower():
        
        return 0
    
    else:
        
        return -1


# TESTS ====================================================


assert same_case("a", "b") == 1
assert same_case("B", "b") == 0
assert same_case("c", "c") == 1
assert same_case("??", "") == -1
print("All tests passed.")


# OPTIMIZATION ==============================================


