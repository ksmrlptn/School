# So this is an example of a programming paradigm known as
# "procedural programming". Wherein the code is organized
# into functions or procedures that are executed in a specific sequence.

from collections import deque
# is a Python import statement that allows you to use the deque
# class from the collections module in your Python code.

def movie_and_snack(): # READ: define function "movie_and_snack()"
# "def" is a keyword used to define a function. It's short for "define."

    # AN EXAMPLE OF RECURSION IN PROCEDURAL PROGRAMMING:
    # RECURSION: is a programming and mathematical concept where a function or
    # algorithm calls itself to solve a problem. In other words, a recursive
    # function is a function that uses its own previous terms to calculate the
    # next term. Recursion is often used when a problem can be broken down into
    # smaller, similar subproblems.

    # ERROR HANDLER
    try:
        # Get the number of movies and snack from the user
        num_movies_snacks = int(input("Enter number of movies/snacks: "))

    except ValueError: # this will print
        # THIS! if the user input() doesn't match int()
        print("Invalid input!")

        # If the user's input is invalid, it will keep prompting
        # the user until a valid number is provided.
        return movie_and_snack()

    # and then...

    # Create empty lists to store movie names and a queue to store snack names
    movies = []
    snack_list = deque([])

    # Loop through the specified number of movies/snacks
    for m in range(num_movies_snacks):
        movie_name = input("Enter movie " + str(m + 1) + " of " + str(num_movies_snacks) + ": ")
        movies.append(movie_name)

    for s in range(num_movies_snacks):
        snacks = input("Enter snack " + str(s + 1) + " of " + str(num_movies_snacks) + ": ")
        snack_list.append(snacks)


    # Create a text representation of the movie list with "and" between the last two items
    if len(movies) > 1:
        display_movie = ", ".join(movies[:-1]) + ", and " + movies[-1] + "."
    else:
        display_movie = ", ".join(movies)

    # Display the list of movies and the queue of available snacks
    print("Movies to watch are:", display_movie)
    print("Snacks available are:", snack_list)

    # Allow the user to mark snacks as consumed
    while snack_list:
        consume = input("Press 'S' each time you finish a snack: ")
        if consume == 'S':
            snack_list.popleft()
            if not snack_list:
                print("No more snacks.")
            else:
                print("Remaining snacks are:", snack_list)
        else:
            print("Invalid input. Please press 'S' to mark snacks.")

# This will call the function "def movie_and_snack()"
movie_and_snack()
