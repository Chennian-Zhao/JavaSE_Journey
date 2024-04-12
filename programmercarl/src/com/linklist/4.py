degree = float(input())

if 0 < degree < 90:
    res = 'acute'
elif degree == 90:
    res = 'right'
elif 90 < degree < 180:
    res = 'obtuse'
else:
    res = 'Invalid degree'

print(res)