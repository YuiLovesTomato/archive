#step1
li=[1,2,3,4,5]
primes=[]
index=0;

for i in li:
    
    error = 0;
    index = li[index] - 1;
    temp=[0,0];
    
    for j in range(2,i):
        if i%j==0:
            error+=1;
                
    if i==1:
        error=1;
            
    if error==0:
        temp[0] = index;
        temp[1] = i;

    temptuple = (temp[0], temp[1])
    if temptuple != (0,0):
        primes.append(temptuple);

    index+=1;
    
print(primes)

#step2: enumulate
li=[1,2,3,4,5]
primes=[]

for index,i in enumerate(li):
    error = 0;
    temp=[0,0];
    
    for j in range(2,i):
        if i%j==0:
            error+=1;
                
        
    if i==1:
        error=1;
            
    if error==0:
        temp[0]=index;
        temp[1] = i;
     
    temptuple = (temp[0], temp[1])
    if temptuple != (0,0):
        primes.append(temptuple);

print(primes)

#step3: function
def fprime(v1):
    primes=[]
    
    for index,i in enumerate(v1):
        error = 0;
        temp=[0,0];
        
        for j in range(2,i):
            if i%j==0:
                error+=1;               
        
        if i==1:
            error=1;
            
        if error==0:
            temp[0]=index;
            temp[1] = i;
        
        temptuple = (temp[0], temp[1])
        if temptuple != (0,0):
            primes.append(temptuple);    
        
    return primes;
        
print(fprime(li));


#step4: list comprehension

li=[1,2,3,4,5]
primes=[]

def isprime(v1):
    for n in range(2,v1):
        if v1%n==0:
            return 0;
        else:
            return 1;
    if v1==2:
        return 1;
        
primes = [(index,i) for index,i in enumerate(li) if isprime(i)==1]
print(primes)


#step5: numpy
li=[1,2,3,4,5]
#잘 모르겠습니다...


#step6: map & filter
li=[1,2,3,4,5]
primes=[]

def isprime(v1):
    for n in range(2,v1):
        if v1%n==0:
            return 0;
        else:
            return 1;
    if v1==2:
        return 1;

for i in li:
    if isprime(i)==1:
        primesbin = list(map(isprime,li))

primesbin[0]=0

for index,i in enumerate(primesbin):
    if i==1:
        primes.append((index,li[index]))
    
print(primes)

