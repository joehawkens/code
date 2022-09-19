# Python

# Problem: Break up camel case syntax.

# Example: camelCase -> camel Case




# FIRST ATTEMPT ====================================================

def breakCamelCase(string):

    newString = ""

    for character in string:

        if character.isupper():

            new_character = f" {character}"
            newString += new_character

        else: 

            newString += character
    
    return newString

# Time Complexity = O(n)
# TESTS ============================================================

assert breakCamelCase("camelCase") == "camel Case"
assert breakCamelCase("thisFunctionDoesSomething") == "this Function Does Something"
assert breakCamelCase("") == ""
assert breakCamelCase("functionDoesThis") == "function Does This"
print("All tests passed.")

# OPTIMIZATION =====================================================

 



