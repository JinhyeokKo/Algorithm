a=list(range(1,10001))
b=[]
for i in a:
    for l in str(i):
        i+=int(l)
    if i<10001:
        b.append(i)
c=set(a)-set(b)
for i in sorted(c):
    print(i)