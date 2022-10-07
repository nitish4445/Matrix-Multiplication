import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main4{
    public static void main (String[] args) {
                      // Your code here
    Scanner in=new Scanner(System.in);
    int M=in.nextInt();
    int N=in.nextInt();
    int P=in.nextInt();
    int a[][]=new int[M][N];
    int b[][]=new int[N][P];
    int c[][]=new int[M][P];
    for(int i=0;i<M;i++){
        for(int j=0;j<N;j++){
            a[i][j]=in.nextInt();
        }
    }
    for(int j=0;j<N;j++){
        for(int k=0;k<P;k++){
            b[j][k]=in.nextInt();
        }
    }
    for(int i=0;i<M;i++){
        for(int j=0;j<N;j++){
            for(int k=0;k<P;k++){
                c[i][k]=c[i][k]+(a[i][j]*b[j][k]);
            }
        }
    }
    for(int i=0;i<M;i++){
        for(int k=0;k<P;k++){
            System.out.print(c[i][k]+" ");
        }
        System.out.println();
    }
    }
}