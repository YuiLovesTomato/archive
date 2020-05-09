li = [-6, 3, -2, 5, 1]
#[-6 -2 1 3 5] sort
print(li)

for a in reversed(range(len(li))): # 4 3 2 1 0

    for b in range(a):    #4: 0123, 3: 012, 2: 01, 1: 0

        if li[b] > li[b+1]:

            li[b], li[b+1] = li[b+1], li[b] #swap
            
print(li)

'''
len(li) = 5
range(len(li)) = range(5) = range(0, 5, 1), #★ 0 1 2 3 4
reverse() >> range(4,-1,-1) # 4 3 2 1 0, think with #★

a=4:
    b in range(0,4,1):
        [0~3] sort using [i+1] >> no index range error
a=3:
    ~
    ~
    ~
    
fin
    
'''