class Alphabets{
    
    public void a(){
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                if ((i==1 && (j>2 && j<4)) || (j%2==0 && i==2) || i==3 || (j==1 && i>2) || (j==5 && i>2)) {
                    System.out.print(".");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void b(){
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                if ((i==1 && j<5) || i==3 || (i==5 && j<5) || j==1 || (j==5 && (i>1 && i<5))) {
                    System.out.print(".");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public void c(){
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                if ((i==1 && j>1) || (i==5 && j>1) || (j==1 && (i>1 && i<5))) {
                    System.out.print(".");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void d(){
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                if (j==1 || (i==1 && j<5) || ((i>1 && i<5) && j==5) || (i==5 && j<5)) {
                    System.out.print(".");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void e(){
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                if (i==1 || i==3 || i==5 || j==1) {
                    System.out.print(".");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void f(){
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                if (i==1 || i==3 || j==1) {
                    System.out.print(".");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void g(){
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                if ((i==1 && j>1) || (j==1 && (i>1 && i<5)) ||(i==5 && j>1) || (j==5 && i>2) || (i==3 && j>2)) {
                    System.out.print(".");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void h(){
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                if (i==3 || j==1 || j==5) {
                    System.out.print(".");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void i(){
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                if (i==1 || i==5 || j==3) {
                    System.out.print(".");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void j(){
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                if (i==1 || (i==5 && j<4) || j==3) {
                    System.out.print(".");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void k(){
        for(int i = 1; i <= 6; i++){
            for (int j = 1; j <= 4; j++) {
                if (j==1 || (j==4 && i==1) || (j==3 && i==2) || (j==2 && i==3) || 
                    (j==2 && i==4) || (j==3 && i==5) || (j==4 && i==6)) {
                    System.out.print(".");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void l(){
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                if (i==5 || j==1) {
                    System.out.print(".");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void m(){
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                if ((i==2 && j%2==0) || (i==3 && j==3) || j==1 || j==5) {
                    System.out.print(".");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void n(){
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                if ((i==2 && j==2) || (i==3 && j==3) || (i==4 && j==4) || j==1 || j==5) {
                    System.out.print(".");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void o(){
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                if (i==1 || i==5 || j==1 || j==5) {
                    System.out.print(".");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void p(){
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                if ((i==1 && j<5) || (i==3 && j<5) || j==1 || (j==5 && i==2)) {
                    System.out.print(".");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void q(){
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                if (i==1 || i==3 || (j==1 && i<4) || (j==4 && i==4) || (j==5 && i!=4)) {
                    System.out.print(".");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void r(){
        for(int i = 1; i <= 7; i++){
            for (int j = 1; j <= 5; j++) {
                if ((i==1 && j<5) || (i==3 && j<5) || j==1 || (j==5 && i==2) || (i==4 && j==2)
                    || (i==5 && j==3) || (i==6 && j==4) || (i==7 && j==5)) {
                    System.out.print(".");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void s(){
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                if (i==1 || (i==2 && j==1) || i==3 || (i==4 && j==5) || i==5) {
                    System.out.print(".");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void t(){
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                if (i==1 || j==3) {
                    System.out.print(".");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void u(){
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                if ((j==1 && i<5)  || (i==5 && (j>1 && j<5)) || (j==5 && i<5)) {
                    System.out.print(".");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void v(){
        for(int i = 1; i <= 3; i++){
            for (int j = 1; j <= 5; j++) {
                if ((i==1 && j%2!=0 && j!=3) || (i==2 && j%2==0) || (i==3 && j==3)) {
                    System.out.print(".");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void w(){
        for(int i = 1; i <= 3; i++){
            for (int j = 1; j <= 7; j++) {
                if ((i==1 && j==1) || (i==1 && j==7) || (i==2 && j%2==0) || 
                    (i==3 && j==3) || (i==3 && j==5)) {
                    System.out.print(".");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void x(){
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                if ((j==1 && i%2!=0 && i!=3) || (j==2 && (i%2==0)) || 
                    (i==3 && j==3) || (j==4 && (i%2==0)) || (j==5 && i%2!=0 && i!=3)) {
                    System.out.print(".");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void y(){
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                if ((j==1 && i%2!=0 && i!=3) || (j==2 && (i%2==0)) || 
                    (i==3 && j==3) || (i==1 && j==5) || (i==2 && j==4)) {
                    System.out.print(".");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void z(){
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                if (i==1 || i==5 || (i==2 && j==4)|| (i==3 && j==3) || (i==4 && j==2)) {
                    System.out.print(".");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}

class Abc{
    public static void main(String[] args) {

        Alphabets abc = new Alphabets();
        abc.a();
        System.out.println("================================");
        abc.b();
        System.out.println("================================");
        abc.c();
        System.out.println("================================");
        abc.d();
        System.out.println("================================");
        abc.e();
        System.out.println("================================");
        abc.f();
        System.out.println("================================");
        abc.g();
        System.out.println("================================");
        abc.h();
        System.out.println("================================");
        abc.i();
        System.out.println("================================");
        abc.j();
        System.out.println("================================");
        abc.k();
        System.out.println("================================");
        abc.l();
        System.out.println("================================");
        abc.m();
        System.out.println("================================");
        abc.n();
        System.out.println("================================");
        abc.o();
        System.out.println("================================");
        abc.p();
        System.out.println("================================");
        abc.q();
        System.out.println("================================");
        abc.r();
        System.out.println("================================");
        abc.s();
        System.out.println("================================");
        abc.t();
        System.out.println("================================");
        abc.u();
        System.out.println("================================");
        abc.v();
        System.out.println("================================");
        abc.w();
        System.out.println("================================");
        abc.x();
        System.out.println("================================");
        abc.y();
        System.out.println("================================");
        abc.z();
        
    }
}