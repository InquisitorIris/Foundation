print("Check whether a character is vowel or consonant")
vowel="aeiou"
char=input("Enter character: ")
if 'a'<=char<='z' or 'A'<=char<='Z':
    if char in vowel:
        print("Vowel!")
    else:
        print("Consonant")
else:
    print("This is not an alphabet")
