#include<stdio.h>
int main()
{
  int n,a[20],i;
  scanf("%d",&n);
  for(i=0;n>0;i++)
  {
    a[i]=n%8;
    n=n/8;
  }
  for(i=i-1;i>=0;i--)
    printf("%d",a[i]);
  //Type your code here
  return 0;
}