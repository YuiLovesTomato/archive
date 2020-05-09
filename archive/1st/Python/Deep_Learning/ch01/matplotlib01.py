import numpy as np
import matplotlib.pyplot as plt

x=np.arange(0, 13, 0.1)
y=np.sin(x)

plt.plot(x,y)
plt.show()

a=np.arange(0, 13, 0.1)
b=np.cos(x)

plt.plot(a,b)
plt.show()

c=np.arange(0, 13, 0.1)
d=np.log(x)

plt.plot(c,d)
plt.show()