aaa = '111.11'
bbb = '12.11'

print(eval(aaa + '+' + bbb)) 
#eval 안에 있는 건 문자열이여야 한다.
#즉 eval("111.11 + 12.11")으로 만들어 준 것.
print(float(aaa) + float(bbb))