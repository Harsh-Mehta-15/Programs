// 22.Print a following patterns

//      1     *********       *********
//     A B     *******        **** ****
//    2 3 4     *****         ***   ***
//   C D E F     ***          **     **
//                *           *       *
class Twenty_two {

    public static void main(String[] args) {
        first_Pattern();
        System.out.println("------------------------------------------------");
        second_Pattern();
        System.out.println("------------------------------------------------");
        third_Pattern();
    }

    static void first_Pattern() {
        int num = 1;
        char ch = 'A';
        for (int i = 0; i < 4; i++) {
            for (int s = 4 - i; s > 0; s--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (i % 2 == 1) {
                    System.out.print(num + " ");
                    num++;
                } else {
                    System.out.print(ch + " ");
                    ch++;
                }
            }
            System.out.println();
        }
    }

    static void second_Pattern() {
        int star = 9;
        for (int i = 1; i <= 5; i++) {
            for (int s = 1; s <= i; s++) {
                System.out.print(" ");
            }
            for (int j = star - 2 * i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void third_Pattern() {
        for (int i = 0; i < 5; i++) {
            //left side
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            //space
            for (int s = 1; s < i * 2; s++) {
                System.out.print(" ");
            }
            //right side
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

/* *********
   **** ****
   ***   ***
   **     **
   *       *
 */
