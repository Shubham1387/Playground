#include <stdio.h>
int main() {
  int n,i,rem,fact=1,sum=0;
  scanf("%d",&n);
  int z=n;
  while(n>0)
  {
    fact=1;
    rem=n%10;
    for(i=1;i<=rem;i++)
    {
      fact=fact*i;
      
    }
    sum=sum+fact;
    n/=10;
  }
  if(sum==z)
  printf("Yes");
  else
  printf("No");
	//Type your code
	return 0;
}