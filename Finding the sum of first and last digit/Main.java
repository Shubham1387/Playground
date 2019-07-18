#include <stdio.h>
int main() {
  int n,sum=0;
  scanf("%d",&n);
  int last=n%10;
  int first=n;
  while(n>=10)
  {
    n/=10;
  }
  first=n;
  sum=first+last;
  printf("%d",sum);
	//Type your code
	return 0;
}