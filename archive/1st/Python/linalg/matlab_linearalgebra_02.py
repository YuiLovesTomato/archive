# -*- coding: utf-8 -*-
"""
Created on Mon Sep 10 21:09:02 2018

@author: YuiLovesTomato
"""

#<MATLAB을 이용한 선형대수학> 연습문제 1.4

import numpy as np

#1
#A.shape=(3.5), np.dot(A,B).shape=(3,7). B.shape=?
#ans = (5,7)
print("#1")
print("solved")

#2
A = np.array([[1,3,2],[4,5,7]])
B = np.array([[5,-3],[0,2],[4,7]])

print("#2")
print(np.dot(A,B))
print(np.dot(B,A))


#3
#Find k makes AB=BA.
k = 9
A = np.array([[7,4],[5,k]])
B = np.array([[3,-4],[-5,1]])
AB = np.dot(A,B)
BA = np.dot(B,A)

print("#3")
      
if np.array_equal(AB,BA):
    print("***k is 9***")
else:
    print("***k should be 9***")

print(AB)


#4
#find matrix B.
'''
a =
b =
c =
A = np.array([[5,-1,2],[2,1,3]])
B = np.array([[a],[b],[c]])
AB = np.array([[3],[-4]])
걍 풀지마
'''

print("#4")
      
#5
print("#5")
#solved

#6
print("#6")
A = np.array([[1,2],[0,1]])
A1 = np.array([[1,2],[0,1]])
print(A1)
A = np.dot(A,A1)
print(A)
A = np.dot(A,A1)
print(A)
#그냥 **이나 multiply로 하면 Broadcast로 계산하는 듯.


#7
A = np.array([[0,0,1,0],[0,0,0,1],[-1,0,0,0],[0,-1,0,0]])
A1 = np.array([[0,0,1,0],[0,0,0,1],[-1,0,0,0],[0,-1,0,0]])

print("#7")
print("1\n", A1)
A = np.dot(A1,A1)
print("2\n", A)
A = np.dot(A,A1)
print("3\n", A)
A = np.dot(A,A1)
print("4\n", A)
A = np.dot(A,A1)
print("5\n", A)
'''
np.multiply 가 아니라 np.dot으로 해야 정상적으로 계산이 된다
'''