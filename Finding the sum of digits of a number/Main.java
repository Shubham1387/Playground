#include <stdio.h>
int main() {
  int n,sum=0;
  scanf("%d",&n);
  while(n!=0)
  {
    int rem=n%10;
    sum=sum+rem;
    n/=10;
  }
  printf("%d",sum);
	//Type your code
	return 0;
}