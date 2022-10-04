//insert sort using function
#include<stdio.h>

void insert_sort(int a[], int n){
int i=0, j=0, temp=0, k;
for(i=1; i<n; i++)
 { temp = a[i];
   j=i-1;
   while(a[j]>temp && j>=0)
	{ a[j+1] = a[j];
	  j = j-1;
	}
   a[j+1]=temp;
 }

for(k=0; k<n; k++)
 { printf("%d \t", a[k]);
 }

}

void main()
{ int i,j,n,a[5];

printf("\n Enter the size of array : ");
scanf("%d", &n);

printf("\n Enter the elements : \n");

for(i=0; i<n; i++)
{ scanf("%d", &a[i]);
}

insert_sort(a,n);
}
