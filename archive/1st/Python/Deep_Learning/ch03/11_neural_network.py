import numpy as np
import matplotlib.pylab as plt

def sigmoid(x): #Sigmoid: S shape
    return 1 / (1 + np.exp(-x))

X = np.array([1.0, 0.5])  #노드

W1 = np.array([[0.1, 0.3, 0.5], [0.2, 0.4, 0.6]])  #가중치
B1 = np.array([0.1, 0.2, 0.3])  #편향
A1 = np.dot(X, W1) + B1    #A = XW + B

Z1 = sigmoid(A1)    # 0층 > 1층
print(Z1)

W2 = np.array([[0.1, 0.4], [0.2, 0.5], [0.3, 0.6]])
B2 = np.array([0.1, 0.2])
A2 = np.dot(Z1, W2) + B2
Z2 = sigmoid(A2)    #1층 > 2층

print(Z2)

def identify_function(x): #항등함수
    return x

W3 = np.array([[0.1, 0.3], [0.2, 0.4]])
B3 = np.array([0.1, 0.2])

A3 = np.dot(W3,Z2) + B3
Y = identify_function(A3)
print(Y)