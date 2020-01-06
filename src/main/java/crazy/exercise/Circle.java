package crazy.exercise;

import static java.lang.Math.sqrt;

    /**
     * 1.定义圆半径为int r;（r的值较大如果为1的话那么中心点为（1，1））
     * 2.那么员的中心点坐标为（r，r）那么圆将坐落在起始点为（0，0）终点为（2r，2r）的正方形内；
     * 3.由于是近似圆我们只需要将下标离圆心的距离的值开方然后开方的值保存为b
     * 4.b-r的绝对值保存为d，如果d<0.1(数值越小越精确)那么将i j下标所在的数组值赋为*否则设置为空格。
     * 5.注意输出时候行有间距所以在行打印 空格时候要多空几格子选择为4
     */
//自己写的代码
    public class Circle {

        int r = 20;

        public void print() {

            for (int i = 0; i < 2 * r + 1; i++) {
                for (int j = 0; j < 2 * r + 1; j++) {
                    double b = sqrt((i - r) * (i - r) + (j - r) * (j - r));
                    double d = Math.abs(b - r);
                    if (d < 0.01) {

                        System.out.print('*');

                    } else {
                        System.out.print("    ");
                    }

                }
                System.out.println(" ");
            }

        }

        public static void main(String[] args) {
            Circle c = new Circle();
            c.print();
        }

    }


/*
//网上白嫖代码
public class circle {
    public static void main(String[] args) {
        int r = 30;
        for (int y = 0; y <= 2 * r; y += 2) {
            long x = Math.round(r - Math.sqrt(2 * r * y - y * y));
            long longLength = 2 * (r - x);

            for (int i = 0; i <= x; i++) {
                System.out.print(' ');
            }
            System.out.print('*');

            for (int j = 0; j <= longLength; j++) {
                System.out.print(" ");
            }
            System.out.println('*');
        }
    }
*/


