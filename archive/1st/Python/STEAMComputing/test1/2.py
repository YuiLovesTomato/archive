li =[-6, 3, -2 ,5, 1]

tmp = li[4]
li[4] = li[3]
li[3] = li[2]
li[2] = li[1]
li[1] = li[0]
li[0] = tmp

print(li)