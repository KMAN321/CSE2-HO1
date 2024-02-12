def calculate_area(length, width):
    area = length  * width
    # FOR DEBUGGING PURPOSES
    print(f"Calculating area with length {length} and width {width}")
    print(f"Intermediate result: {area}")
    return area

result = calculate_area(5, 3)
print(f"The area is: {result}")