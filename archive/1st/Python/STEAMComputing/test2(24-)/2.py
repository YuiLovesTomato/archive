li = [-6, 3, -2, 5, 1]
#[-6 -2 1 3 5] max min

min_v = 100;
max_v = -100;

for k in li:
    if k <= min_v:
        min_v = k
    if k >= max_v:
        max_v = k

print(min_v, max_v)