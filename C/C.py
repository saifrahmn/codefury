def solve():
    n, m = map(int, input().split())
    count = 0
    arr = []
    
    for i in range(n):
        row = input()
        arr.append(row)
        
        if i == n-1 and 'D' in row:
            count += 1
            
    last_row = arr[-1]
    for j in range(m):
        if last_row[j] == 'R':
            count += 1
    
    print(count)

def main():
    t = int(input())
    
    for i in range(t):
        solve()

if __name__ == '__main__':
    main()
