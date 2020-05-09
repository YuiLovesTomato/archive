aaa = '0b11111111'
bbb = '0x0F'
#0x나 0b 같은건 쓰나마나인걸로...?
print(int(aaa,2) & int(bbb,16)) #비트연산
print(int(aaa,2) ^ int(bbb,16))

'''
1. 0b00001111
2. 0x11110000
'''