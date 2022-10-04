//bubble sort using function
#include<stdio.h>

void bubble(int a[],int n)
{
    int temp,i,j,k;
    for(i=1; i<n; i++)
    {
        for(j=0; j<n-i; j++)
        {
            if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
        printf("\n After Pass %d\n",i);
        for(k=0; k<n; k++)
         {
             printf("%d    ",a[k]);
         }
    }
}
void main()
{
    int a[10],n,i;
    printf("\n enter the no of elements : ");
    scanf("%d",&n);
    printf("\n enter the elements : \n");
    for(i=0; i<n; i++)
     {  scanf("%d",&a[i]);
     }
    bubble(a,n);
}
