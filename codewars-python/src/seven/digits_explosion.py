def digits_explosion(s):
    res = ""
    for a in s:
        res += a * int(a)
    return res
