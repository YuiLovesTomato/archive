def drawResult(x,y,o):
    
    def begopeda(a, b):
        print(b, a.ljust(28,' '), b)
    
    def gwajehagisilta(n):
        b = "{}{}{}".format(x,o[n],y)
        a = "{:5}{:>4}{:>4}{:>4}{:>7}".format(x,o[n], y,'=', eval(b))
        begopeda(a,"|")
        
    print("Result".center(32,'-'))
    
    begopeda("","|")
    
    i=0
    for i in range(4):
        gwajehagisilta(i)
        
    begopeda("","|")
    
    print("-"*32)


    
drawResult(5,3,('+','-','*','//'))
drawResult(13,4,('**','&','^','|'))