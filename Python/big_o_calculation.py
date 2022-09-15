# What is Big-O?

# The measure of an algorithm's efficiency.
# An Algorithm are the steps taken to complete a task.



# O(1) - Constant Time - Assignment and Calculation ===============================================================================================

def add_numbers(a,b):

    c =  a + b # Step 1

    d = c * 22 + 13 # Step 2

    e = d / 2 # Step 3

    return e


# O(1) + O(1) + O(1) = O(1) Constant Time


# O(n) - Linear time (loops) ======================================================================================================================

def find_number(list, target):

    for number in list: # O(n) - linear time (list with n items)

        if number == target:

            print("Number in list.") # O(1) - Constant Time

        else:

            print("Number not in list.") # O(1) - Constant Time

# O(n) + O(1) + O(1) =  O(n) Linear Time (Uses a loop)



# O(n^2) - Quadratic Time (nested loops) ======================================================================================================================

def find_letter_in_word_in_list(list, letter):

    for word in list: #O(n)

        for character in word: #O(n)

            if character == letter: #O(1)

                print("Letter is in the word.")

            else: #O(1)

                print("Letter is not in the word.")



# O(n^2) + O(1) + O(1) = O(n^2)

