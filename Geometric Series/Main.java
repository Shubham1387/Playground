#include<iostream>
using namespace std;
int main()
{

    int a=1,b=1,n,i;
    cin>>n;
    if(n==1 || n==2)
    {



        cout<<1;
        return 0;
    }


    else
    {
        for(i=3;i<=n;i++)
        {
            if(i%2!=0)
                a=a*2;
            else
                b=b*3;
        }
    }
    if(n%2==0)
        cout<<b;
    else
        cout<<a;


}