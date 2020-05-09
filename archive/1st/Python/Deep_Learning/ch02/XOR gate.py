import numpy as np


'''
XOR GATE
'''

'''
XOR == NAND && OR
'''

'''
OR GATE
'''

def OR(x1,x2):
    w1, w2, theta = 0.5, 0.5, 0.4
    tmp= x1*w1 + w2*x2
    if tmp <= theta:
        return 0
    elif tmp > theta:
        return 1
    
'''
NAND GATE
'''

def NAND(x1,x2):
    w1, w2, theta = 0.5, 0.5, 0.7
    tmp= x1*w1 + w2*x2
    if tmp >= theta:
        return 0
    elif tmp < theta:
        return 1
    
'''
XOR GATE
'''

def XOR(x1, x2):
    a=NAND(x1,x2)
    b=OR(x1,x2)
    '''y = AND(a,b)가 간편하다'''
    if a&b == 1:
        return 1
    elif a&b == 0:
        return 0
    
print(XOR(0,0))
print(XOR(1,0))
print(XOR(1,0))
print(XOR(1,1))