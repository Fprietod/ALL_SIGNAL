from itertools import zip_longest

xn=[1,4,5,9,-1,-9,-5]
xy=[1,5,2,9,0,-4,-3,-2]

suma=[]
xn.sort()
xy.sort()
resultado=[sum(n) for n in zip_longest(xn,xy, fillvalue=0)]
print(resultado)

multiplicacion=[]

resultadom=[a*b for a,b in zip_longest(xn,xy, fillvalue=0)]
print(resultadom)
