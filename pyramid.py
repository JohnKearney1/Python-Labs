

def main():
    rows = int(input("How many rows to print: "))

    k = 0

    for i in range(1, rows + 1):
        for space in range(1, (rows - i) + 1):
            print(end=" ")

        while k != (2 * i - 1):
            print("*", end="")
            k += 1

        k = 0
        print()


# This is the entry point for the code (where it starts)
if __name__ == "__main__":
    main()
