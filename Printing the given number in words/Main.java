#include<stdio.h>
int main()
{
  int option;
  scanf("%d",&option);
  switch(option)
  {
    case 1:
      printf("One");
      break;
    case 2:
      printf("Two");
      break;
    case 3:
      printf("Three");
      break;
    case 4:
      printf("Four");
      break;
    case 5:
      printf("Five");
      break;
    default:
      printf("Invalid");
  }
  //Type your code here
  return 0;
}