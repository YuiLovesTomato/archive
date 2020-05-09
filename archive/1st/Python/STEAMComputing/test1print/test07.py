print(format(int("%d" % 65),'b'))
#format(a,b)인데 a는 고 b는 b나 o나 x 이다. %d는 왜 자꾸 쓰지?

print('123'.zfill(8))
#00000123

print( format( int("%d" % 65) , 'b').zfill(8) )

'''
int ("65")를 계산하면 걍 65(숫자)
format (65,'b')는 01000001.
거기에 zfill(8)을 하는데 달라진 건 없음.
'''

print( format( int("%d" % 65) , 'o').zfill(8) )
print( format( int("%d" % 65) , 'x').zfill(8) )

#왜 함수를 이따구로 만들었지? ㅇㅎ b o x 말고도 05d 같은게 있다


print( format( int("%d" % 65) , '05f').zfill(8) )#ㅋㅋ?
print( format( int("%d" % 65) , '05d').zfill(8) )