N=int(input())
M=N
i=0
while True:
    A=M%10
    B=M//10
    C=(A+B)%10
    M=(A*10)+C
    i+=1
    if M==N:
        print(i)
        break