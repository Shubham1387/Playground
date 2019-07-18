#include<stdio.h>
#include<math.h>
int main()
{
  float a,b;
  scanf("%f%f",&a,&b);
  float c=pow(a,2) + pow(b,2);
  float d=sqrt(c);
  printf("%.2f",d);
  //Type your code here
  return 0;
}