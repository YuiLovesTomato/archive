li = [-6, 3,-2, 5, 1]
max_v = -100;
min_v = 100;

for kk in li:
    if kk <= min_v:
        min_v = kk
    if kk >= max_v:
        max_v = kk
            
lt = [min_v, max_v]
            
print(li)
print('max: ', max_v, 'min: ' , min_v)            
            