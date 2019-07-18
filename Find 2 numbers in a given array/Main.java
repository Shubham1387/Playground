#include<stdio.h>
int main()
{
  int n,a[50],i,b,c,b_ind=-1,c_ind=-1;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  scanf("%d%d",&b,&c);
  for(i=0;i<n;i++)
  {
    if(a[i]==b && b_ind==-1)
    {
      b_ind=i;
    }
    if(a[i]==c && c_ind==-1)
    {
      c_ind=i;
    }
  }
  printf("Element 1 index = %d\n",b_ind);
  printf("Element 2 index = %d\n",c_ind);

  	//type your code here
}