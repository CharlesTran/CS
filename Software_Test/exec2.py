y, m, d = map(int, input("Please Input: ").split("-"))
s1 = {1, 3, 5, 7, 8, 10, 12}
s2 = {4, 6, 9, 11}
while 1:
    if 1970 <= y <= 2050:
        if m in s1 and 1 <= d <= 31:
            break
        elif m in s2 and 1 <= d <= 30:
            break
        elif m == 2 and (y % 4 != 0 or (y % 100 == 0 and y % 400 != 0)) and 1 <= d <= 28:
            break
        elif m == 2 and ((y % 4 == 0 and y % 100 != 0) or y % 400 == 0) and 1 <= d <= 29:
            break
        else:
            print("Input Error!")
            y, m, d = map(int, input("Please input again:").split("-"))
    else:
        print("Input Error!")
        y, m, d = map(int, input("Please input again:").split("-"))
if m in s1:
    d = d + 1
    if d > 31:
        d = 1
        m = m + 1
        if m > 12:
            m = 1
            y += 1
elif m in s2:
    d = d + 1
    if d == 31:
        d = 1
        m = m + 1
        if m > 12:
            m = 1
            y += 1
elif y % 400 == 0 or (y % 4 == 0 and y % 100 != 0):
    d = d + 1
    if d == 30:
        d = 1
        m += 1
else:
    d += 1
    if d == 29:
        d = 1
        m += 1
print(str(y) + '-' + str(m) + '-' + str(d))
