import math

li = []
avgLi = []

for k in range (1,11):
    li.append(k)
    
sum=0

for k in li:
    sum += k
    
for k in range(len(li)):
    avgLiSum=0
    for b in range(k+1):
        avgLiSum += li[b]
    it = avgLiSum / (k+1)
    avgLi.append(it)
    
avg = sum/len(li)

top=0
for k in li:
    top += (k-avg)**2
    
var = top/len(li)

std = math.sqrt(var)

print(sum, avg, var, std)

print(li)
print(avgLi)
    