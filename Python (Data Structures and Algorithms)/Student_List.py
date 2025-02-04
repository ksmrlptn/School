# 5.1: Ask three (3) of your classmates to enter their student number (key) and first name (value)
def data():
    try:
        print("Ask three (3) of your classmates to enter their student number (key) and first name (value)")

        details = {}

        for classmate in range(3):
            print(f"\nCLASSMATE {classmate + 1}")
            student = input("Classmate student number: ")
            while not (student.replace("-", "").isdigit() and len(student.replace("-", "")) in (7, 8) or student.isdigit()):
                print("invalid student number!\n")
                student = input("Classmate student number: ")

            first = input("Enter first name: ")
            details[student] = first

    #     try:
    #         student = input("Classmate student number: ")
    #         if student.replace("-", "").isdigit() and len(student.replace("-", "")) in (7, 8) or student.isdigit():
    #             return student
    #         else:
    #             print("Invalid student number!")
    #
    #     except ValueError:
    #         print("Invalid input! Please enter a valid student number.")
    #         return data()

    # print("Ask three (3) of your classmates to enter their student number (key) and first name (value)")

    # details = {}

    # for classmate in range(3):
    #     print(f"\nCLASSMATE {classmate + 1}")
    #     student = data()
    #     first = input("Enter first name: ")
    #     details[student] = first

# 5.2: Display the keys and values of the map.
        print("\nStudent List:")
        for key, value in details.items():
            print(key, value)

# 5.3: Delete the mapping of the third entry.
        if len(details) >= 3:
            index = list(details.keys())
            del details[index[2]]

        print("\nStudent List:", details)

# 5.4: Enter your student number and first name. This would be the nre third entry.
        print("\nEnter your student number and first name\n")
        student = input("Student number: ")
        while not (student.replace("-", "").isdigit() and len(student.replace("-", "")) in (7, 8) or student.isdigit()):
            print("invalid student number!\n")
            student = input("Student number: ")

        first = input("Enter first name: ")
        details[student] = first

    # print("\nEnter your student number and first name\n")
    # student = data()
    # first = input("Enter first name: ")
    # details[student] = first

# 5.5: Display the entries in separate line.
        print("\nStudent List:")
        for key, value in details.items():
            print(key, value)

    except KeyboardInterrupt:
        print("\nPorgram terminated")

data()
