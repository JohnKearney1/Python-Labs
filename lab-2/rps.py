# rps.py
# In this problem, we will design a basic rock paper scissors game that can be played with the computer.
# In it's simplest terms, two players choose rock, paper or scissors simultaneously.

# WAYS TO IMPROVE THIS CODE:
# Add a loop to the main function so that the game repeats itself until exited by the user
# Add error checking. This code relies on the assumption that the user will never enter anything
# other than `r` `p` or `s`. Try catch blocks would be the easiest solution.

# import method to generate random numbers
import random

# This method takes the player's input and the computer's choice then returns the winner as an integer 0-2
# 0 - Tie
# 1 - Computer Win
# 2 - Player Win
def rps(playerChoice, computerChoice):

    winner = ""

    # rule out tie-cases
    if playerChoice == computerChoice:
        winner = "Tie Game!\nComputer chose: " + computerChoice + "\nYou chose: " + playerChoice

    # rock possibilities
    if playerChoice == "r":
        if computerChoice == "p":
            winner = "Computer Win! (computer chose paper)"
        if computerChoice == "s":
            winner = "Player Win! (computer chose scissors)"

    # paper possibilities
    if playerChoice == "p":
        if computerChoice == "s":
            winner = "Computer Win! (computer chose scissors)"
        if computerChoice == "r":
            winner = "Player Win! (computer chose rock)"

    # scissors possibilities
    if playerChoice == "s":
        if computerChoice == "r":
            winner = "Computer Win! (computer chose rock)"
        if computerChoice == "p":
            winner = "Player Win! (computer chose paper)"

    return winner


# This method chooses a random move for the computer
def cpuMove():
    # choose a random number between 1 & 3
    n = random.randint(0, 2)

    # Initialize a variable to hold the move string
    move = ""

    # translate the number to a string corresponding with a move
    if n == 0:
        move = "r"
    if n == 1:
        move = "p"
    if n == 2:
        move = "s"

    # return the string containing the computer's move
    return move


# Main body (order of macro operations)
def main():

    # collect the user's choice and ensure it's lowercase
    playerChoice = input("Welcome to Rock-Paper-Scissors!\nType `r`, `p`, or `s` to choose: ").lower()

    # have the cpu generate a move (returns string)
    computerChoice = cpuMove()

    # compare the two moves and store the result in a variable called winner (string)
    winner = rps(playerChoice=playerChoice, computerChoice=computerChoice)

    # print the result
    print(winner)


# This is the entry point for the code (where it starts)
if __name__ == "__main__":
    main()
