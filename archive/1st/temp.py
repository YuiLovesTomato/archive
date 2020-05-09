#3
import numpy as np
from sympy import *

A = np.array([[1,1,-2],[2,-1,1],[-1,2,3]])
B = np.array([[1],[2],[4]])
print(A)
print(np.linalg.det(A))

#x1
A = np.array([[1,1,-2],[2,-1,1],[-1,2,3]])
for i in range(0,3):
    A[i,0] = B[i,0]

print(A)
print("x1 =",np.linalg.det(A)/-18)

#x2
A = np.array([[1,1,-2],[2,-1,1],[-1,2,3]])
for i in range(0,3):
    A[i,1] = B[i,0]

print(A)
print("x1 =",np.linalg.det(A)/-18)

#x3
A = np.array([[1,1,-2],[2,-1,1],[-1,2,3]])
for i in range(0,3):
    A[i,2] = B[i,0]

print(A)
print("x1 =",np.linalg.det(A)/-18)
