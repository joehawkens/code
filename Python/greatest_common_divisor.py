

# Recursion in programming:

def recursive_func(num):
    
    if num <= 0: # BASE CASE - stops the function

        print("Finished")
        return

    else: # Smaller problem, performs the operation and calls it again, with a variance.

        print(num)
        recursive_func(num-1)



# two parameters: 2 ints
# Step 1: Two numbers, find the largest number that goes into both of them, with 0 remainder

def greatest_common_div(a, b):

    if b == 0:
        
        return a

    else:

        result = greatest_common_div(b, a % b) #(b, a % b) are the arguments for the function.
        print(result)


greatest_common_div(480, 1001)