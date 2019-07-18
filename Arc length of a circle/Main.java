#include<stdio.h>
int main()
{
  float a,b;
  scanf("%f%f",&a,&b);
  float l=2*3.14*a*(b/360);
  printf("%.2f",l);
  return 0;
}