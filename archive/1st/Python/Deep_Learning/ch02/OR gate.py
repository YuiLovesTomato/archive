import numpy as np


'''
OR GATE
'''

def OR(x1,x2):
    w1, w2, theta = 0.5, 0.5, 0.4
    tmp= x1*w1 + w2*x2
    if tmp <= theta:
        return 0
    elif tmp > theta:
        return 1
    
print(OR(0,0))
print(OR(1,0))
print(OR(1,0))
print(OR(1,1))


'''
sin 함수 만들 때 처럼, 0.1 간격으로 정의역을 구축한 다음 theta<0.5 같은 식으로 시작하면 퍼셉트론을 구현할 수 있을 지도 모르겠다
'''