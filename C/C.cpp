#include <bits/stdc++.h>
using namespace std;


void solve(){
    
    int n,m , count = 0;
    cin >> n >> m;

    char arr[n][m];

    for(int i = 0 ; i < n ; i++){

        for(int j = 0 ; j < m ; j++){
            cin >> arr[i][j];

            if(j == m || arr[i][j] == 'D'){
                count++;
            }

            if(i == n || arr[i][j] == 'R'){
                count++;
            }
        }
    }

    cout << count << endl;

}


int main(){
    
   // solve();
    
    
    int t;
    cin >> t;

    while(t--){
        solve();
    }
    
    
}
