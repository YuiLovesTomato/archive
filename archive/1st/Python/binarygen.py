def abcd(x, n):
    a1 = x % n #첫 자리 수
    x1 = x - a1 #########################
    if(type(x) == int):
        a2 = x1 % n**2
        x2 = x1 - a2
        asd = "%d%d" %(a2,a1) #가조립, for를 써야 할 거 같은데 변수명 가지고 못 만들겠음.
        #print(asd)
        
abcd(15,2) # 0b1111

def abc(x, n):
    y = 0
    for a in range(8, 0, -1):
        b = x % (n**a)
        x = b 
        if (b != 0):
            y = str(b)
    print(y)
        
abc(15,2)
