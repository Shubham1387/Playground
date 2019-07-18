#include<stdio.h>
int main()
{
  long int n,i,f=1;
  scanf("%ld",&n);
  if(n<=1)
    printf("%ld",n);
  else
  {
  for(i=1;i<=n;i++)
  {
    f=f*i;
  }
  printf("%ld",f);
  }
	//your code here
}