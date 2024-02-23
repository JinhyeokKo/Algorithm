C=int(input())
for l in range(C):
    N=list(map(int,input().split()))
    A=sum(N[1::])/N[0]
    B=0
    for i in N[1::]:
        if i>A:
            B+=1
    C=B/N[0]*100
    print(f"{C:.3f}%")