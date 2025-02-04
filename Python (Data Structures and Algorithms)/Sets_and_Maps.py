def length():
    try:
        len = int(input("Enter number of sets: "))
    except ValueError:
        print("Invalid input!")
        return length()

    sets = []

    for i in range(len):
        group = set(input(f"Enter {i + 1} set of groups separated by space: ").split())
        sets.append(group)

    for i, s in enumerate(sets, start=1):
        print(f"Group {i}: {s}")

    union_set = set().union(*sets)
    intersect_set = set.intersection(*sets)
    difference_set = sets[0].difference(*sets[1:])

    print(f"Union: {union_set}")
    print(f"Intersection: {intersect_set}")
    print(f"Difference: {difference_set}")


length()
