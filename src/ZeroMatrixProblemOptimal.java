import java.util.Scanner;

public class ZeroMatrixProblemOptimal {
    public int m;
    public int n;
    public int[][] a;

    public ZeroMatrixProblemOptimal(int m, int n){
        this.m=m;
        this.n=n;
        a=new int[m][n];
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
                System.out.print(a[i][j]);
            }
            System.out.println(" ");
        }
    }

    public void addlogic(){
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(a[i][j]==0){
                    a[0][j]=0;
                    a[i][0]=0;
                }
            }
        }

        for(int i=0;i<m;i++){
            if(a[i][0]==0){
                for(int j=1;j<n;j++){
                    a[i][j]=0;
                }
            }
        }

        for(int j=0;j<n;j++){
            if(a[0][j]==0){
                for(int i=1;i<m;i++){
                    a[i][j]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        ZeroMatrixProblemOptimal zb=new ZeroMatrixProblemOptimal(3,4);
        zb.addvalues();
        zb.display();
        zb.addlogic();
        zb.display();
    }
}
