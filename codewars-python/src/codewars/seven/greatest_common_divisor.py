def my_gcd(x, y):
    return x if y == 0 else my_gcd(y, x % y)
