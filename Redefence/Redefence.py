
text="hello"
key="key"

def encrypt(plaintext,key):
    textlen=len(plaintext)
    rows= len(key)
    matrica=[['' for _ in range(textlen)]for _ in range(rows)]
    dict={}
    direction=True

    index=0
    cindex=0
    matrica[0][index]=plaintext[cindex]
    cindex+=1
    for char in range(len(plaintext)):
        if cindex!=len(plaintext):
            if direction:
                for i in range(1,rows):
                    if i==rows-1:
                        matrica[i][index] = plaintext[cindex]
                        cindex += 1
                        index+=1
                        direction=False
                    elif cindex == len(text) - 1:
                        matrica[i][index] = plaintext[cindex]
                        break
                    else:
                        matrica[i][index] = plaintext[cindex]
                        cindex += 1


            else:
                for k in range(rows-2,-1,-1):
                    if k==0:
                        matrica[k][index] = plaintext[cindex]
                        cindex += 1
                        index += 1
                        direction = True
                    elif cindex==len(plaintext)-1:
                        matrica[k][index] = plaintext[cindex]
                        break
                    else:
                        matrica[k][index] = plaintext[cindex]
                        cindex += 1
        else:
            break
    index=0
    for char in key:
        dict[char]=matrica[index]
        index+=1
    myKeys = list(dict.keys())
    myKeys.sort()
    sorted_dict = {i: dict[i] for i in myKeys}
    result = ''.join(''.join(filter(lambda x: x != '', v)) for v in sorted_dict.values())
    return result

def decrypt(cipher,key):
    textlen = len(cipher)
    rows = len(key)
    rail = [['' for _ in range(textlen)] for _ in range(rows)]#[e,l],[h,o],[l]
    #TODO me gjet ni metode qe e bon secilin varg mrenda matrices me sa vlera duhet me i pas
    row, col =0 ,0
    for i in range(len(cipher)):
        if row == 0:
            dir_down = True
        if row == rows - 1:
            dir_down = False

        # place the marker
        rail[row][col] = '*'
        col += 1

        # find the next row
        # using direction flag
        if dir_down:
            row += 1
        else:
            row -= 1
    cindex=0
    for r in range(rows):
        for i in range(len(cipher)):
            if rail[r][i]=="*":
                rail[r][i]=cipher[cindex]
                cindex+=1

    dict={}
    index =0
    for i, char in enumerate(sorted(key)):
        dict[char]=rail[i]




ciphertext=encrypt(text,key)
print(ciphertext)
palintext=decrypt(ciphertext,key)
