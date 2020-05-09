# -*- coding: utf-8 -*-
"""
Created on Mon Sep 17 22:18:16 2018

@author: YuiLovesTomato
"""

#<MATLAB을 이용한 선형대수학> 연습문제 1.6

import numpy as np

A = np.array([[1,4,7],[2,5,8],[3,6,9]])

E1 = np.array([[1,0,0],[0,1,0],[4,0,1]])
E2 = np.array([[0,1,0],[1,0,0],[0,0,1]])
E3 = np.array([[1,0,0],[0,1,0],[0,0,4]])

A1 = np.dot(A,E1)
A2 = np.dot(A,E2)
A3 = np.dot(A,E3)

print(A1)
print(A2)
print(A3)
print(np.linalg.det(A1))
print(np.linalg.det(A2))
print(np.linalg.det(A3))




