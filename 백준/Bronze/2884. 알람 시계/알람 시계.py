H, M = map(int, input().split())
if H>0 and M-45<0:print(H-1, 60+(M-45))
elif H==0 and M-45<0:print(H+23, 60+(M-45))
else:print(H, M-45)
