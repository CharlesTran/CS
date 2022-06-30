import time
import random

matrix1, matrix2 = [], []
N1, M1, N2, M2 = map(int, input("Please input the size of matrix:").split())
while (M1 != N2):
    print("Invalid Input! Please input again:")
    N1, M1, N2, M2 = map(int, input().split())

start = time.time()
nums=[]
for i in range(N1):
    for j in range(M1):
        nums.append(random.randrange(100))
    matrix1.append(nums)
nums.clear()
for i in range(N2):
    for j in range(M2):
        nums.append(random.randrange(100))
    matrix2.append(nums)
# print(matrix1)
# print(matrix2)

ans = []
for i in range(N1):
    nums = []
    for j in range(M2):
        sum = 0
        for k in range(M1):
            sum += matrix1[i][k] * matrix2[k][j]
        nums.append(sum)
    ans.append(nums)
end = time.time()
print(ans)
print('time cost: ', end - start, 's')
