import java.util.Scanner;

class Main {
    static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        char[][] arr = new char[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.next().charAt(0);

                if (j == m - 1 && arr[i][j] == 'R') {
                    count++;
                }

                if (i == n - 1 && arr[i][j] == 'D') {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            solve();
        }
    }
}
