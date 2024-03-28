def owned_cat_and_dog(cat_years, dog_years):
    return [pet_helper(cat_years, 15, 9, 4),
            pet_helper(dog_years, 15, 9, 5)]


def pet_helper(pet_years: int, first_year: int, second_year: int, next_years: int) -> int:
    if pet_years < first_year:
        return 0

    res = 1

    pet_years -= first_year
    if pet_years >= second_year:
        pet_years -= second_year
        res += 1
    elif pet_years <= second_year:
        return res

    while pet_years >= next_years:
        pet_years -= next_years
        res += 1
    return res
