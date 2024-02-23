N=int(input())
Y=[]
for i in range(1,N+1):
    if i < 100:
        Y.append(i)
    else:
        i=list(map(int,str(i)))
        if i[0]-i[1]==i[1]-i[2]:
            Y.append(i)
Y=list(map(str,Y))
print(len(Y))