#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  while(n>=100)
  {
    n/=10;
  }
    int b=n%10;
    printf("%d",b);
	//Type your code
	return 0;
}