public class pattern{

    public void hollow_rect(int a,int b){
        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= b; j++){
                if(i == 1 || i == a || j == 1 || j == b){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void inverted_tri(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1;j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void inverted_num(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void floyd_tri(int n){
        int counter = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public void bool_tri(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i + j) % 2 == 0){
                    System.out.print(1 + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public void butterfly(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void rhombus(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void hollow_rhom(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n){
        for(int i  = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i  = n; i >= 1; i--){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        pattern ob = new pattern();
        // System.out.println();
        // ob.hollow_rect(4,4);
        // System.out.println();
        // ob.inverted_tri(5);
        // System.out.println();
        // ob.inverted_num(6);
        // System.out.println();
        // ob.floyd_tri(5);
        // System.out.println();
        // ob.bool_tri(5);
        // System.out.println();
        ob.butterfly(4);
        // System.out.println();
        // ob.rhombus(5);
        // System.out.println();
        // ob.hollow_rhom(5);
        // System.out.println();
        // ob.diamond(4);
    }
}