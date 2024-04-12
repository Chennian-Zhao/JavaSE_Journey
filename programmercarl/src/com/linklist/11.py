def rev_diag_elems_greater_than(table, x):
    length = len(table)
    for i in range(length):
        if table[length - 1 - i][i] <= x:
            return False
    return True
table = [
    [0, 0, 1],
    [0, 1, 0],
    [1, 0, 0]
]
print(rev_diag_elems_greater_than(table, 0.5))  # 输出: True

table = [
    [0.1, 0.0, 1.0],
    [0.5, -1.0, 2.0],
    [0.5, -4.0, 5.3]
]
print(rev_diag_elems_greater_than(table, 0))  # 输出: False