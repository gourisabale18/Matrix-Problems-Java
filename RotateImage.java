Leet code Problem : 48
class RotateImage{
    public void rotate(int[][] matrix) {
       int n=matrix[0].length;
        //find transpose of matrix
        //diagonal element will not swap
        int temp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(i!=j)
                {
                    temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
    

        //Now to rotate clockwise by 90 , we have to replace the columns of matrices

   for(int i=0;i<n;i++)  
{  
//logic to reverse each row i.e 1D Array.    
int low = 0, high = n-1;  
while(low < high)  
{  
temp = matrix[i][low];  
matrix[i][low] = matrix[i][high];  
matrix[i][high] = temp;  
low++;  
high--;  
}  
}  
        
    }
}