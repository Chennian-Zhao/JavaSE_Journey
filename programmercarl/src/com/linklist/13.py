def merge_lists(list1, list2):
    merged_list = []
    for i in range(len(list1)):
        merged_list.append(list1[i])
    for i in range(len(list2)):
        merged_list.append(list2[i])
    return merged_list
list1 = [1, 2, 3]
list2 = [4, 5, 6]
result = merge_lists(list1, list2)
print(result) 