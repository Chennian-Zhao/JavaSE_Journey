def range_result(stud_id, results):
    grades = []
    for result in results:
        if result[1] == stud_id:
            grades.append(result[2])
    if grades:
        return max(grades) - min(grades)
    else:
        return 0
results = [
    ['Database', 101028, 65],
    ['Database', 101022, 80],
    ['Operating systems', 201028, 61],
    ['Operating systems', 201022, 59],
    ['Java Fundamentals', 101022, 85],
    ['Mathematics', 101022, 71],
    ['Mathematics', 493968, 67],
    ['Information systems', 523123, 75]
]
print(range_result(101022, results)) 
print(range_result(101028, results))  