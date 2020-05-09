import math

li = []
avg = []

for k in range (1,1001):
    li.append(k)
    
sum=0
for k in li:
    sum += k
    

for k in li:
    avg = sum/len(li)

top=0
for k in li:
    top += (k-avg)**2
    
var = top/len(li)

std = math.sqrt(var)

print(sum, avg, var, std)
    