a = int(input("Second: "))


def modlist(x,m,n):
    h = x//m
    min = (x%m)//n
    sec = (x%m)%n
    txt = [h, min, sec]
    return txt

print(modlist(a,3600,60))
