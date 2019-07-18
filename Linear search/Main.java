#include<stdio.h>
int main()
{
  int n,a[30],i,b;
  scanf("%d",&n);
  for (i=0;i<n;i++)
    scanf("%d",&a[i]);
  scanf("%d",&b);
  for(i=0;i<n;i++)
  {
    if(a[i]==b)
    {
      printf("%d",i+1);
      break;
    }
  }
  if(i==n)
  {
    printf("%d isn't present in the array.",b);
  }
  
  //Type your code here
  return 0;
}