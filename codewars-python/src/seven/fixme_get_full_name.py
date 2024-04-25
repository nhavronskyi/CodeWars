class Dinglemouse(object):
    def __init__(self, first_name: str, last_name: str):
        self.first_name = first_name.replace(" ", "")
        self.last_name = last_name.replace(" ", "")

    def get_full_name(self) -> str:
        specifier = '' if self.first_name == "" or self.last_name == "" else ' '

        return self.first_name + specifier + self.last_name
