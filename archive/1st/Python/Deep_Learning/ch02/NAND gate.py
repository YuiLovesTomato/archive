import numpy as np


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
    
print(NAND(0,0))
print(NAND(1,0))
print(NAND(1,0))
print(NAND(1,1))