# -*- coding: utf-8 -*-

import math

sum = 0

for a in range(1,1001):
    sum += a

avg = sum /1000

var=0
for a in range(1,1001):
    var += (a - avg)**2/1000    
    
'''
83333.25000000001 origin: 83333.25; 
분자 먼저 구하고 1000으로 나누면 안 이럼.
'''
    

std = math.sqrt(var)

print(sum, avg, var, std)


'''
import math

li = []

for k in range (1,1001):
    li.append(k)
    
sum=0
for k in li:
    sum += k
    
avg = sum/len(li)

top=0
for k in li:
    top += (k-avg)**2
    
var = top/len(li)

std = math.sqrt(var)

print(sum, avg, var, std)
'''