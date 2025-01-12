import java.util.Scanner;

public class ZeroMatrixProbkem_bruteforce {
    private int m; // Number of rows
    private int n; // Number of columns
    private int[][] a;

    public ZeroMatrixProbkem_bruteforce(int m, int n){
        this.m = m;
        this.n = n;
        this.a = new int[m][n];
    }

    public void addvalues(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("adding values iteratively");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=scanner.nextInt();
            }
        }
    }

    public void display(){

        System.out.println("values are");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==-1){
                    a[i][j]=0;
                }
                System.out.print(a[i][j]);
            }
            System.out.println(" ");
        }
    }

    public void zermatrix(){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==0){
                    a[i][j]=-1;
                    makecolumn(j);
                    makerow(i);
                }
            }
        }
    }



    public void makecolumn(int k){
        for(int i=0;i<m;i++){
            a[i][k]=-1;
        }
    }

    public void makerow(int k){
        for(int i=0;i<m;i++){
            a[k][i]=-1;
        }
    }

    public static void main(String[] args) {
        ZeroMatrixProbkem_bruteforce zb= new ZeroMatrixProbkem_bruteforce(3,3);
        zb.addvalues();
        zb.display();
        zb.zermatrix();
        zb.display();
    }

}
