def max_product(lst: [], n_largest_elements) -> int:
    sorted_lst = sorted(lst, reverse=True)
    res = 1
    for i in range(n_largest_elements):
        res *= sorted_lst[i]
    return res
