"""
h(x) =
    x (x>0)
    0 (x<=0)
"""
import numpy as np

def relu(x):
    return np.maximum(0, x) #returns bigger one

print(relu(5))