# -*- coding: utf-8 -*-
"""
Created on Mon Sep 17 19:23:34 2018

@author: YuiLovesTomato
"""

#<MATLAB을 이용한 선형대수학> 연습문제 1.5

import numpy as np

#1
A = np.array([[1,2],[3,4]])
B = np.array([[4,3],[2,1]])
AB = np.dot(A,B)

print(np.transpose(AB))
print(np.dot(np.transpose(A),np.transpose(B)))
print(np.dot(np.transpose(B),np.transpose(A)))

#2
#proved

#3
#a실수 b -1

#4
A = np.array([[1,2],[3,4]])
B = np.array([[5,6],[7,8]])

print(np.trace(np.dot(A,B)))
print(np.trace(np.dot(B,A)))


#5
A = np.array([['a','b'],['c','d']])
B = np.transpose(A)

print(A)
print(B)

