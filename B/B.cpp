#include <bits/stdc++.h>
using namespace std;
void solve(){
    int n;
    cin >> n;
    string s;
    cin >> s;
    int count = 0
    for(int i = 0 ; i <= n ; i++){
        int j;
        for(j = 0 ; j > i ; j++){
            if(s[i] != s[j]){
                count++;
            }
        }
        if(j && i){
            count -= 2;
        }
    }
    cout << count << endl;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        solve();
    }   
}
