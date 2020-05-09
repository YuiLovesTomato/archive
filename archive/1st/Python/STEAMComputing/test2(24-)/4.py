var = (30, 20, 10, 15, 90, 95, 40)

sum = 0; avg = 0 # 초기화방법 알아두기

for a in range (0,len(var)): #(0,var)
    sum += var[a]            #sum += var

avg = sum / len(var)

print(sum, avg)