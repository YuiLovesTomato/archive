import numpy as np

x = np.array([-1.0, 1.0, 2.0])

def step_function(x):
    y = x > 0
    return y.astype(np.int) #interpreter
    
print(step_function(1))

#wtf???