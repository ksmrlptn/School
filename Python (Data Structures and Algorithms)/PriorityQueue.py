from queue import PriorityQueue


def add():
    try:
        num = int(input("Enter number: "))
    except ValueError:
        print("invalid input!")
        return add()

    nickname = PriorityQueue()

    for i in range(num):
        classmate = input("Enter name of your classmate: ")
        nickname.put(classmate)

    while not nickname.empty():
        classmate = nickname.get()
        greet = input(f"\npress 'H' to say 'Hi' to {classmate}: ")

        if greet == "H":
            print(f"Hi {classmate}")
        else:
            print("Invalid input!")

    if nickname.empty():
        print("\nDone")


add()
