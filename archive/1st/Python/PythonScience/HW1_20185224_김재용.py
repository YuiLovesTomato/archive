import turtle
import math

a = turtle.Turtle()
a.width(2)


forwardLength = int(input("forward 길이: "))
pentaLength = forwardLength/-2*math.cos(72)


for i in range(5):
    for j in range(3):
        if j==1:
            a.color('red')
            a.forward(pentaLength)
        else:
            a.color('black')
            a.forward(0.8*forwardLength)
    a.left(144)
