import numpy as np

a = np.array([[1,2,3],[4,5,6],[7,8,9]])
c = np.array([[1,2,3],[4,5,6],[10,14,18]])

e2 = np.array([[1,0,0],[0,1,0],[3,0,1]])

print(np.dot(e2,a))

e3 = np.array([[1,0,0],[0,1,0],[-3,0,1]])

print(np.dot(e3,c))