vowels = {"a":"ah","e":"eh", "i":"ee","o":"oh","u":"oo"}
doubleVowels = {"ai":"eye","ae":"eye","ao":"ow","au":"ow","ei":"ay","eu":"eh-oo","iu":"ew","oi":"oyo","ou":"ow","ui":"ooey"}
cons =  {"w","p","h","k","m","l","n"}

w = "w"
p = 0

valid_chars = list(vowels.keys())+ list(doubleVowels.keys()) + list(cons) + ["W"]

word = str(input("insert word here:"))

def validate(word):
    for letter in word:
        if letter not in valid_chars:
            print("invalid character")
            word = str(input("insert word here:"))
        elif letter in valid_chars:
            pronounce(word)

        return True

  

def pronounce(word):
    p = 0
    output = ""
    i = 0
    while i < len(word):
        if i+1 < len(word) and word[i] in doubleVowels:
            output += doubleVowels[word[i] + word[i+1]] + "-"
            i += 1

        elif i + 1 < len(word) and word[i] in vowels and word[i]+ word[i+1] not in doubleVowels:
            output += vowels[word[i]] + "-"
            i += 1 

        elif word[i] in cons:
            output += word[i] 
            i += 1

        elif i==0 and word[i] == w:
            output += w +"-"
            i += 1

        elif i+1  <len(word) and (word[i] == "i" or word[i] == "e") and word [i+1] == w:
            output += w + "-"
            i+= 2

        elif i+1  < len(word) and (word[i] == "i" or word[i] == "e") and word[i+1]== w:
            output += "v" + "-"
            i += 1

        elif i+1 < len(word) and (word[i] == "u" or word[i] == "o") and word[i+1] == w:
            output += "w" +"-"
            i += 2

        elif i+1 < len(word) and word[i] == "l" and word [i+1] in vowels:
            output += "l" + "-"
            i += 1

        else:
            output += word[i] + "-"
            i += 1

    print(output[:-1])

validate(word)
pronounce(word)


