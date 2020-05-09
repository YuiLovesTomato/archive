#튜플의 중간값
var = (30, 20, 10, 15, 90, 40)

var = sorted(var)

if len(var)%2 == 1:
    print(var)
    t = var[len(var)//2]
    print(t)
elif len(var)%2 == 0:
    print(var)
    t = (var[len(var)//2] + var[len(var)//2 - 1]) /2
    print(t)
    
#짝수(ex.6) 에서 //2를 하면 3이다. [3]은 4번쨰에 있는 수다.