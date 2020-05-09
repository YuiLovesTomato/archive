sum = 0
for a in range(1,101,2):
    sum += a
    if (sum > 50):
        break
    
print(a, sum)