import random; 



randomNum = random.randint(0,10)
guessedCorrectly = 0
previousGuess = ""
guesses = 0
while(guessedCorrectly ==0):
    userInp = input('Please input a number between 0-10: ')
    userInp = int(userInp)
    if(userInp == previousGuess):
        print("Please input a new number")
        continue
    guesses = guesses + 1
    if(userInp < randomNum):
        print("Too Small")
    if(userInp > randomNum):
        print("Too Large")
    if(userInp == randomNum):
        print("You guessed correctly in ", guesses, " try")
        guessedCorrectly = 1
    previousGuess = userInp

