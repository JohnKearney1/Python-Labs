# Everybody is familiar with the rule that any year divisible by four is a leap year, but that's only part of the rule.
# Did you know that if a year is divisible by 100, it isn't a leap year? Of course, that is, unless the year is also
# divisible by 400, in which case it becomes a leap year again.

# Write a program called leap-year.py that takes a year from the user and answers the question of whether a given year
# is a leap year.

# WAYS TO IMPROVE THIS CODE:
# Better input checking: I've added a simple exception block to ensure the user enters only a number.

# import sys to allow for forced termination
import sys

# this method determines whether an integer is a leap year or not (year = int)
def isLeapYear(year):
    # initalize a boolean variable to hold our answer
    ans = False

    # if the year is divisible by four with no remainder, it is a leap year
    if year % 4 == 0:
        ans = True

        # if the year is also divisible by 100 with no remainder, it is no longer a leap year
        if year % 100 == 0:
            ans = False

            # if the year is also divisible by 400 with no remainder, it is a leap year.
            if year % 400 == 0:
                ans = True

    # return the answer (boolean)
    return ans


# main execution flow
def main():
    year = input("Type in any number to find out if that year is a leap year: ")

    # convert the user's string input to an int
    try:
        year = int(year)

    # if the input wasn't an integer number, terminate the program with a message
    except ValueError:
        print("Oops! You didn't enter a number.")
        sys.exit(0)

    # determine whether it is a leap year or not
    ans = isLeapYear(year)

    # Print the response, concatenating year back to a string
    if ans:
        print(str(year) + " is a leap year!")

    if not ans:
        print(str(year) + " is not a leap year!")


# This is the entry point for the code (where it starts)
if __name__ == "__main__":
    main()
