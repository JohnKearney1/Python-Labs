def isISBN(isbn):

    # Ensure the length of the provided number is 10, if not, ret false
    if len(isbn) != 10:
        return False

    # if previous condition is satisfied, calculate our
    else:
        d1 = int(isbn[0]) * 1
        d2 = int(isbn[1]) * 2
        d3 = int(isbn[2]) * 3
        d4 = int(isbn[3]) * 4
        d5 = int(isbn[4]) * 5
        d6 = int(isbn[5]) * 6
        d7 = int(isbn[6]) * 7
        d8 = int(isbn[7]) * 8
        d9 = int(isbn[8]) * 9
        if isbn[9] == 'X':
            d10 = 10
        else:
            d10 = int(isbn[9])
        d10 = d10 * 10
        d11 = (d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10)
        num = d11 % 11
        if num == 0:
            return True
        else:
            return False


def main():

    # get the number from the user
    isbn = input("Enter an ISBN: ")

    # check if the number is an isbn
    try:
        ans = isISBN(isbn)
        if ans:
            print("Valid.")
        else:
            print("Invalid.")

    # in the event the input is not a valid number or can't be parsed...
    except ValueError:
        print("Invalid.")


# This is the entry point for the code (where it starts)
if __name__ == "__main__":
    main()
