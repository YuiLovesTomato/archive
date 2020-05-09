Li = [1, 2, 3, 4]

print(Li)


                        #튜플 없이 사용

temp = Li[3]
Li[3] = Li[0]
Li[0] = temp

print(Li)


                        #Pythonic, 튜플의 사용
(Li[0], Li[3]) = (Li[3], Li[0])



print(Li)


                    #def myswap (without swap)
def myswap(x,y,li):
    
    Li[x],Li[y] = Li[y],Li[x]
    



myswap(0,3,Li)
print(Li)