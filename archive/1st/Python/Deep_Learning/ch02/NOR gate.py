import numpy as np


'''
NOR GATE
'''

def NOR(x1,x2):
    w1, w2, theta = 0.5, 0.5, 0.4
    tmp= x1*w1 + w2*x2
    if tmp >= theta:
        return 0
    elif tmp < theta:
        return 1
    
print(NOR(0,0))
print(NOR(1,0))
print(NOR(1,0))
print(NOR(1,1))