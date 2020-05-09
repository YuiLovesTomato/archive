# -*- coding: utf-8 -*-

import math

li = []   #리스트

for k in range(1,1001):
    li.append(k)
    
#li = [  k for k in range(1,1001)]
     
sum1=0
for k in li:
    sum1 += k
  
avg = sum1 / len(li)


sum2 = 0

for k in li:
   sum2 += (k - avg)**2

var = sum2 / len(li)

std = math.sqrt(var)

print(sum1,avg,var,std)