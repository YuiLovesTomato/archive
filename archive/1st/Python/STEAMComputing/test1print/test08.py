aaa = 'ab'

kkk = aaa.upper()

if ((kkk[0] >='0' and kkk[0] <='9') \
or (kkk[0] >= 'A' and kkk[0] <= 'F')) \
and ((kkk[1] >='0' and kkk[1] <='9') \
or (kkk[1] >= 'A' and kkk[1] <= 'F')):
    
    print(int(kkk,16))
else:
    print('입력값이 16진수가 아님')