import java.util.*;
class SymmetricMatrix_Pgm5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j;

       System.out.println ("Enter the number of rows");
       m= sc.nextInt ();
       System.out.println ("Enter the number columns");
       n = sc.nextInt ();

        int[][] matrix=new int[m][n];
      
        System.out.println("Enter the elements of Matrix : ");
        for(i=0;i<m;i++)
            for(j=0;j<n;j++)
                matrix[i][j]=sc.nextInt();

        System.out.println("Elements of Matrix : ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
                System.out.print(matrix[i][j]+"\t");
            System.out.println();
        }

        if(m != n)
        {
            System.out.println("The given matrix is not a square matrix, so it can't be symmetric.");
        }
        else
        {
            boolean symmetric = true;
             
            for (i=0; i<m; i++)
            {
                for (j=0; j<n; j++)
                {
                    if(matrix[i][j] != matrix[j][i])
                    {
                        symmetric = false;
                        break;
                    }
                }
            }
             
            if(symmetric)
            {
                System.out.println("The given Matrix is Symmetric");
            }
            else
            {
                System.out.println("The given Matrix is not Symmetric");
            }
        }

    }
}