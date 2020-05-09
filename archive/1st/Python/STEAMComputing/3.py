#st1
st1 = "Result"
st1 = st1.center(30,'-')
    
#var
a = 3334
b = 53333333
#c = str(a) + "*" + str(b) + " = " + str(a*b)
c = "%d*%d=%d" % (a,b,a*b)
c = c.center(28,' ') #ljust, rjust도 가능
    
#output

print(st1)
    
print('|' + ' '*28 + '|')
print('|' + ' '*28 + '|')
    
print('|' + c + '|')
    
print('|' + ' '*28 + '|')
print('|' + ' '*28 + '|')
    
print('-'*30)