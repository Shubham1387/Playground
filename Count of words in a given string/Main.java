#include<stdio.h>
#include<string.h>
int main()
{
  char str[200];
  int i,c=0;
  scanf("%[^\n]s",str);
  for(i=0;str[i]!='\0';i++)
  {
    if(str[i]==' ')
      c++;
  }
  printf("%d",c+1);
  //Type your code here
  
}