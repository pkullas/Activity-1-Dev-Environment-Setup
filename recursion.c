#include<stdio.h>
int mul(int n);
int main(){
    printf("mul of n no %d",mul(4));
    return 0;

}
int mul(int n){
    if(n==1){
        return 1;
    }
    else{
        return mul(n-1)*n;

    }
    }
