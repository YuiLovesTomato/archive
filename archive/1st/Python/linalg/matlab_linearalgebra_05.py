#예제 2.35

import numpy as np

A = np.array([[3,-2,-5],[2,5,4],[5,4,-4]])
B = np.array([[1],[11],[-3]])

print(A)
print(np.linalg.det(A))

A = np.array([[3,-2,-5],[2,5,4],[5,4,-4]])
A[0,0] = B[0,0]
A[1,0] = B[1,0]
A[2,0] = B[2,0]

print(A)
print(np.linalg.det(A)/-79)

A = np.array([[3,-2,-5],[2,5,4],[5,4,-4]])
A[0,1] = B[0,0]
A[1,1] = B[1,0]
A[2,1] = B[2,0]

print(A)
print(np.linalg.det(A)/-79)

A = np.array([[3,-2,-5],[2,5,4],[5,4,-4]])
A[0,2] = B[0,0]
A[1,2] = B[1,0]
A[2,2] = B[2,0]

print(A)
print(np.linalg.det(A)/-79)