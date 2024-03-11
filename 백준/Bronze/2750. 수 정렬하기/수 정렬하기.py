N = int(input())
arr = []
for i in range(N):
    while True:
        num = int(input())
        if num not in arr:
            arr.append(num)
            break
arr.sort()
for i in arr:
    print(i)