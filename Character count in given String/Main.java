#include<stdio.h>
#include<string.h>
int main()
{
  char c[50];
  int d,i,ct=1;
  scanf("%s",c);
  d=strlen(c);
  if(d>20)
    printf("Invalid Input");
  else
  {
    
    for(i=0;c[i]!=0;i++)
    {
      if(c[i]==c[i+1])
        ct++;
      else
      {
        printf("%c%d",c[i],ct);
       ct=1;
      }
    }
  }
      
	//type your code here
}