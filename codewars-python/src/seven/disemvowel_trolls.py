def disemvowel(string_: str) -> str:
    res = ''
    vowels = ['a', 'e', 'i', 'o', 'u']
    for char in string_:
        if char.lower() not in vowels:
            res += char
    return res
