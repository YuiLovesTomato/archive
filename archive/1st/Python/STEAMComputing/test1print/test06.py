print(hex(65), oct(65), bin(65))
print("\n")

print(bin(int("%d" % 11,10)))

#int(11,10) 은 주어진 11(문자열)을 10진법으로 해석하라는 의미.
#int(a,b)에서 a는 문자열, b는 진수이다.

print(bin(int("%d" % 11,2)))
print(bin(int("%d" % 11,8)))