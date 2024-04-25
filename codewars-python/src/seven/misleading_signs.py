def gaslighting(shirt_word: str, your_word: str, friends_letters: str) -> bool:
    if shirt_word == your_word:
        return False

    for i, c in enumerate(shirt_word):  # enumerate(shirt_word) == range(len(shirt_word))
        if shirt_word[i] == your_word[i]:
            continue
        elif c in friends_letters or your_word[i] in friends_letters:
            return True

    return False
