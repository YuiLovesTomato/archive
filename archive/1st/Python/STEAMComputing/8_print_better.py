def printHLine(gap,val):

    print(val.center(gap,'-'))
    print("|"+' '*(gap-2)+'|')
    
    
def printBLine(gap):

    print("|"+' '*(gap-2)+'|')
    print('-'*gap)


def printCLine(gap,val):

    val = val.ljust((gap-2)," ")
    print("|"+val+'|')
    
#28의 공백에서 왼쪽으로 정렬. 그냥 center 하는 거에 비해 깔끔해진다


def opList(v1,v2,op):

    lt = []
    for kk in op:

        ss = '%5d %2s %5d' % (v1,kk,v2)
        #ss = '{:5}{:5}{:5}'.format(v1,kk,v2) #https://pyformat.info/
        lt.append('%s = %5d' % (ss,eval(ss)))
        #append : [1,2,3,[4,5,6]]
        #extend " [1,2,3,4,5,6]

    return lt


def drawResult(v1,v2,op):

    lt =[]
    lt = opList(v1,v2,('+','-','*','//'))
    gap = 30
    printHLine(gap,"Result")
    for kk in lt:
        printCLine(gap,kk)

    printBLine(gap)    

    

drawResult(4,234,('+','-','*','//'))









