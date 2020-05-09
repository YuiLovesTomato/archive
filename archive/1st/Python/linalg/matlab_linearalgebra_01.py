# -*- coding: utf-8 -*-
"""
Created on Mon Sep 10 19:24:40 2018

@author: YuiLovesTomato
"""

#<MATLAB을 이용한 선형대수학> 예제 1.16 ~ 1.18

import numpy as np

#1.16
A = np.array([[5,2,3],[2,7,5]])
B = np.array([[3,5],[0,4],[2,6]])

AB = np.dot(A,B)
BA = np.dot(B,A)

print("------1.16------")
print(AB)
print(BA)


#1.17
'''
수학과/컴퓨터학과/정보학과
PC[[8 5 5]
프린터[5 6 4]
스캐너[6 7 6]]

    PC/프린터/스캐너
(가)업체[[120  35  28]
(나)업체[125  32  25]]
'''

A = np.array([[8,5,5],[5,6,4],[6,7,6]])
B = np.array([[120,35,28],[125,32,25]])

print("------1.17------")
#1. 수학과에서 (가) 업체 물건을 일괄 구매: A[:,0] * B[0,:]
print(np.dot(A[:,0],B[0,:]))
#2. 컴퓨터학과 (가)
print(np.dot(A[:,1],B[0,:]))
#3. 정보학과 (가)
print(np.dot(A[:,2],B[0,:]))
#4. 컴퓨터학과 (나)
print(np.dot(A[:,0],B[1,:]))
#5. 정보학과 (나)
print(np.dot(A[:,2],B[1,:]))
#6. 컴퓨터학과 (나)
print(np.dot(A[:,1],B[1,:]))
#7. BA 곱
print(np.dot(B,A))



#1.18
#수학과 (가), (나)
print("------1.18------")
print(np.dot(B,A[:,0]))

'''
행 열좀 그만 헷갈렸으면^^
'''