def stone_pick(arr: list[str]):
    cobblestone = 0
    sticks = 0
    res = 0
    for e in arr:
        if e == "Cobblestone":
            cobblestone += 1
        elif e == "Sticks":
            sticks += 1
        elif e == "Wood":
            sticks += 4

    while cobblestone >= 3:
        if sticks >= 2:
            cobblestone -= 3
            sticks -= 2
            res += 1
        else:
            return res
    return res
