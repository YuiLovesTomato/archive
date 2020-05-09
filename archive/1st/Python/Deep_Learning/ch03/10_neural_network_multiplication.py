import numpy as np

X = np.array([1,2])
W = np.array([[1,3,5], [2, 4, 6]])
print(W, "\t", X)
Y = np.dot(X, W)
print(Y)