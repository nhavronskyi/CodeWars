def gaslighting(shirt_word: str, your_word: str, friends_letters: str) -> bool:
    if shirt_word == your_word:
        return False

    shirt_word = shirt_word.replace(friends_letters, "")
    your_word = your_word.replace(friends_letters, "")

    return shirt_word == your_word or len(shirt_word) != len(your_word)
