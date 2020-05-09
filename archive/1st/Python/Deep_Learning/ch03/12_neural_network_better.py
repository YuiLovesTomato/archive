import numpy as np
import matplotlib.pylab as plt

def sigmoid(x):     #시그모이드
    return 1 / (1 + np.exp(-x))

def identify_function(x): #항등함수
    return x

x = np.array([1.0, 0.5])

W1 = np.array([[0.1, 0.3, 0.5], [0.2, 0.4, 0.6]])  #가중치
B1 = np.array([0.1, 0.2, 0.3])  #편향
W2 = np.array([[0.1, 0.4], [0.2, 0.5], [0.3, 0.6]])
B2 = np.array([0.1, 0.2])
W3 = np.array([[0.1, 0.3], [0.2, 0.4]])
B3 = np.array([0.1, 0.2])

def init_network():
    network = {}    #딕셔너리: 인덱스가 문자열임
    network['W1'] = np.array([[0.1, 0.3, 0.5], [0.2, 0.4, 0.6]])
    network['b1'] = np.array([0.1, 0.2, 0.3])
    network['W2'] = np.array([[0.1, 0.4],[0.2, 0.5], [0.3, 0.6]])
    network['b2'] = np.array([0.1, 0.2])
    network['W3'] = np.array([[0.1, 0.3], [0.2, 0.4]])
    network['b3'] = np.array([0.1, 0.2])
    
    return network

#print(network)

def forward(network, x):
    W1, W2, W3 = network['W1'], network['W2'], network['W3']
    b1, b2, b3 = network['b1'], network['b2'], network['b3']
    
    a1 = np.dot(x, W1) + b1
    z1 = sigmoid(a1)
    a2 = np.dot(z1, W2) + b2
    z2 = sigmoid(a2)
    a3 = np.dot(z2, W3) + b3
    y =  identify_function(a3)
    
    return y

network = init_network()
x = np.array([1.0, 0.5])
y = forward(network, x)
print(y)    #[0.31682708 0.69627909]


#init_network는 가중치와 편향을 초기화하고 
#이들을 딕셔너리 변수 network에 저장합니다.

#network에는 각 층에 필요한 매개변수 W와 b를 저장합니다.

#함수 이름이 forward인 것은 순방향이라는 의미입니다.
#넘파이짱