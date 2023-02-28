def solve():
    n = int(input())
    s = input()
    count = 0
    
    for i in range(n):
        for j in range(i):
            if s[i] != s[j]:
                count += 1
        else:
            count -= 2
    
    print(count)

def main():
    t = int(input())
    
    for i in range(t):
        solve()
    
if __name__ == '__main__':
    main()
