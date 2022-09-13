# Python

# Problem: Break up camel case syntax.
# Example: camelCase -> camel Case



# First attempt:


def breakCamelCase(string):

    newString = ""

    for character in string:

        if character.isupper():

            new_character = f" {character}"
            newString += new_character

        else: 

            newString += character
    
    print(newString)

# TESTS ==============================================

breakCamelCase("camelCase")
breakCamelCase("thisFunctionDoesSomething")
breakCamelCase("") # returns nothing
breakCamelCase("functionDoesThis")

# =====================================================



# Optimzation (Time/Space Complexity)




