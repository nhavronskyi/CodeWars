def to_industrial(time):
    if isinstance(time, int):
        return round(time / 60, 2)

    s = time.split(":")
    res = float(s[0]) + float(s[1]) / 60
    return round(res, 2)


def to_normal(time):
    s = str(time).split(".")
    res = float("0." + s[1]) * 60

    res = round(res)
    if res == 60:
        return str(int(s[0]) + 1) + ":00"

    res = str(res) if res > 10 else "0" + str(res)
    return s[0] + ":" + res
