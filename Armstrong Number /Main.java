#include <stdio.h>
#include <math.h>
int main() {
  int a,sum=0;
  scanf("%d",&a);
  int z=a;
  int digits=(int) log10(a);
  int d=digits+1;
  while(a>0)
  {
    int rem=a%10;
    sum=sum+pow(rem,d);
    a/=10;
  }
  if(z==sum)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
	//Type your code
	return 0;
}